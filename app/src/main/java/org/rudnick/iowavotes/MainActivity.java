package org.rudnick.iowavotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
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
        Button viewRegistrationButton = findViewById(R.id.register);
        viewRegistrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewRegistrationIntent = new Intent(MainActivity.this, ViewRegistrationActivity.class);
                startActivity(viewRegistrationIntent);
            }
        });

        //View Voting Information Button
        Button viewVotingButton = findViewById(R.id.vote);
        viewVotingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewVotingIntent = new Intent(MainActivity.this, ViewVotingActivity.class);
                startActivity(viewVotingIntent);
            }
        });

        //Find Legislators Button
        Button findLegislatorsButton = findViewById(R.id.officials);
        findLegislatorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Loading...", Toast.LENGTH_SHORT).show();
                Intent findLegislatorsIntent = new Intent(MainActivity.this, FindLegislatorsActivity.class);
                startActivity(findLegislatorsIntent);
            }
        });

        //Find Polling Location Button
        Button findPollingButton = findViewById(R.id.polling);
        findPollingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Loading...", Toast.LENGTH_SHORT).show();
                Intent findPollingIntent = new Intent(MainActivity.this, FindPollingActivity.class);
                startActivity(findPollingIntent);
            }
        });

        // Find the view pager that will allow the user to swipe between fragments
        final ViewPager viewPager = findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        ElectionPagerAdapter adapter = new ElectionPagerAdapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Add Tab Selector Dots
        TabLayout tabLayout = findViewById(R.id.tabDots);
        tabLayout.setupWithViewPager(viewPager, true);

        //Left & Right Navigation
        ImageView leftNav = findViewById(R.id.left_nav);
        ImageView rightNav = findViewById(R.id.right_nav);
        leftNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int tab = viewPager.getCurrentItem();
                if (tab > 0) {
                    tab--;
                    viewPager.setCurrentItem(tab);
                } else if (tab == 0) {
                    viewPager.setCurrentItem(tab);
                }
            }
        });
        rightNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int tab = viewPager.getCurrentItem();
                tab++;
                viewPager.setCurrentItem(tab);
            }
        });
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
