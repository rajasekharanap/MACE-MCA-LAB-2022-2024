package com.example.spinner_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    ImageView iv;
    Spinner sp;
    int img[]={R.drawable.parrot,R.drawable.eagle,R.drawable.pigeon};
    String [] names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=findViewById(R.id.spnr);
        sp.setOnItemSelectedListener(this);
        names=getResources().getStringArray(R.array.pakshikal);
        ArrayAdapter adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,names);
        sp.setAdapter(adapter);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        iv=findViewById(R.id.image);
        iv.setImageResource(img[position]);
        TextView txt=(TextView) view;
        Toast.makeText(this,"You have selected: "+txt.getText(),Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}