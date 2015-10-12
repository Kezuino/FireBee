package com.firebee.se41.firebee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button meldingButton = (Button)findViewById(R.id.btnIncidents);
        meldingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent meldingWindow = new Intent(MainMenu.this, IncidentActivity.class);
                startActivity(meldingWindow);
            }
        });

        Button oefeningButton = (Button)findViewById(R.id.btnTraining);
        oefeningButton.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent oefeningWindow = new Intent(MainMenu.this, MainOefening.class);
                startActivity(oefeningWindow);
            }
        });

        Button beheerButton = (Button)findViewById(R.id.btnManagement);
        beheerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent beheerWindow = new Intent(MainMenu.this, ManagementActivty.class);
                startActivity(beheerWindow);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
