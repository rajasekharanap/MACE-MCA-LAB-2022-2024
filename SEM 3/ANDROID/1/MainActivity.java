package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user,pwd;
    String u="arjun";
    String p="arjun@123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void verify(View v){
        if(v.getId()==R.id.login){
            user=findViewById(R.id.username);
            pwd=findViewById(R.id.password);
            String uname=user.getText().toString();
            String pass=pwd.getText().toString();
            if(uname.equals(u)&pass.equals(p)){
                Toast.makeText(this,"Login Successful",Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(this,"Invalid login credentials",Toast.LENGTH_SHORT).show();
            }
        }
    }

}