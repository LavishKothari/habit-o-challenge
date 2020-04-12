package com.lavi.habitchallenge.ui.addnew;

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

public class AddNewChallengeFragment extends Fragment {

    private AddNewChallengeViewModel addNewChallengeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        addNewChallengeViewModel =
                ViewModelProviders.of(this).get(AddNewChallengeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_addnew, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        addNewChallengeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
