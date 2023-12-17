package com.example.a3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView name,email;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sp=getSharedPreferences("MyPref",MODE_PRIVATE);
        name=findViewById(R.id.nameview);
        email=findViewById(R.id.emailview);
        if(sp.contains("Name"))
            name.setText(sp.getString("Name",""));
        if(sp.contains("Email"))
            email.setText(sp.getString("Email",""));
    }
    public void previousActivity(View view){
        System.out.println("Previous");
        startActivity(new Intent(this,MainActivity.class));
    }
}