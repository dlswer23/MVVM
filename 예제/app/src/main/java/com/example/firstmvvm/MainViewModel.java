package com.example.firstmvvm;

import android.view.View;

import androidx.databinding.ObservableField;

public class MainViewModel implements BaseViewModel{
    public final ObservableField<String> helloText = new ObservableField<>();

    @Override
    public void onCreate() {
        helloText.set("hello!");
    }

    @Override
    public void onResume() {}

    @Override
    public void onPause() {}

    @Override
    public void onDestroy() {}

    public void showCurrentTime(){
        helloText.set(String.valueOf(System.currentTimeMillis()));
    }

    public View.OnClickListener currentTime2ClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            showCurrentTime();
        }
    };

}
