package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;
    String correct_edemail = "febriyanti@gmail.com";
    String correct_edpassword = "behappy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnLogin dengan componen button pada layout
        btnLogin=findViewById(R.id.btSignIn);

        //Menghubungkan variabel edemail dengan componen button pada layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variabel edPassword dengan componen button pada layout
        edpassword=findViewById(R.id.edPassword);

        //Membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menyimpan input user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();

                //Menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                //Membuat validasi Login inputan user
                if(nama.equals(correct_edemail) && (password.equals(correct_edpassword))){
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();
                }
                else if (nama.equals(correct_edemail)){
                    Toast.makeText(getApplicationContext(), "Password Salah", Toast.LENGTH_SHORT).show();
                }
                else if (password.equals(correct_edpassword)){
                    Toast.makeText(getApplicationContext(), "Email Salah", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Email dan Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}