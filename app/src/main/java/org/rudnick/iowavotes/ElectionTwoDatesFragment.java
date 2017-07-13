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
        View rootView = inflater.inflate(R.layout.fragment_election_dates, container, false);
        // List of Election objects to be displayed in the ListView

        ArrayList<Election> electionArray = new ArrayList<Election>();
        electionArray.add(new Election("2017 City Elections", "Primary: August 14 - August 31 \nElection: August 28 - September 21", "Pre-register by mail or online by September 29 to vote in the primary \nRegister in-person by October 27 to vote in the primary"));


        ElectionAdapter adapter = new ElectionAdapter(getActivity(), electionArray);
        ListView listView = (ListView) rootView.findViewById(R.id.elections);
        listView.setAdapter(adapter);
        return rootView;
    }
}