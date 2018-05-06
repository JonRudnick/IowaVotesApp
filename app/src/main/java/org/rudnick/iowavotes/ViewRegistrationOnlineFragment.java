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
public class ViewRegistrationOnlineFragment extends Fragment {


    public ViewRegistrationOnlineFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_view_info, container, false);
        // List of Step objects to be displayed in the ListView
        ArrayList<Step> registrationArray = new ArrayList<>();
        registrationArray.add(new Step("Register Online","You'll need your Iowa driver’s license or non-operator’s ID and birthday to register online", "Register online: https://sos.iowa.gov/elections/voterinformation/voterregistration.html"));

        StepAdapter adapter = new StepAdapter(getActivity(), registrationArray);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
