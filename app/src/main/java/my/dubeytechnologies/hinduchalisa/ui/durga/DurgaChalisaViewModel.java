package my.dubeytechnologies.hinduchalisa.ui.durga;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DurgaChalisaViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public DurgaChalisaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}