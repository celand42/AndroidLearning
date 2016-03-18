package com.example.chaseland.macfragmentpractice;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by chaseland on 3/17/16.
 */
public class TitlesFragment extends ListFragment {

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        OnCourseSelectionChangedLIstener listener = (OnCourseSelectionChangedLIstener) getActivity();
        if (listener != null) {
            listener.OnCourseSelectionChanged(position);
        }
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String[] titles = getResources().getStringArray(R.array.Titles);

        ArrayAdapter<String> titleAdapter =
                new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, titles);

        setListAdapter(titleAdapter);


    }
}
