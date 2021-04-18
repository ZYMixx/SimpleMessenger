package com.zymixx.simplemessenger;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.zip.Inflater;

public class DialogScreen extends AppCompatActivity {
    androidx.appcompat.widget.Toolbar toolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_screen);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(null);
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.test_toolbar, null);
        actionBar.setCustomView(view);
        actionBar.setDisplayShowCustomEnabled(true);
        makeGUI();

     //   EditText editTextDialog = findViewById(R.id.dialog_main_et);
        //editTextDialog.tint

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.dialog_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void makeGUI(){
        //getSupportActionBar().show();

    }

}
