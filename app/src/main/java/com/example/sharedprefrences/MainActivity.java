package com.example.sharedprefrences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sp;
    SharedPreferences.Editor edit;
    Button logbut;
    EditText et_name, et_birth;
    public final String name_Key = "name";
    public final String birth_Key = "birth";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_name = findViewById(R.id.name_et);
        et_birth = findViewById(R.id.birth_et);
        sp  =getSharedPreferences("myPrefs",MODE_PRIVATE);
        edit = sp.edit();
        logbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = et_name.getText().toString();
                String birth = et_birth.getText().toString();
                edit.putString(name_Key,name);
                edit.putString(birth_Key,birth);
                edit.apply();
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);


            }
        });

    }
}