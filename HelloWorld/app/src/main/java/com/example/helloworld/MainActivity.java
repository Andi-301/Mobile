package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //useful for loading the 'native-lib' library on application startup
    static {
        System.loadlibrary("native-lib");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //How to calling the native method
        Textview teks = (TextView) findViewById(R.id.sample_text);
        teks.setText(stringFromJNI());
    }

    public native String stringFromJNI();
}

