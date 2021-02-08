package com.example.sharedprefrences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv_Name,tv_Birth;
    Button show_but;
    SharedPreferences sp;
    public final String name_Key = "name";
    public final String birth_Key = "birth";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv_Name = findViewById(R.id.showname_tv);
        tv_Birth = findViewById(R.id.birth_tv);
        sp  =getSharedPreferences("myPrefs",MODE_PRIVATE);

        show_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Name.setText(sp.getString(name_Key,"NO NAME"));
                tv_Birth.setText(sp.getString(birth_Key,"NO BIRTHDAY"));

            }
        });
    }
}