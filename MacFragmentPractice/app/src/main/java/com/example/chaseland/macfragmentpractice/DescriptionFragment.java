package com.example.chaseland.macfragmentpractice;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by chaseland on 3/17/16.
 */
public class DescriptionFragment extends Fragment {

    String[] courseDescriptions;
    TextView courseDescriptionsTextView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        courseDescriptions = getResources().getStringArray(R.array.Description);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View theView = inflater.inflate(R.layout.fragment_descriptions, container, false);

        courseDescriptionsTextView = (TextView) theView.findViewById(R.id.courseDescriptions);

        return theView;
    }

    public void setCourseDescription(int courseIndex)
    {
        courseDescriptionsTextView.setText(courseDescriptions[courseIndex]);
    }
}
