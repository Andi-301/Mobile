package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //restore this activity's state
        if(savedInstanceState != null){
            String restoredStr = savedInstanceState.getString("key");
        }
        Button btnexit = (Button) findViewById(R.id.btn_exit);
        btnexit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Confirming Your Exit");
                builder.setMessage("Apa anda benar-benar ingin keluar?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {finish();}
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {dialogInterface.dismiss();}
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

    }
    @Override
    protected void onSaveInstanceState(Bundle outstate){
        outstate.putString("key", "Welcome Back");
        super.onSaveInstanceState(outstate); //save state
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        String restoredMsg = savedInstanceState.getString("key");
    }

}