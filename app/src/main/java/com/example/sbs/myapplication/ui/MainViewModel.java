package com.example.sbs.myapplication.ui;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.sbs.myapplication.util.Util;

import javax.inject.Inject;

import dagger.hilt.android.scopes.ViewModelScoped;

@ViewModelScoped
public class MainViewModel extends AndroidViewModel {
    public MutableLiveData<String> lvImageUrl = new MutableLiveData<>("https://i.picsum.photos/id/181/536/354.jpg?hmac=CL7yXt5fTwzXUCq3aQahgLLqogtp2sutY853WgJgM_M");

    @Inject
    public MainViewModel(@NonNull Application application) {
        super(application);

        Util.preloadImg("https://i.pravatar.cc/350?img=4");

        Util.setTimeout(() -> {
            lvImageUrl.setValue("https://i.pravatar.cc/350?img=4");
        }, 5000);
    }
}
