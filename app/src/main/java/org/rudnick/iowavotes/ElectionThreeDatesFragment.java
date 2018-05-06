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
public class ElectionThreeDatesFragment extends Fragment {

    public ElectionThreeDatesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_election_dates, container, false);
        // List of Election objects to be displayed in the ListView

        ArrayList<Election> electionArray = new ArrayList<>();
        electionArray.add(new Election("2018 Midterm Elections (State & Federal Offices)", "Primary: February 26 - March 16 \nElection: July 30 - August 17", "Pre-register by mail or online by May 25 to vote in the primary \nRegister in-person by October 27 to vote in the primary"));


        ElectionAdapter adapter = new ElectionAdapter(getActivity(), electionArray);
        ListView listView = rootView.findViewById(R.id.elections);
        listView.setAdapter(adapter);
        return rootView;
    }
}
