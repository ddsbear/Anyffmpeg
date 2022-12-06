package com.dds.ffmpeg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
        System.loadLibrary("Anyffmpeg");
        Log.d(TAG, "onCreate: " + FFMpeg.stringFromJNI());
        textView.setText(FFMpeg.stringFromJNI());
    }
}