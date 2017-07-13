package org.rudnick.iowavotes;

import android.app.Activity;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jon on 1/20/2017.
 */

public class ElectionAdapter extends ArrayAdapter<Election> {

    public ElectionAdapter(Activity context, ArrayList<Election> elections) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, elections);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.election_item, parent, false);
        }

        // Get the {@link Election} object located at this position in the list
        Election currentElection = getItem(position);

        // Find the TextView in the election_item.xml layout with the ID election_title
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.election_name);
        // Get the title from the current Election object and set this text on the name TextView
        nameTextView.setText(currentElection.getElectionName());

        // Find the TextView in the election_item.xml layout with the ID election_date
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.election_date);
        // Get the description from the current Election object and set this text on the description TextView
        dateTextView.setText(currentElection.getElectionDate());

        // Find the TextView in the election_item.xml layout with the ID election_registration_date
        TextView registrationDateTextView = (TextView) listItemView.findViewById(R.id.election_registration_date);
        // Get the description from the current Election object and set this text on the description TextView
        registrationDateTextView.setText(currentElection.getElectionRegistrationDate());

        // Find the TextView in the election_item.xml layout with the ID election_date
        TextView checkRegistrationTextView = (TextView) listItemView.findViewById(R.id.election_check_registration);
        checkRegistrationTextView.setMovementMethod(LinkMovementMethod.getInstance());

        // Return the whole list item layout (containing 3 TextViews) so that it can be shown in the ListView
        return listItemView;
    }
}
