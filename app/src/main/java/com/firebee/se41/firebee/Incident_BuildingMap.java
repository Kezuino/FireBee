package com.firebee.se41.firebee;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by Jordi on 11-10-2015.
 */
public class Incident_BuildingMap extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incident_building_map);
        final int id = getIntent().getExtras().getInt("id");
        ImageView mapView = (ImageView)findViewById(R.id.mapView);
        Drawable image;
        image = ContextCompat.getDrawable(getApplicationContext(), R.drawable.legitmap);
        mapView.setImageDrawable(image);
        }
    }
