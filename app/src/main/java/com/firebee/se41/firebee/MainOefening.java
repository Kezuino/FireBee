package com.firebee.se41.firebee;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by Rinke on 7-10-2015.
 */
public class MainOefening extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_main);
        ListView oefening = (ListView) findViewById(R.id.lviewOefeningen);

        Button btnNieuwTraining = (Button) findViewById(R.id.btnNewTraining);
        btnNieuwTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent nieuwTrainingWindow = new Intent(MainOefening.this, NieuweOefeningActivity.class);
                startActivity(nieuwTrainingWindow);
            }
        });

        String[] myStringArray={"Oefening 1","Oefening 2","Oefening 3"};

        ArrayAdapter<String> myAdapter=new
                ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                myStringArray);
        oefening.setAdapter(myAdapter);
    }
}
