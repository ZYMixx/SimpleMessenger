package com.zymixx.simplemessenger;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DialogList extends AppCompatActivity {
    RecyclerView rvDialogFriends;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_friends);


        rvDialogFriends = findViewById(R.id.rv_friends_id);

        LinearLayoutManager linearLayoutmanager = new LinearLayoutManager(this);
        rvDialogFriends.setLayoutManager(linearLayoutmanager);
        rvDialogFriends.setHasFixedSize(true);

        rvDialogFriends.setAdapter(new RVAdapterFriendsList());
    }


}
