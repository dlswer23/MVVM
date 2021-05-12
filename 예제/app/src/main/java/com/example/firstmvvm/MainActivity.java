package com.example.firstmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;

import com.example.firstmvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private MainViewModel model = new MainViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setModel(model);

        model.onCreate();
    }

    @Override
    protected void onResume() {
        super.onResume();
        model.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        model.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        model.onDestroy();
    }
}