package com.teczeta.veltech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Dhan "+"OnCreate");
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Dhan "+"OnStart");

        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Dhan "+"OnResume");

        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this, "OnRestart", Toast.LENGTH_SHORT).show();

    }
}
