package com.lavi.habitchallenge.ui.ongoing;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.lavi.habitchallenge.ChallengeType;
import com.lavi.habitchallenge.ui.OngoingChallengeView;

public class OngoingChallengesFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        LinearLayout parentLinearLayout = new LinearLayout(getContext());
        parentLinearLayout.setOrientation(LinearLayout.VERTICAL);
        parentLinearLayout.setBackgroundColor(0xFFDDDDDD);
        for (int i = 0; i < 100; i++) {
            ChallengeType challengeType = i % 2 == 0 ? ChallengeType.DAILY_CHALLENGE : ChallengeType.NUMERIC_CHALLENGE;
            parentLinearLayout.addView(
                    new OngoingChallengeView(
                            getContext(),
                            i + " This is a Sample heading",
                            challengeType
                    )
            );
        }

        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(parentLinearLayout);
        return scrollView;

    }

}
