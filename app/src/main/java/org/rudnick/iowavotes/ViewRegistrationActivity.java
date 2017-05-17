package org.rudnick.iowavotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class ViewRegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_registration);

        String[] registrationArray = new String[17];
        registrationArray[0] = "Online";
        registrationArray[1] = "You'll need your Iowa driver’s license or non-operator’s ID and birthday to register online";
        registrationArray[2] = "[Register online](https://sos.iowa.gov/elections/voterinformation/voterregistration.html)";
        registrationArray[3] = "Online";
        registrationArray[4] = "Online";
        registrationArray[5] = "Online";
        registrationArray[6] = "Online";
        registrationArray[7] = "Online";
        registrationArray[8] = "Online";
        registrationArray[9] = "Online";
        registrationArray[10] = "Online";
        registrationArray[11] = "Online";
        registrationArray[12] = "Online";
        registrationArray[13] = "Online";
        registrationArray[14] = "Online";
        registrationArray[15] = "Online";
        registrationArray[16] = "Online";


        ArrayAdapter<String> registrationAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, registrationArray);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(registrationAdapter);
    }

}