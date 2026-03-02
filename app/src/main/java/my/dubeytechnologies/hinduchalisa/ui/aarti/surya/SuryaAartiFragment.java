package my.dubeytechnologies.hinduchalisa.ui.aarti.surya;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import my.dubeytechnologies.hinduchalisa.R;

public class SuryaAartiFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_surya_aarti, container, false);
        return root;
    }
}