package my.dubeytechnologies.hinduchalisa.ui.mantra.narsimha;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NarsimhaMantraViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NarsimhaMantraViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Narsimha Mantra fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}