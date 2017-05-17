package org.rudnick.iowavotes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ViewResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_web);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ViewResultsFragment())
                .commit();
    }
}