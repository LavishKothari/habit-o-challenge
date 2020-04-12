package com.lavi.habitchallenge.ui.addnew;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AddNewChallengeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AddNewChallengeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Add new challenge fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}