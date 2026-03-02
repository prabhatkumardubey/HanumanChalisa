package my.dubeytechnologies.hinduchalisa.ui.mantra.mahamritunjay;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import my.dubeytechnologies.hinduchalisa.R;

public class MahamritunjayMantraFragment extends Fragment {

    private MahamritunjayMantraViewModel mahamritunjayMantraViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mahamritunjayMantraViewModel = 
                ViewModelProviders.of(this).get(MahamritunjayMantraViewModel.class);
        View root = inflater.inflate(R.layout.fragment_mahamritunjay_mantra, container, false);
        return root;
    }
}