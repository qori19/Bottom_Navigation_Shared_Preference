package com.example.bottom_navigation_shared_preference;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.SharedPreferences;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity {
    EditText etUsername, etPassword;
    Button btnKirim;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    String user,pass;
    Boolean savelogin;
    Toolbar toolbar;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.username);
        etPassword = findViewById(R.id.password);
        btnKirim = findViewById(R.id.btn_login);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        editor = sharedPreferences.edit();
        editor.putBoolean("savelogin",true);
        editor.apply();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Login");

        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = etUsername.getText().toString();
                String pass = etPassword.getText().toString();
                if(user.equals("admin")&& pass.equals("admin")){
                    Toast.makeText(MainActivity.this,"LOGIN BERHASIL",Toast.LENGTH_LONG).show();
                    editor = sharedPreferences.edit();
                    editor.putString("logged","logged");
                    editor.commit();
                    savelogin = sharedPreferences.getBoolean("savelogin",false);
                    if (savelogin==true) {
                        Intent a = new Intent(getApplicationContext(),SecondActivity.class);
                        a.putExtra("username", user);
                        a.putExtra("password", pass);
                        startActivity(a);
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Username atau Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
