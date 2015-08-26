package com.scratch.android;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.widget.ListView;

import com.scratch.android.adaptors.CollectionItemAdaptor;
import com.scratch.android.api.ApiClient;
import com.scratch.android.model.Collection;
import com.scratch.android.model.ItemResult;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class CollectionActivity extends ActionBarListActivity {

    private ApiClient.ScratchApiService scratchService;
    private CollectionItemAdaptor collectionItemAdaptor;
    private ListView mainListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);
        Collection collection = getIntent().getParcelableExtra("collection");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(collection.getTitle());
        actionBar.setDisplayHomeAsUpEnabled(true);

        scratchService = ApiClient.getsScratchApiService();

        mainListView = getListView();
        scratchService = ApiClient.getsScratchApiService();
        collectionItemAdaptor = new CollectionItemAdaptor(this);
        mainListView.setAdapter(collectionItemAdaptor);
        getCollectionItems(collection.getId());
    }

    private void getCollectionItems(String id) {
        JSONObject jo = new JSONObject();
        try {
            jo.put("_collection", id);
            String jsonCondition = jo.toString();
            Callback callback = new Callback<List<ItemResult>>() {
                @Override
                public void success(List<ItemResult> items, Response response) {
                    collectionItemAdaptor.addAll(getRecommendations(items));
                }

                @Override
                public void failure(RetrofitError retrofitError) {
                    // TODO: Handle me, please
                }
            };
            scratchService.collectionItems(jsonCondition, callback);
        } catch (JSONException e) {
        }
    }

    private List<ItemResult> getRecommendations(List<ItemResult> items) {
        List<ItemResult> recommendations = new ArrayList<>();
        for (ItemResult item : items) {
            if (item.getType().equals("recommendation")) {
                recommendations.add(item);
            }
        }
        return recommendations;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

}
