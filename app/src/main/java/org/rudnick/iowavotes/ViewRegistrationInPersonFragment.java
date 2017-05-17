package org.rudnick.iowavotes;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

//import static org.rudnick.iowavotes.R.id.check;

/**
 * A simple {@link Fragment} subclass.
 */
public class ViewRegistrationInPersonFragment extends Fragment {


    public ViewRegistrationInPersonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_view_info, container, false);
        // List of Step objects to be displayed in the ListView
        ArrayList<Step> registrationArray = new ArrayList<Step>();
        registrationArray.add(new Step("1. Get the voter registration form", "Before Oct 29 · Pick up the form at your county auditor, a Motor Vehicle driver’s license station, or a County Treasurers’ office that issues driver’s licenses\n\nSep 29–Nov 7 · Fill out the form at your early voting location\n\nNov 8 · Fill out the form at your voting location"));
        registrationArray.add(new Step("2. Fill out the form", "Step 1 · Check the boxes to indicate you're a US citizen and will be at least 18 years old by Election Day, Nov 8 \n\nStep 2 · Provide your Iowa driver’s license number, your non-operation ID number, or the last 4 digits of your Social Security number. If you don't have any of these, check the appropriate box.\n\nStep 3 · Provide your birthday, gender, and email (email is optional) \n\nStep 4 · Provide your name\n\nStep 5 · Provide your address, or describe where you reside if you don't have an address\n\nStep 6 · Provide your mailing address (if different from Step 5)\n\nStep 7 · If you're reporting a change in your name or address, provide your previous name or address information \n\nStep 8 · Provide your political party or check the box for “no party”\n\nStep 9 · Sign and date form"));
        registrationArray.add(new Step("3. Provide a copy of accepted ID, if required", "If you’re registering in person at your early vote location Sep 29–Nov 7, or at your voting location on Nov 8, you’ll need to bring one of the following:\n\n- Iowa driver’s license \n- Iowa non-operator’s ID card\n- Out-of-state driver’s license or non-operator’s ID card\n\n- US passport\n- US military ID card\n- ID card issued by an employer\n- Student ID card issued by an Iowa high school or an Iowa college\n\nIf the photo ID doesn’t have your current address, you’ll also need another document that shows your name and current address:\n- Residential lease\n- Property tax statement\n- Utility bill (including a cell phone bill)\n- Bank statement\n- Paycheck\n- Government check\n- Other government document"));
        registrationArray.add(new Step("4. Return the form", "Turn in your form by Oct 29 to your county auditor or the other government office where you picked up the form\n\nYou can also fill out and return the form at your early voting location Sep 29–Nov 7, or at your Election Day voting location on Nov 8"));

        StepAdapter adapter = new StepAdapter(getActivity(), registrationArray);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
