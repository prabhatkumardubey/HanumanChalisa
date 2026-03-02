package my.dubeytechnologies.hinduchalisa.ui.mantra.mahamritunjay;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MahamritunjayMantraViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MahamritunjayMantraViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Mahamritunjay Mantra fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}