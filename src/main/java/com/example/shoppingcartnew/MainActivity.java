package com.example.shoppingcartnew;

/* This class file is labeling the fruits and vegetable pictutes.
* I can change the the name of product and price in here.
* */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MainActivity extends AppCompatActivity
{



    /* declaring the title
    * and how much it will cost every product.
    * And show up the picture*/

    Button btn;
    EditText txt1;

    ListView list;

    String[] maintitle ={
            //This main tile will be the name of product
            "Peach",
            "Tomato",
            "Squash",
            "Orange",
            "Apple",



           "Grape",
            "W.Melon",
            "Lemon",
            "StrawBerry",
            "Banana"

    };

    String[] subtitle ={
            "$2.34",//peach
            "$1.29",//tomato
            "$1.15",//squash
            "$1.49",//orange
            "$1.17",//apple



            "$2.45",//Grape
            "$3.25",//watermelon
            "$2.31",//lemon
            "$0.98",//Starwberry
            "$1.23" //Banana

    };

    Integer[] imgid={
            R.drawable.peach,
            R.drawable.tomato,
            R.drawable.squash,
            R.drawable.orange,
            R.drawable.apple,

            R.drawable.grape,
            R.drawable.watermelon,
            R.drawable.lemon,
            R.drawable.strawberry,
            R.drawable.banana


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        btn=(Button)findViewById(R.id.button);
        list.setItemsCanFocus(true);
        //list.setDescendantFocusability(ViewGroup.FOCUS_AFTER_DESCENDANTS);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                /* This if else statement will judge the position place. if this position number were equal,
                  These condition statement will implement*/
               if(position == 0)


                {
                    //code specific to first list item
                    Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 1)
                {
                    //code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 2)
                {

                    //code specific to 3rd list item
                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3)
                {

                    //code specific to 4th list item
                    Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) //Apple
                {

                    //code specific to 5thlist item
                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }


                else if(position == 5) //Grape
                {

                    //code specific to 6th list item
                    Toast.makeText(getApplicationContext(),"Place Your Sixth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 6)
                {

                    //code specific to 6th list item
                    Toast.makeText(getApplicationContext(),"Place Your Seventh Option Code",Toast.LENGTH_SHORT).show();
                }
                              else if(position == 7)
               {

                   //code specific to 7th list item
                   Toast.makeText(getApplicationContext(),"Place Your Eighth Option Code",Toast.LENGTH_SHORT).show();
               }
               else if(position == 8)
               {

                   //code specific to 8th list item
                   Toast.makeText(getApplicationContext(),"Place Your Nineth Option Code",Toast.LENGTH_SHORT).show();
               }
               else if(position == 9)
               {

                   //code specific to 9th list item
                   Toast.makeText(getApplicationContext(),"Place Your Tenth Option Code",Toast.LENGTH_SHORT).show();
               }

               else if(position == 10)
               {

                   //code specific to 10th list item
                   Toast.makeText(getApplicationContext(),"Place Your Eleventh Option Code",Toast.LENGTH_SHORT).show();
               }


               else if(position ==11)
               {

                   //code specific to 7th list item
                   Toast.makeText(getApplicationContext(),"Place Your Eighth Option Code",Toast.LENGTH_SHORT).show();
               }
               else if(position == 12)
               {

                   //code specific to 8th list item
                   Toast.makeText(getApplicationContext(),"Place Your Nineth Option Code",Toast.LENGTH_SHORT).show();
               }
               else if(position == 13)
               {

                   //code specific to 9th list item
                   Toast.makeText(getApplicationContext(),"Place Your Tenth Option Code",Toast.LENGTH_SHORT).show();
               }

               else if(position == 14)
               {

                   //code specific to 10th list item
                   Toast.makeText(getApplicationContext(),"Place Your Eleventh Option Code",Toast.LENGTH_SHORT).show();
               }

               else if(position == 15)
               {

                   //code specific to 7th list item
                   Toast.makeText(getApplicationContext(),"Place Your Eighth Option Code",Toast.LENGTH_SHORT).show();
               }
               else if(position == 16)
               {

                   //code specific to 8th list item
                   Toast.makeText(getApplicationContext(),"Place Your Nineth Option Code",Toast.LENGTH_SHORT).show();
               }
               else if(position == 17)
               {

                   //code specific to 9th list item
                   Toast.makeText(getApplicationContext(),"Place Your Tenth Option Code",Toast.LENGTH_SHORT).show();
               }

               else if(position == 18)
               {

                   //code specific to 10th list item
                   Toast.makeText(getApplicationContext(),"Place Your Eleventh Option Code",Toast.LENGTH_SHORT).show();
               }





            }
        });

        btn.setOnClickListener(new View.OnClickListener() {


            /*  This parameter is responding on clickonLisner.
            * When user clicked on place order button, this for loop  will cout hiw many value user wants to buy.
            * This result will go to startActivity
            */
            @Override
            public void onClick(View v)
            {
                Intent it=new Intent(getBaseContext(),DetailActivity.class);

                int val[]=new int[list.getCount()];

                for(int i=0;i<list.getCount();i++)
                {
                    View view=list.getChildAt(i);
                    txt1=view.findViewById(R.id.quantity);

                    int a=Integer.parseInt(String.valueOf(txt1.getText()));
                    val[i]=a;

                    //Log.w("Activity","Values: "+val[i]);
                }

                it.putExtra("values",val);
                startActivity(it);

            }
        });


    }

}
