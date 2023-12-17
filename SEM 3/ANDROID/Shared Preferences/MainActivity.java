package com.example.a3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,email;
    String a,b;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=getSharedPreferences("MyPref",MODE_PRIVATE);
        name=findViewById(R.id.uname);
        email=findViewById(R.id.email);
        if(sp.contains("Name"))
            name.setText(sp.getString("Name",""));
        if(sp.contains("Email"))
            email.setText(sp.getString("Email",""));
    }
    public void nextActivity(View view){
        a=name.getText().toString();
        b=email.getText().toString();
        SharedPreferences.Editor editor=sp.edit();
        editor.putString("Name",a);
        editor.putString("Email",b);
        editor.apply();
        System.out.println("Next");
        Intent i=new Intent(this,MainActivity2.class);
        startActivity(i);
    }
}