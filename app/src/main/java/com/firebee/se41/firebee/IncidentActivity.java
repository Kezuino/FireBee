package com.firebee.se41.firebee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class IncidentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incident);
        ListView incidents = (ListView) findViewById(R.id.listViewincident);
        final String[] incidentNames = getResources().getStringArray(R.array.incident_name);
        final ArrayList nameList = new ArrayList();

        for(int i = 0; i < incidentNames.length; i++)
        {
            nameList.add(incidentNames[i]);
        }

        final ArrayAdapter listAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,nameList);
        incidents.setAdapter(listAdapter);

        incidents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent incidentDetails = new Intent(IncidentActivity.this, IncidentDetailActivity.class);
                incidentDetails.putExtra("id",position);
                startActivity(incidentDetails);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_incident, menu);
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
