package com.example.mybuttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
private Button logoutbutton,loginbutton;
private TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginbutton=findViewById(R.id.login);
        logoutbutton=findViewById(R.id.logout);
        textview=findViewById(R.id.textview);
    }

    public void ShowMessage(View v){
        if(v.getId()==R.id.login){
            Log.v("tag","login ");
        }
        else if(v.getId()==R.id.logout){
           Log.v("tag","logout");
        }

    }

}
