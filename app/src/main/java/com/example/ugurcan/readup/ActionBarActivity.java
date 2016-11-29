package com.example.ugurcan.readup;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.folderselector.FileChooserDialog;

import java.io.File;

/**
 * Created by Ugurcan on 28.11.2016.
 */

public class ActionBarActivity  extends AppCompatActivity  implements FileChooserDialog.FileCallback {
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
                    .title("Arama Sonuçları")
                    .content("Love")
                    .positiveText("OK")
                    .show();
            return true;
        }
        if(id==R.id.action_addFile)
        {
            new FileChooserDialog.Builder(this)
                    .initialPath("/sdcard/Download")  // changes initial path, defaults to external storage directory
                    .mimeType("image/*") // Optional MIME type filter
                    .extensionsFilter(".pdf") // Optional extension filter, will override mimeType()
                    .tag("optional-identifier")
                    .goUpLabel("Up") // custom go up label, default label is "..."
                    .show();
            return  true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onFileSelection(@NonNull FileChooserDialog dialog, @NonNull File file) {
        final String tag = dialog.getTag();

    }
}
