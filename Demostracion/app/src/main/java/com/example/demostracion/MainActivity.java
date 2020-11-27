package com.example.demostracion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void rl(View view){
        startActivity(new Intent(this,RelativeLayout.class));
    }
    public void cl(View view){
        startActivity(new Intent(this,ConstraintLayout.class));
    }
    public void sv(View view){
        startActivity(new Intent(this,ScrollView.class));
    }
}
