package my.dubeytechnologies.hinduchalisa.ui.shiv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import my.dubeytechnologies.hinduchalisa.R;

public class ShivChalisaFragment extends Fragment {

    private ShivChalisaViewModel shivChalisaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        shivChalisaViewModel =
                ViewModelProviders.of(this).get(ShivChalisaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_shiv_chalisa, container, false);
        return root;
    }
}