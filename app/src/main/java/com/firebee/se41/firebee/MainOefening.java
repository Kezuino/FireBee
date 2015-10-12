package com.firebee.se41.firebee;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by Rinke on 7-10-2015.
 */
public class MainOefening extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_main);


        Button btnNieuwTraining = (Button) findViewById(R.id.btnNewTraining);
        btnNieuwTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent nieuwTrainingWindow = new Intent(MainOefening.this, NieuweOefeningActivity.class);
                startActivity(nieuwTrainingWindow);
            }
        });
    }
}
