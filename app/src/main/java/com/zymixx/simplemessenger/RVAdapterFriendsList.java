package com.zymixx.simplemessenger;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class RVAdapterFriendsList extends RecyclerView.Adapter<RVAdapterFriendsList.FriendsPage> {

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

    public class FriendsPage extends  RecyclerView.ViewHolder{
        FriendsPage(View v){
            super(v);
            setOnPressElementsAction(v);

        }

        public void setOnPressElementsAction(View v){
            FrameLayout friendsDialogFL = v.findViewById(R.id.friends_page_id_frame);
            friendsDialogFL.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), DialogScreen.class);
                    v.getContext().startActivity(intent);
                }
            });

            View.OnClickListener toProfileButton = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast toast = Toast.makeText(v.getContext(), "to Profile", Toast.LENGTH_LONG);
                    toast.show();
                }
            };

            ImageView avatarImage = v.findViewById(R.id.friends_avatar_fl);
            avatarImage.setOnClickListener(toProfileButton);
            TextView friendsName = v.findViewById(R.id.friends_name);
            friendsName.setOnClickListener(toProfileButton);
        }
    }
}
