package org.rudnick.iowavotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FindLegislatorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_check_web.xml layout file
        setContentView(R.layout.activity_check_web);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new FindLegislatorsFragment())
                .commit();
    }
}