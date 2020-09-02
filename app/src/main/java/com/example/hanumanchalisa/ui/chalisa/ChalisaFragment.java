package com.example.hanumanchalisa.ui.chalisa;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.hanumanchalisa.R;

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