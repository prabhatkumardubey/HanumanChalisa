package my.dubeytechnologies.hinduchalisa.ui.chalisa;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChalisaViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public ChalisaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}