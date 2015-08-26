package com.scratch.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.scratch.android.adaptors.CollectionAdaptor;
import com.scratch.android.api.ApiClient;
import com.scratch.android.auth.TokenService;
import com.scratch.android.model.Collection;
import com.scratch.android.model.MeResult;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class CollectionsActivity extends ActionBarListActivity implements AdapterView.OnItemClickListener {

    private ApiClient.ScratchApiService scratchService;
    private CollectionAdaptor collectionAdaptor;
    private ListView mainListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collections);
        mainListView = getListView();

        scratchService = ApiClient.getsScratchApiService();
        collectionAdaptor = new CollectionAdaptor(this);
        mainListView.setAdapter(collectionAdaptor);
        mainListView.setOnItemClickListener(this);
        getCollections();
    }

    private void getCollections() {
        Callback callback = new Callback<MeResult>() {
            @Override
            public void success(MeResult me, Response response) {
                collectionAdaptor.addAll(me.getCollections());
            }

            @Override
            public void failure(RetrofitError retrofitError) {
                // TODO: Handle me, please
            }
        };
        scratchService.me(callback);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_collection, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_logout) {
            TokenService.getInstance().clearToken();
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Collection collection = collectionAdaptor.getItem(position);
        final Intent collectionIntent = new Intent(this, CollectionActivity.class);
        collectionIntent.putExtra("collection", collection);
        startActivity(collectionIntent);
    }
}
