package org.rudnick.iowavotes;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ViewVotingByMailFragment extends Fragment {


    public ViewVotingByMailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_view_info, container, false);
        // List of Step objects to be displayed in the ListView
        ArrayList<Step> votingArray = new ArrayList<Step>();
        votingArray.add(new Step("1. Get your absentee ballot application", "Download and print the absentee ballot application", "Get the form: https://sos.iowa.gov/elections/pdf/absenteeballotapp.pdf"));
        votingArray.add(new Step("2. Fill out the form", "Step 1 · Provide your name and birthday\n\nStep 2 · Provide either your Iowa driver’s license number, non-operator ID number, or the last 4 digits of your Social Security number\n\nStep 3 · Provide your home address, and provide the address where the ballot should be mailed (if different)\n\nSteps 4 · Provide your phone number and email address\n\nStep 5 · To receive an absentee ballot for the general election on Nov 8, check the box for \"General\" \n\nStep 6 · Sign and date the form"));
        votingArray.add(new Step("3. Submit the form", "Mail your application to your County Auditor’s office so it’s received by 5 PM on Nov 4", "Find your County Auditor here: https://sos.iowa.gov/elections/auditors/auditorslist.html"));
        votingArray.add(new Step("4. Vote", "- Once you receive your ballot, follow the instructions to fill out the ballot and return envelope\n- Mail your ballot by Nov 7 to your County Auditor’s office", "- Check the status of your ballot at https://sos.iowa.gov/elections/absenteeballotstatus/search.aspx"));


        StepAdapter adapter = new StepAdapter(getActivity(), votingArray);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
