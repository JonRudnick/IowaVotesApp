package org.rudnick.iowavotes;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ViewVotingInPersonFragment extends Fragment {


    public ViewVotingInPersonFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_view_info, container, false);
        // List of Step objects to be displayed in the ListView
        ArrayList<Step> votingArray = new ArrayList<>();
        votingArray.add(new Step("Vote Early", "Bring an accepted form of ID, if required"));
        votingArray.add(new Step("Vote on Election Day", "Polls are open from 7 AM–9 PM.  If you’re in line at your polling place by 9 PM, you’re allowed to vote. \n\nBring an accepted form of ID, if required"));


        StepAdapter adapter = new StepAdapter(getActivity(), votingArray);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
