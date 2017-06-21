package org.rudnick.iowavotes;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //View Registration Information Button
        Button viewRegistrationButton = (Button)findViewById(R.id.register);
        viewRegistrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewRegistrationIntent = new Intent(MainActivity.this, ViewRegistrationActivity.class);
                startActivity(viewRegistrationIntent);
            }
        });

        //View Voting Information Button
        Button viewVotingButton = (Button)findViewById(R.id.vote);
        viewVotingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewVotingIntent = new Intent(MainActivity.this, ViewVotingActivity.class);
                startActivity(viewVotingIntent);
            }
        });

        //Find Legislators Button
        Button findLegislatorsButton = (Button)findViewById(R.id.officials);
        findLegislatorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Loading...", Toast.LENGTH_SHORT).show();
                Intent findLegislatorsIntent = new Intent(MainActivity.this, FindLegislatorsActivity.class);
                startActivity(findLegislatorsIntent);
            }
        });

        //Find Polling Location Button
        Button findPollingButton = (Button)findViewById(R.id.polling);
        findPollingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Loading...", Toast.LENGTH_SHORT).show();
                Intent findPollingIntent = new Intent(MainActivity.this, FindPollingActivity.class);
                startActivity(findPollingIntent);
            }
        });

        //View Election Results Button
        /*ImageView viewResultsImage = (ImageView) findViewById(R.id.results);
        viewResultsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewElectionsIntent = new Intent(MainActivity.this, ElectionDatesActivity.class);
                startActivity(viewElectionsIntent);
                Toast.makeText(view.getContext(), "Loading...", Toast.LENGTH_SHORT).show();
                Intent viewResultsIntent = new Intent(MainActivity.this, ViewResultsActivity.class);
                startActivity(viewResultsIntent);
            }
        });*/

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        ElectionAdapter adapter = new ElectionAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabDots);
        tabLayout.setupWithViewPager(viewPager, true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Intent settingsIntent = new Intent(this, SettingsActivity.class);
            startActivity(settingsIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
