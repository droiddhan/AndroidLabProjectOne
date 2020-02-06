package com.teczeta.veltech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etPhone, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPhone = findViewById(R.id.etPhone);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phone, password;

                phone = etPhone.getText().toString();
                password = etPassword.getText().toString();


                if (!phone.isEmpty() && !password.isEmpty()) {

                    if (phone.equalsIgnoreCase("9876543210") && password.equalsIgnoreCase("password")) {


                        Intent intent = new Intent(MainActivity.this, SuccessActivity.class);
                        startActivity(intent);

                    } else {

                        //Clear Both Phone and Password fields
                        etPhone.setText("");
                        etPassword.setText("");

                        //Move cursor to phone fiels
                        etPhone.requestFocus();

                        Toast.makeText(MainActivity.this, "Pls Enter Correct Phone and Password", Toast.LENGTH_SHORT).show();


                    }

                } else {
                    Toast.makeText(MainActivity.this, "Pls Enter Phone and Password", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
