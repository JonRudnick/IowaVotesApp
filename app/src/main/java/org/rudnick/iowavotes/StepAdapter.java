package org.rudnick.iowavotes;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jon on 1/20/2017.
 */

class StepAdapter extends ArrayAdapter<Step> {

    public StepAdapter(Activity context, ArrayList<Step> steps) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, steps);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.step_item, parent, false);
        }

        // Get the {@link Step} object located at this position in the list
        Step currentStep = getItem(position);

        // Find the TextView in the step_item.xml layout with the ID step_title
        TextView titleTextView = listItemView.findViewById(R.id.step_title);
        // Get the title from the current Step object and set this text on the name TextView
        titleTextView.setText(currentStep.getStepTitle());

        // Find the TextView in the step_item.xml layout with the ID step_description
        TextView descriptionTextView = listItemView.findViewById(R.id.step_description);
        // Get the description from the current Step object and set this text on the description TextView
        descriptionTextView.setText(currentStep.getStepDescription());

        // Find the TextView in the step_item.xml layout with the ID step_link
        TextView linkTextView = listItemView.findViewById(R.id.step_link);
        // If there is a link, get it from the current Step object and set this text on the link TextView
        if (currentStep.getStepLink() == null || currentStep.getStepLink().equals("")) {
            linkTextView.setVisibility(View.GONE);
        }
        else {
            linkTextView.setText(currentStep.getStepLink());
        }

        // Return the whole list item layout (containing 3 TextViews) so that it can be shown in the ListView
        return listItemView;
    }
}
