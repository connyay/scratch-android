package com.scratch.android.adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.scratch.android.R;
import com.scratch.android.model.Collection;
import com.scratch.android.model.Shopper;
import com.squareup.picasso.Picasso;


public class CollectionAdaptor extends ArrayAdapter<Collection> {
    private LayoutInflater mInflater;
    private final Context mContext;

    public CollectionAdaptor(Context context) {
        super(context, 0);
        mContext = context;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        Holder holder;

        if (view == null) {
            view = mInflater.inflate(R.layout.collection_row, parent, false);

            holder = new Holder();
            holder.title = (TextView) view.findViewById(R.id.title);
            holder.shopper = (TextView) view.findViewById(R.id.shopper);
            holder.image = (ImageView) view.findViewById(R.id.image);
            holder.shopperImage = (ImageView) view.findViewById(R.id.shopper_img);

            view.setTag(holder);
        } else {
            holder = (Holder) view.getTag();
        }

        Collection collection = getItem(position);
        Shopper shopper = collection.getShopper();

        holder.title.setText(collection.getTitle());
        Picasso.with(mContext)
                .load(collection.getImage())
                .fit()
                .centerCrop()
                .into(holder.image);

        holder.shopper.setText(shopper.getFirstName());
        Picasso.with(mContext)
                .load(shopper.getImage())
                .fit()
                .centerCrop()
                .into(holder.shopperImage);
        return view;
    }


    private static final class Holder {
        public ImageView image;
        public TextView title;
        public TextView shopper;
        public ImageView shopperImage;
    }
}
