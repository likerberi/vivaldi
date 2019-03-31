package com.example.ForSeason;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ItemListAdapter extends LinearLayout {

    TextView nameText, priceText, changeText, seasonText;

    public ItemListAdapter(Context context) {
        super(context);

        init(context);
    }

    // when generating view, default generators are two.
    public ItemListAdapter(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    private void init(Context context) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.stock_item, this, true);
        // inflating == 참조

        nameText = findViewById(R.id.nameText);
        priceText = findViewById(R.id.priceText);
        changeText = findViewById(R.id.changeText);
        seasonText = findViewById(R.id.seasonText);

    }

    public void setName(String text){
        nameText.setText(text);
    }

    public void setPrice(String price){
        priceText.setText(price);
    }

    public void setChange(String change){
        changeText.setText(change);
    }

    public void setSeason(String text){
        seasonText.setText(text);
    }
}
