package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        WebView mywebview = (WebView) findViewById(R.id.webview);
        mywebview.loadUrl("https://studygyaan.com/python/python-tutorial-introduction");
    }
}
