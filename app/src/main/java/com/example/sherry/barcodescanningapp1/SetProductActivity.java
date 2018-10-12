package com.example.sherry.barcodescanningapp1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SetProductActivity extends AppCompatActivity implements View.OnClickListener {

    private String scanContent;
    private Button button_add;
    private TextView contentTxt, prodName;
    private EditText prod_amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_product);

        contentTxt = findViewById(R.id.scan_content);
        prodName = findViewById(R.id.prodName);
        prod_amount = findViewById(R.id.prod_amount);
        button_add = findViewById(R.id.button_add);
        button_add.setOnClickListener(this);

        Bundle extras = getIntent().getExtras();
        scanContent = extras.getString("content");

        // create the table for setting the amount of product it has
        contentTxt.setText("CONTENT: " + scanContent);
//        prodName.setText("Product: ") // add the product name getting from db

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.button_add){
            Context context = getApplicationContext();
            CharSequence text = "Hello toast! you added sth";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
}