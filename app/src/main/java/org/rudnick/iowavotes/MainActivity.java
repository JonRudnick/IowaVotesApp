package org.rudnick.iowavotes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button viewRegistrationButton = (Button)findViewById(R.id.register);
        viewRegistrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Loading...", Toast.LENGTH_SHORT).show();
                Intent viewRegistrationIntent = new Intent(MainActivity.this, ViewRegistrationActivity.class);
                startActivity(viewRegistrationIntent);
            }
        });

        Button viewVotingButton = (Button)findViewById(R.id.vote);
        viewVotingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Loading...", Toast.LENGTH_SHORT).show();
                Intent viewVotingIntent = new Intent(MainActivity.this, ViewVotingActivity.class);
                startActivity(viewVotingIntent);
            }
        });

        Button checkRegistrationButton = (Button)findViewById(R.id.check);
        checkRegistrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Loading...", Toast.LENGTH_SHORT).show();
                Intent checkRegistrationIntent = new Intent(MainActivity.this, CheckRegistrationActivity.class);
                startActivity(checkRegistrationIntent);
            }
        });

        Button findPollingButton = (Button)findViewById(R.id.polling);
        findPollingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Loading...", Toast.LENGTH_SHORT).show();
                Intent findPollingIntent = new Intent(MainActivity.this, FindPollingActivity.class);
                startActivity(findPollingIntent);
            }
        });
    }
}
