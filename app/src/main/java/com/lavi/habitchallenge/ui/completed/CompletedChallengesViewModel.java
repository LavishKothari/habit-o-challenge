package com.lavi.habitchallenge.ui.completed;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CompletedChallengesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CompletedChallengesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Completed challenges fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}