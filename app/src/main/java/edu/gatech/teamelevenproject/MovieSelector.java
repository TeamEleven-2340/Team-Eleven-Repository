package edu.gatech.teamelevenproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Class that defines the selection of movies.
 */

public class MovieSelector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_selector);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.movieselectormenu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.logout) {
            Intent back = new Intent(getBaseContext(), MainActivity.class);
            back.setFlags( Intent.FLAG_ACTIVITY_CLEAR_TOP );
            startActivity(back);
            String text = "Logout Success!";
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast t = Toast.makeText(context, text, duration);
            t.show();
        } else if (id == R.id.profile) {
             Intent profile = new Intent (getBaseContext(), ProfileActivity.class);
            startActivity(profile);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if(keyCode == KeyEvent.KEYCODE_BACK)
        {
            Intent intent = new Intent(getBaseContext(), MainActivity.class);
            intent.setFlags( Intent.FLAG_ACTIVITY_CLEAR_TOP );
            startActivity(intent);
            return true;
        }
        return false;
    }
}
