package my.dubeytechnologies.hinduchalisa.ui.chalisa;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import my.dubeytechnologies.hinduchalisa.R;

public class ChalisaFragment extends Fragment {

    private ChalisaViewModel chalisaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        chalisaViewModel =
                ViewModelProviders.of(this).get(ChalisaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_chalisa, container, false);
        return root;
    }
}