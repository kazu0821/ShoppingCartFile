package com.example.shoppingcartnew;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {


    /* This is declaring the text data value,
    and this textview will show up the apps place.  */

    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView txt4;
    TextView txt5;
    TextView txt6;
    TextView txt7;
    TextView txt8;
    TextView txt9;
    TextView txt10;
    TextView txt11;

    TextView price1;
    TextView price2;
    TextView price3;
    TextView price4;
    TextView price5;
    TextView price6;
    TextView price7;
    TextView price8;
    TextView price9;
    TextView price10;
    TextView price11;


    Button btnCheckout;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        /*
        This parameter will calculate how much user bought each product,
         and calculate tax and shipping cost and show up the total cost fee in this parameter
        *
        * */
        setContentView(R.layout.activity_detail);

        Intent it=getIntent();

        int val[]=it.getIntArrayExtra("values");

        btnCheckout=findViewById(R.id.button2);


        for(int i=0;i<val.length;i++)
        {
            Log.w("Activity","Values: "+val[i]);
        }

        txt1=findViewById(R.id.textView10);
        txt1.setText(val[0]+"");

        txt2=findViewById(R.id.textView11);
        txt2.setText(val[1]+"");

        txt3=findViewById(R.id.textView12);
        txt3.setText(val[2]+"");

        txt4=findViewById(R.id.textView3);
        txt4.setText(val[3]+"");

        txt5=findViewById(R.id.textView22);
        txt5.setText(val[4]+"");

        txt6=findViewById(R.id.textView26);
        txt6.setText(val[5]+"");

        txt7=findViewById(R.id.textView29);
        txt7.setText(val[6]+"");

        txt8=findViewById(R.id.textView39);
        txt8.setText(val[7]+"");

        txt9=findViewById(R.id.textView42);
        txt9.setText(val[8]+"");

        txt10=findViewById(R.id.textView47);
        txt10.setText(val[9]+"");



        price1 = findViewById(R.id.textView13);
        price1.setText("$"+val[0] *1.29 +"");

        price2 = findViewById(R.id.textView14);
        price2.setText("$"+val[1] *2.34 +"");

        price3 = findViewById(R.id.textView15);
        price3.setText("$"+val[2] *1.15 +"");

        price4 = findViewById(R.id.textView9);
        price4.setText("$"+val[3] *1.49 +"");

        price5 = findViewById(R.id.textView24);
        price5.setText("$"+val[4] *1.17 +"");

        price6 = findViewById(R.id.textView27);
        price6.setText("$"+val[5] *2.45 +"");

        price7 = findViewById(R.id.textView30);
        price7.setText("$"+val[6] *3.25 +"");

        price8 = findViewById(R.id.textView40);
        price8.setText("$"+val[7] *2.31 +"");

        price9 = findViewById(R.id.textView43);
        price9.setText("$"+val[8] *0.98 +"");


        price10 = findViewById(R.id.textView48);
        price10.setText("$"+val[8] *1.23 +"");


        //total = findViewById(R.id.textView17);




        btnCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1=new Intent(getApplicationContext(),checkoutActivity.class);


                // I think I can change this part

                float tomato = Float.parseFloat(price1.getText().toString().substring(1));
                float peach = Float.parseFloat(price2.getText().toString().substring(1));
                float squash = Float.parseFloat(price3.getText().toString().substring(1));
                float orange = Float.parseFloat(price4.getText().toString().substring(1));
                float apple = Float.parseFloat(price5.getText().toString().substring(1));

                float grape = Float.parseFloat(price6.getText().toString().substring(1));
                float watermelon = Float.parseFloat(price7.getText().toString().substring(1));

                float lemon = Float.parseFloat(price8.getText().toString().substring(1));
                float strawberry= Float.parseFloat(price9.getText().toString().substring(1));

                float banana =Float.parseFloat(price10.getText().toString().substring(1));

                Log.w("Activity","Data1: ");

                float total= (tomato + peach+ squash+ orange+ apple+ grape + watermelon+ lemon + strawberry+ banana);
                it1.putExtra("total",total);
                Log.w("Activity","Data1: "+total);
                startActivity(it1);
            }
        });

        //total.setText("$"+(tomato + peach+ squash+ orange+ apple)+"");

    }
}
