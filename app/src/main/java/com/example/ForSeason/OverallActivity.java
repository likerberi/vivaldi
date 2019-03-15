package com.example.ForSeason;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class OverallActivity extends AppCompatActivity {

    TableLayout tables;
    private Button editButton, addButton, sortButton;

    String[] sampleTitles = {"DOW_30", "S&P_500", "NASDAQ", "CRUDE_OIL", "GOLD", "SILVER", "EUR/USD", "10Yr_BOND", "VIX", "USD/JPY", "APPLE"};

    String[] forSeasons = {"Spring", "Summer", "Autumn", "Winter"};
    private Context context = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overall);

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

                // AlertDialog

                // Create a new table row.
                final TableRow tableRow = new TableRow(context);

                // Set new table row layout parameters.
                TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT);
                tableRow.setLayoutParams(layoutParams);

                // Add a TextView in the first column.
                final TextView itemView = new TextView(context);

                // Add a button in the second column
//                Button button = new Button(context);
//                button.setText("New Row");
//                tableRow.addView(button, 1);
                //android.R.style.Theme_Holo_DialogWhenLarge_NoActionBar
                AlertDialog.Builder repeatDialog = new AlertDialog.Builder(OverallActivity.this, android.R.style.Widget_Material);
                repeatDialog.setTitle("Item Select").setItems(sampleTitles, new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        itemView.setText(sampleTitles[i]);
                        itemView.setTextSize(20);
                        itemView.setPadding(5, 2, 0, 0);

                        //repeatShow.setGravity(Gravity.END);
                    }
                }).show();



                EditText priceText = new EditText(context);
                priceText.setInputType(InputType.TYPE_CLASS_NUMBER);
                if (priceText.getText() != null) {
                   priceText.setBackground(null);
                }

                EditText changeText = new EditText(context);
                changeText.setInputType(InputType.TYPE_CLASS_NUMBER);
                if (changeText.getText() != null) {
                    changeText.setBackground(null);
                }

                final TextView seasonView = new TextView(context);

                seasonView.setBackground(getResources().getDrawable(R.drawable.equalizer));

                tableRow.addView(itemView, 0);
                tableRow.addView(priceText, 1);
                tableRow.addView(changeText, 2);
                tableRow.addView(seasonView, 3);

                seasonView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AlertDialog.Builder repeatDialog = new AlertDialog.Builder(OverallActivity.this, android.R.style.Widget_Material);
                        repeatDialog.setTitle("Season Select").setItems(forSeasons, new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                seasonView.setText(forSeasons[i]);
                                seasonView.setTextSize(20);
                                seasonView.setBackground(null);


                                //repeatShow.setGravity(Gravity.END);
                            }
                        }).show();
                    }
                });

                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        tables.setColumnStretchable(tables.indexOfChild(view) ,true);
                        // need other layout...  intent -> intent?
                    }
                });

                //tables.setColumnStretchable();
                tables.addView(tableRow);

                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
            }
        });
    }
}
