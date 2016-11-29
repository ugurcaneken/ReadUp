package com.example.ugurcan.readup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;

/**
 * Created by Ugurcan on 28.11.2016.
 */

public class ActionBarActivity  extends AppCompatActivity {
    EditText searchWord;

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
        if (id == R.id.action_search) {

            new MaterialDialog.Builder(this)
                    .title("Merhaba")
                    .content("ReadUp Projesi")
                    .positiveText("OK")
                    .negativeText("İPTAL")
                    .neutralText("devamı...")
                    .show();
            return true;
        }
        if(id==R.id.action_addFile)
        {
            Toast.makeText(getApplicationContext(),searchWord.getText().toString(),Toast.LENGTH_LONG).show();
            return  true;
        }

        return super.onOptionsItemSelected(item);
    }
}
