package com.example.ForSeason;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class CenterMakingActivity extends AppCompatActivity {

    TableLayout tables;
    private Button editButton, addButton, sortButton;

    String[] sampleTitles = {"DOW", "S&P", "NASDAQ", "CRUDE_OIL", "GOLD", "SILVER", "EUR/USD", "10Yr_BOND", "VIX", "USD/JPY", "APPLE"};

    private Context context = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_center);

        context = getApplicationContext();
        tables = findViewById(R.id.tables);

        editButton = findViewById(R.id.editButton);
        addButton = findViewById(R.id.addButton);
        sortButton = findViewById(R.id.sortButton);

        editButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // making a pop-up to input the "NAME"
                // TableRow tableRow = new TableRow(CenterMakingActivity.this);
                                                    // there are 2 xml files...
                // Create a new table row.
                TableRow tableRow = new TableRow(context);

                // Set new table row layout parameters.
                TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT);
                tableRow.setLayoutParams(layoutParams);

                // Add a TextView in the first column.
                TextView textView = new TextView(context);
                textView.setText("This is the ");
                tableRow.addView(textView, 0);

                // Add a button in the second column
                Button button = new Button(context);
                button.setText("New Row");
                tableRow.addView(button, 1);

                tables.addView(tableRow);
            }
        });

        /*
        for(int idx=0; idx<samples.length; idx++) {
            TableRow sample1 = new TableRow(CenterMakingActivity.this);
            sample1.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT));
            tables.addView(sample1);

            TextView tempText = new TextView(CenterMakingActivity.this);
            TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(
                    TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT);
            tempText.setLayoutParams(layoutParams);
            tempText.setText(samples[idx]);
            sample1.addView(tempText);
        }
        */

    }
}
