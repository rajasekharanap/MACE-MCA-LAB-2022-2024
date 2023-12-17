package com.example.birthdaycards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView i;
    Button b;
    LinearLayout l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i=findViewById(R.id.img3);
        b=findViewById(R.id.b1);
        l=findViewById(R.id.ll1);
        i.setOnClickListener(this);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.img3){
            i.setVisibility(View.GONE);
            l.setVisibility(View.VISIBLE);
        }
        else if(view.getId()==R.id.b1){
            i.setVisibility(View.VISIBLE);
            l.setVisibility(View.GONE);
        }

    }
}