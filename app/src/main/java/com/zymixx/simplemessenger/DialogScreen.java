package com.zymixx.simplemessenger;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DialogScreen extends AppCompatActivity {
    androidx.appcompat.widget.Toolbar toolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_screen);



        makeGUI();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.dialog_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    void createMenuAvatarImage(){
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(null);
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.test_toolbar, null);
        actionBar.setCustomView(view);
        actionBar.setDisplayShowCustomEnabled(true);
    }

    static Drawable uzerRect;
    static Drawable friendsRect;

    public void makeGUI(){

        createMenuAvatarImage();

        uzerRect = getDrawable(R.drawable.rectangle_forusermessage);
        friendsRect = getDrawable(R.drawable.rectangle);

        new TestClass().createMap();
        RecyclerView dialogRV = findViewById(R.id.dialog_screen_rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        linearLayoutManager.setStackFromEnd(true);
        dialogRV.setLayoutManager(linearLayoutManager);
        DialogRVAdapter adapter =  new DialogRVAdapter();
        dialogRV.setAdapter(adapter);
    }

}
