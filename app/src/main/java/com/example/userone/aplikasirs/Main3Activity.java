package com.example.userone.aplikasirs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView tx1 = findViewById(R.id.textViewIntent1);
        TextView tx2 = findViewById(R.id.textViewIntent2);

        Bundle extras = getIntent().getExtras();
        String val1 = extras.getString("Value1");
        String val2 = extras.getString("Value2");

        tx1.setText( ""+val1);
        tx2.setText(""+val2);
    }
}

