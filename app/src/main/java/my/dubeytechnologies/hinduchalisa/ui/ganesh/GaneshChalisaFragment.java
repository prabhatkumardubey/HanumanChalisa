package my.dubeytechnologies.hinduchalisa.ui.ganesh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import my.dubeytechnologies.hinduchalisa.R;

public class GaneshChalisaFragment extends Fragment {

    private GaneshChalisaViewModel ganeshChalisaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ganeshChalisaViewModel =
                ViewModelProviders.of(this).get(GaneshChalisaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_ganesh_chalisa, container, false);
        return root;
    }
}