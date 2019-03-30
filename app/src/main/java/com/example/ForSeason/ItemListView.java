package com.example.ForSeason;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ItemListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list_view);

        ListView listView = findViewById(R.id.itemViewList);


    }

    class StockAdapter extends BaseAdapter {

        ArrayList<ItemList> itemList = new ArrayList<ItemList>();

        @Override
        public int getCount() {
            return itemList.size();
        }

        @Override
        public Object getItem(int position) {
            return itemList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
            //itemList.getItemName(position);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup viewGroup) {
            return null;
        }
    }
}
