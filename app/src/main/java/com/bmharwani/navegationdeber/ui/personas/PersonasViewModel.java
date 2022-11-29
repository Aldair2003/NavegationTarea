package com.bmharwani.navegationdeber.ui.personas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PersonasViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public PersonasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Hola, como estas?");
    }

    public LiveData<String> getText() {
            return mText;
        }

}
