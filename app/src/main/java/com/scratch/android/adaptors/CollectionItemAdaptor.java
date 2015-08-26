package com.scratch.android.adaptors;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;
import com.scratch.android.R;
import com.scratch.android.model.ItemResult;
import com.scratch.android.model.Product;
import com.squareup.picasso.Picasso;

import java.util.List;


public class CollectionItemAdaptor extends ArrayAdapter<ItemResult> {
    private LayoutInflater mInflater;
    private final Context mContext;

    public CollectionItemAdaptor(Context context) {
        super(context, 0);
        mContext = context;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        Holder holder;

        ItemResult item = getItem(position);
        final Product product = item.getProduct();

        if (view == null) {
            view = mInflater.inflate(R.layout.collection_item_row, parent, false);

            holder = new Holder();
            holder.name = (TextView) view.findViewById(R.id.name);
            holder.brand = (TextView) view.findViewById(R.id.brand);
            holder.photo = (ImageView) view.findViewById(R.id.photo);
            holder.photos = (SliderLayout) view.findViewById(R.id.photos);

            holder.brand.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String url = product.getUrl();
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    mContext.startActivity(i);
                }
            });

            view.setTag(holder);
        } else {
            holder = (Holder) view.getTag();
        }

        holder.name.setText(product.getName());
        holder.brand.setText(product.getBrand());

        List<String> photos = product.getPhotos();
        if (photos.size() == 1) {
            Picasso.with(mContext)
                    .load(photos.get(0))
                    .fit().centerCrop()
                    .into(holder.photo);
            holder.photo.setVisibility(View.VISIBLE);
            holder.photos.setVisibility(View.GONE);
        } else {
            holder.photos.removeAllSliders();
            for (String photo : product.getPhotos()) {
                DefaultSliderView slider = new DefaultSliderView(mContext);
                slider.image(photo).setScaleType(BaseSliderView.ScaleType.CenterCrop);
                holder.photos.addSlider(slider);
            }
            holder.photo.setVisibility(View.GONE);
            holder.photos.setVisibility(View.VISIBLE);
        }

        return view;
    }


    private static final class Holder {
        public ImageView photo;
        public SliderLayout photos;
        public TextView name;
        public TextView brand;
    }
}
