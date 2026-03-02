package my.dubeytechnologies.hinduchalisa.ui.mantra.madhurashtakam;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import my.dubeytechnologies.hinduchalisa.R;

public class MadhurashtakamMantraFragment extends Fragment {

    private MadhurashtakamMantraViewModel madhurashtakamMantraViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        madhurashtakamMantraViewModel = 
                ViewModelProviders.of(this).get(MadhurashtakamMantraViewModel.class);
        View root = inflater.inflate(R.layout.fragment_madhurashtakam_mantra, container, false);
        return root;
    }
}