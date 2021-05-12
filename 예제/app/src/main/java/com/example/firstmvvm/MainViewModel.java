package com.example.firstmvvm;

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

}
