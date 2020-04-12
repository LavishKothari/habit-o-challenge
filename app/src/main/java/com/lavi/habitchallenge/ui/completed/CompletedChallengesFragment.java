package com.lavi.habitchallenge.ui.completed;

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

public class CompletedChallengesFragment extends Fragment {

    private CompletedChallengesViewModel completedChallengesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        completedChallengesViewModel =
                ViewModelProviders.of(this).get(CompletedChallengesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_completed, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        completedChallengesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
