package com.lavi.habitchallenge.ui.ongoing;

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

import com.lavi.habitchallenge.R;

public class OngoingChallengesFragment extends Fragment {

    private OngoingChallengesViewModel ongoingChallengesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ongoingChallengesViewModel =
                ViewModelProviders.of(this).get(OngoingChallengesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_ongoing, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        ongoingChallengesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
