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
public class ViewRegistrationByMailFragment extends Fragment {


    public ViewRegistrationByMailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_view_info, container, false);
        // List of Step objects to be displayed in the ListView
        ArrayList<Step> registrationArray = new ArrayList<>();
        registrationArray.add(new Step("1. Get the voter registration form", "Download and print the Iowa state voter registration form", "Link to the form: https://sos.iowa.gov/elections/pdf/voteapp.pdf"));
        registrationArray.add(new Step("2. Fill out the form", "Step 1 · Check the boxes to indicate you're a US citizen and will be at least 18 years old by Election Day, Nov 8 \n\nStep 2 · Provide your Iowa driver’s license number, your non-operation ID number, or the last 4 digits of your Social Security number. If you don't have any of these, check the appropriate box.\n\nStep 3 · Provide your birthday, gender, and email (email is optional) \n\nStep 4 · Provide your name\n\nStep 5 · Provide your address, or describe where you reside if you don't have an address\n\nStep 6 · Provide your mailing address (if different from Step 5)\n\nStep 7 · If you're reporting a change in your name or address, provide your previous name or address information \n\nStep 8 · Provide your political party or check the box for “no party”\n\nStep 9 · Sign and date form"));
        registrationArray.add(new Step("3. Send the form", "Mail your completed form by Oct 24 to your county auditor", "Find your County Auditor here: https://sos.iowa.gov/elections/auditors/auditorslist.html"));


        StepAdapter adapter = new StepAdapter(getActivity(), registrationArray);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
