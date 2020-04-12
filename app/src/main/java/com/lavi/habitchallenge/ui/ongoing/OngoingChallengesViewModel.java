package com.lavi.habitchallenge.ui.ongoing;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OngoingChallengesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OngoingChallengesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Ongoing challenges fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}