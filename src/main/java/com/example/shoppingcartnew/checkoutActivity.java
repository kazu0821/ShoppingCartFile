package com.example.shoppingcartnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class checkoutActivity extends AppCompatActivity {
    private static final String TAG = "SAM";
    Thread Thread1 = null;
    Socket socket;
    PrintWriter output;
    InputStreamReader in;
    BufferedReader br;


    Button submit_Button;


    TextView sub;
    TextView shipping;
    TextView tax;
    public TextView sum;
    TextView messageLog_TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        Intent it = getIntent();

        float subtotal;
        subtotal = it.getExtras().getFloat("total");

        Log.d("Activity", "DataStream: " + subtotal);

        sub = findViewById(R.id.textView28);

        shipping = findViewById(R.id.textView34);
        tax = findViewById(R.id.textView35);

        float Tax = (float) (subtotal * 0.075);

        sum = findViewById(R.id.textView37);


        messageLog_TextView = findViewById(R.id.messageLog_TextView);


        sub.setText("$" + subtotal + "");
        shipping.setText("$20");
        tax.setText("$" + Tax + "");
        float total = (float) (subtotal + (Tax) + 20.0);

        sum.setText("$" + total + "");


        submit_Button = findViewById(R.id.submit_Button);

        submit_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Thread1 = new Thread(new Thread1());
                //Thread1.start();

                 Intent smsIntent = new Intent( getApplicationContext(), Client.class);
                 smsIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); 
                smsIntent.putExtra("Total", sum.getText() );

                 getApplication().startActivity(smsIntent);

            }
        });


    }

//    String outMessage;
//
//    /**
//     * Creates socket connection with server.
//     */
//    class Thread1 implements Runnable {
//        public void run() {
//            try {
//                // socket = new Socket("10.0.0.124", 7000);/
//                socket = new Socket("134.154.18.45", 7000);// school
//                output = new PrintWriter(socket.getOutputStream(), true);
//                in = new InputStreamReader(socket.getInputStream());
//                br = new BufferedReader(in);
//                final String message = br.readLine();
//                final String newMessage = message.replaceAll("▼", "\n");
//
//
//                runOnUiThread(new Runnable()
//                {
//                    @Override
//                    public void run() {
//                        Log.i( TAG, "1");
//                        messageLog_TextView.setText( newMessage );
//                        Log.i( TAG, "2");
//
//
//                        outMessage = sum.getText().toString().trim();
//
//                        Log.i(TAG, outMessage );
//
//
//                    }
//
//
//
//                    //  socket.close();
//
//                });
//            }
//            //
//            catch (IOException e) {
//                e.printStackTrace();
//            }
//
//
//
//                                  output.println( outMessage );
//
//
//            Log.i(TAG, "4: " + outMessage);
//
//        }
//
//
//    }
}
