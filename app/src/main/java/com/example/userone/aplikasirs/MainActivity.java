package com.example.userone.aplikasirs;



import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static Main4Activity ma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("LogActivity", "onCreate");

        Button bt1 = (findViewById(R.id.button1));
        Button bt2 = (findViewById(R.id.button2));
        Button bt6 = (findViewById(R.id.button6));

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Click!", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), Main4Activity.class);
                startActivity(i);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Main3Activity.class);
                i.putExtra("Value1", "Aplikasi  Ini Merupakan Aplikasi Pencarian Rumah Sakit, di kerjakan untuk memenuhi Tugas Kuliah Pemrograman Mobile ");
                i.putExtra("Value2", "Mohon Maaf jikalau Program ini belum berfungsi Sebagaimana mestinya. Karena Programmer Juga Manusia :) ");
                startActivity(i);
            }
        });


        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Click!", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(i);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LogActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LogActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LogActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LogActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LogActivity", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("LogActivity", "onRestart");
    }
}
