package com.zymixx.simplemessenger;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class RVAdapter extends RecyclerView.Adapter<RVAdapter.FriendsPage> {

    @NonNull
    @Override
    public FriendsPage onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdFriendsPage = R.layout.friends_page;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutIdFriendsPage, parent, false);
        FriendsPage friendsPage = new FriendsPage(view);


        return friendsPage;
    }

    @Override
    public void onBindViewHolder(@NonNull FriendsPage holder, int position) {

    }



    @Override
    public int getItemCount() {
        return 10;
    }

    class FriendsPage extends  RecyclerView.ViewHolder{
        FriendsPage(View v){
            super(v);
        }
    }
}
