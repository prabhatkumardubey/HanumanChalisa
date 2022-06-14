package my.dubeytechnologies.hinduchalisa.ui.ashtak;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import my.dubeytechnologies.hinduchalisa.R;

public class AshtakFragment extends Fragment {

    private AshtakViewModel ashtakViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ashtakViewModel =
                ViewModelProviders.of(this).get(AshtakViewModel.class);
        View root = inflater.inflate(R.layout.fragment_ashtak, container, false);
        /*final TextView textView = root.findViewById(R.id.text_home);
        ashtakViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}