package com.example.ugurcan.readup;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        this.searchWord=(EditText)findViewById(R.id.SearchWord);
    }
}
