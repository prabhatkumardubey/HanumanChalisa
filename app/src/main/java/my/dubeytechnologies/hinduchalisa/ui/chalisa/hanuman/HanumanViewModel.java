package my.dubeytechnologies.hinduchalisa.ui.chalisa.hanuman;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HanumanViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public HanumanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}