package org.rudnick.iowavotes;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
//import static org.rudnick.iowavotes.R.id.check;

/**
 * A simple {@link Fragment} subclass.
 */
public class ElectionTwoDatesFragment extends Fragment {

    public ElectionTwoDatesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_view_info, container, false);
        // List of Step objects to be displayed in the ListView

        ArrayList<Step> electionArray = new ArrayList<Step>();
        electionArray.add(new Step("City Election", "Date of Schoolboard election"));
        electionArray.add(new Step("Registration Date", ""));
        electionArray.add(new Step("Candidate List", ""));


        StepAdapter adapter = new StepAdapter(getActivity(), electionArray);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
