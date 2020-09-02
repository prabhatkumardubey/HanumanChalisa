package com.example.hanumanchalisa.ui.ashtak;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AshtakViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AshtakViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}