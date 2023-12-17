package com.example.a2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"Oncreate called",Toast.LENGTH_LONG).show();
    }
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(),"Onstart called",Toast.LENGTH_LONG).show();
    }
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(getApplicationContext(),"Onrestart called",Toast.LENGTH_LONG).show();
    }
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(),"Onpause called",Toast.LENGTH_LONG).show();
    }
    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(),"Onpause called",Toast.LENGTH_LONG).show();
    }
    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(),"Onstop called",Toast.LENGTH_LONG).show();
    }
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"Ondestroy called",Toast.LENGTH_LONG).show();
    }
}