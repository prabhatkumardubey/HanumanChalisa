package my.dubeytechnologies.hinduchalisa.ui.mantra.narsimha;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import my.dubeytechnologies.hinduchalisa.R;

public class NarsimhaMantraFragment extends Fragment {

    private NarsimhaMantraViewModel narsimhaMantraViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        narsimhaMantraViewModel = 
                ViewModelProviders.of(this).get(NarsimhaMantraViewModel.class);
        View root = inflater.inflate(R.layout.fragment_narsimha_mantra, container, false);
        return root;
    }
}