package com.example.chaseland.macfragmentpractice;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by chaseland on 3/17/16.
 */
public class MainActivity extends AppCompatActivity  implements OnCourseSelectionChangedLIstener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void OnCourseSelectionChanged(int courseIndex) {
        FragmentManager fragmentManager = getFragmentManager();

        DescriptionFragment descriptionFragment =
                (DescriptionFragment) fragmentManager.findFragmentById(R.id.fragment2);

        descriptionFragment.setCourseDescription(courseIndex);

    }
}
