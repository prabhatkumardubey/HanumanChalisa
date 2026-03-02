package my.dubeytechnologies.hinduchalisa.ui.mantra.madhurashtakam;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MadhurashtakamMantraViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MadhurashtakamMantraViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Madhurashtakam Mantra fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}