package my.dubeytechnologies.hinduchalisa.ui.shiv;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShivChalisaViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public ShivChalisaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
