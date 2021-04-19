package com.zymixx.simplemessenger;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

    static Drawable uzerRect;

    public void makeGUI(){
        //getSupportActionBar().show();

        uzerRect = getDrawable(R.drawable.rectangle_forusermessage);


        RecyclerView dialogRV = findViewById(R.id.dialog_rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        dialogRV.setLayoutManager(linearLayoutManager);
        DialogRVAdapter adapter =  new DialogRVAdapter();
        dialogRV.setAdapter(adapter);
    }

}
