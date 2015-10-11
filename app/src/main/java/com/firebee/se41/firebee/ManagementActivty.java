package com.firebee.se41.firebee;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ManagementActivty extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management);
        final String[] teamNames = getResources().getStringArray(R.array.teamNames);
        final ArrayList nameList = new ArrayList();
        ListView teams = (ListView)findViewById(R.id.teamView);
        final ListView members = (ListView)findViewById(R.id.memberView);

        for(int i = 0; i < teamNames.length; i++) {
            nameList.add(teamNames[i]);
        }
        teams.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = teamNames[position];
                System.out.println(name);
                String[] members = null;
                switch (name){
                    case "Team 001":
                    {
                        members = getResources().getStringArray(R.array.Team001);
                    }
                    case "Team 002":
                    {
                        members = getResources().getStringArray(R.array.Team002);
                    }
                    case "Team 003":
                    {
                        members = getResources().getStringArray(R.array.Team003);
                    }
                    case "Team 004":
                    {
                        members = getResources().getStringArray(R.array.Team004);
                    }
                    case "Team 005":
                    {
                        members = getResources().getStringArray(R.array.Team005);
                    }
                    case "Team 006":
                    {
                        members = getResources().getStringArray(R.array.Team006);
                    }
                    case "Team 007":
                    {
                        members = getResources().getStringArray(R.array.Team007);
                    }
                    case "Team 008":
                    {
                        members = getResources().getStringArray(R.array.Team008);
                    }
                    case "Team 009":
                    {
                        members = getResources().getStringArray(R.array.Team009);
                    }
                }
                ArrayList memberName = new ArrayList();
                for(int i = 0; i < members.length; i++)
                {
                    memberName.add(members[i]);
                }
                ListView memberView = (ListView)findViewById(R.id.memberView);
                final ArrayAdapter memberAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,memberName);
                memberView.setAdapter(memberAdapter);
                memberAdapter.addAll(memberName);
                TextView teamName = (TextView)findViewById(R.id.editText2);
                teamName.setText(name);
            }
        });
        final ArrayAdapter listAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,nameList);
        teams.setAdapter(listAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_management_activty, menu);
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
