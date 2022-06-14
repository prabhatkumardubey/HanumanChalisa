package my.dubeytechnologies.hinduchalisa.ui.durga;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import my.dubeytechnologies.hinduchalisa.R;

public class DurgaChalisaFragment extends Fragment {

    private DurgaChalisaViewModel durgaChalisaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        durgaChalisaViewModel =
                ViewModelProviders.of(this).get(DurgaChalisaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_durga_chalisa, container, false);
        return root;
    }

}