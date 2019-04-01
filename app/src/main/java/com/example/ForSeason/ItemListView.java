package com.example.ForSeason;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class ItemListView extends AppCompatActivity {

    private DatabaseReference mDatabase;
    private FirebaseUser user;
    private Button editBtn, sortBtn, addBtn;

    StockAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list_view);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        ListView listView = findViewById(R.id.itemViewList);
        addBtn = findViewById(R.id.addBtn);

        addBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // TO-DO ::
            }
        });

        //ItemListAdapter itemListAdapter = new ItemListAdapter(getApplicationContext()); what is it?
        adapter = new StockAdapter();
        // adapter.addItem("")
        adapter.addItem(new ItemList("Dow 30", "23755.10", "-0.51%", "Winter"));
        //writeNewItem("Dow 30", "23755.10", "-0.51%", "Winter");
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //FrameLayout?
                //GridLayout?
                //adapter.notifyDataSetChanged();
            }
        });

    }

    private void writeNewItem(String itemName, String itemPrice, String itemChange, String itemSeason) {
        ItemList itemList = new ItemList(itemName, itemPrice, itemChange, itemSeason);

        mDatabase.child("items").setValue(itemList);
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
            ItemListAdapter view = null;
            // res waste!

            if(convertView == null) {
                view =  new ItemListAdapter(getApplicationContext());
            } else {
                view = (ItemListAdapter) convertView;
            }

            ItemList item = itemLists.get(position);
            view.setName(item.getItemName());
            view.setChange(item.getItemChange());
            view.setPrice(item.getItemPrice());
            view.setSeason(item.getItemSeason());

            return view;
        }
    }
}
