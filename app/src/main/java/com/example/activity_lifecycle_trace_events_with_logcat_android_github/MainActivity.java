package com.example.activity_lifecycle_trace_events_with_logcat_android_github;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TRACE_EVENTS = "lifecycle";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TRACE_EVENTS,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TRACE_EVENTS,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TRACE_EVENTS,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TRACE_EVENTS,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TRACE_EVENTS,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TRACE_EVENTS,"onDestroy");
    }
}
