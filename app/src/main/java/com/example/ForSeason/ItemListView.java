package com.example.ForSeason;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;

public class ItemListView extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list_view);

        ListView listView = findViewById(R.id.itemViewList);

        //ItemListAdapter itemListAdapter = new ItemListAdapter(getApplicationContext()); what is it?
        StockAdapter adapter = new StockAdapter();
        // adapter.addItem("")
        listView.setAdapter(adapter);

    }

    class StockAdapter extends BaseAdapter {

        ArrayList<ItemList> itemLists = new ArrayList<ItemList>();

        @Override
        public int getCount() {
            return itemLists.size();
        }

        public void addItem(ItemList itemList) {
            itemLists.add(itemList);
        }

        @Override
        public Object getItem(int position) {
            return itemLists.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
            //itemList.getItemName(position);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup viewGroup) {
            ItemListAdapter view = new ItemListAdapter(getApplicationContext());

            ItemList item = itemLists.get(position);
            view.setName(item.getItemName());
            view.setChange(item.getItemChange());
            view.setPrice(item.getItemPrice());
            view.setSeason(item.getItemSeason());

            return view;
        }
    }
}
