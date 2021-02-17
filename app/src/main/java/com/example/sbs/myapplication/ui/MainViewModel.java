package com.example.sbs.myapplication.ui;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import dagger.hilt.android.scopes.ViewModelScoped;

@ViewModelScoped
public class MainViewModel extends AndroidViewModel {
    public MutableLiveData<String> lvTitle = new MutableLiveData<>("안녕");
    public MutableLiveData<String> lvName = new MutableLiveData<>("이름입니다.");

    @Inject
    public MainViewModel(@NonNull Application application) {
        super(application);
    }
}
