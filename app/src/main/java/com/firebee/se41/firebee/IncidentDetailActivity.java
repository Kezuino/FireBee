package com.firebee.se41.firebee;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class IncidentDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incident_detail);
        final int id = getIntent().getExtras().getInt("id");
        final String[] incidentNames = getResources().getStringArray(R.array.incident_name);
        final String[] incidentLocation = getResources().getStringArray(R.array.incident_location);
        final String name = incidentNames[id];
        final String location = incidentLocation[id];
        TextView tvName = (TextView)findViewById(R.id.tvName);
        TextView tvLocation = (TextView)findViewById(R.id.tvLocation);
        tvName.setText(name);
        tvLocation.setText(location);

        Button btGps = (Button)findViewById(R.id.btGps);
        btGps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gpsWindow = new Intent(IncidentDetailActivity.this, IncidentMapActivity.class);
                gpsWindow.putExtra("incidentName", name);
                gpsWindow.putExtra("incidentLocation", location);
                startActivity(gpsWindow);
            }
        });

        Button btMaps = (Button)findViewById(R.id.btMap);
        btMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapWindow = new Intent(IncidentDetailActivity.this, Incident_BuildingMap.class);
                mapWindow.putExtra("id", id);
                startActivity(mapWindow);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_incident_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
