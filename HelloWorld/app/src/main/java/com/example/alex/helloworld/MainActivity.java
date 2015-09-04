package com.example.alex.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Properties
    private boolean EventClickNumber = true;
    // Own Methods
    public void doorKlikken(View view) {
        TextView tv = (TextView) findViewById(R.id.HoroscopeTekst);
        startActivity(new Intent(getApplicationContext(), TweedeScherm.class));
    }

    public void amaseUser(View view){
        Button b = (Button) findViewById(R.id.WelcomeButton);
        Button b1 = (Button) findViewById(R.id.button);

        if (EventClickNumber) {
            EventClickNumber = false;
            b.setText("clickerde click");
        }
        else {
            EventClickNumber = true;
            b.setText("Press again for same action");
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
