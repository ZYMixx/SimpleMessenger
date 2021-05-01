package com.zymixx.simplemessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

//лоад активити

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.load_screen);
        try {
            jumpToFriendsList();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void jumpToFriendsList() throws Exception{

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace(); }
                Intent intent = new Intent(MainActivity.this, DialogList.class);
                startActivity(intent);
            }
        });
        thread.start();

       //DialogList
    }

}