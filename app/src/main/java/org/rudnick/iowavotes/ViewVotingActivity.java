package org.rudnick.iowavotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ViewVotingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_voting);

        String[] votingArray = new String[10];
        votingArray[0] = "By Mail";
        votingArray[1] = "1. Get your absentee ballot application";
        votingArray[2] = "Download and print the absentee ballot application";
        votingArray[3] = "[Get the form](https://sos.iowa.gov/elections/pdf/absenteeballotapp.pdf)";
        votingArray[4] = "2. Fill out the form";
        votingArray[5] = "";
        votingArray[6] = "3. Submit the form";
        votingArray[7] = "Mail your application to your [County Auditor’s office](https://sos.iowa.gov/elections/auditors/auditorslist.html) so it’s received by **5 PM on Nov 4**";
        votingArray[8] = "4. Vote";
        votingArray[9] = "- Once you receive your ballot, follow the instructions to fill out the ballot and return envelope\n - Mail your ballot by **Nov 7** to your [County Auditor’s office](https://sos.iowa.gov/elections/auditors/auditorslist.html)\n - Check the status of your ballot at [sos.iowa.gov](https://sos.iowa.gov/elections/absenteeballotstatus/search.aspx)";

        ArrayAdapter<String> votingAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, votingArray);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(votingAdapter);
    }
}
