package com.example.sbs.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;

import com.example.sbs.myapplication.databinding.ActivityMainBinding;
import com.example.sbs.myapplication.util.Util;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        binding.setLifecycleOwner(this);
        setContentView(binding.getRoot());

        MutableLiveData<String> lvMsg = new MutableLiveData<>();
        binding.setLvMsg(lvMsg);

        lvMsg.setValue("안녕");

        Util.setTimeout(() -> {
            lvMsg.setValue("ㅋㅋ");
        }, 3000);

        Util.setTimeout(() -> {
            lvMsg.setValue("감사합니다.");
        }, 6000);
    }
}