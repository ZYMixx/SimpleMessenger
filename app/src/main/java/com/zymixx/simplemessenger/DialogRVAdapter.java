package com.zymixx.simplemessenger;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class DialogRVAdapter extends RecyclerView.Adapter<DialogRVAdapter.DialogHolder> {


    @NonNull
    @Override
    public DialogHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        int idForDialogRV = R.layout.messeg_window;
        View v = inflater.inflate(idForDialogRV, parent, false);
        DialogHolder dialogHolder = new DialogHolder(v);

        return dialogHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DialogHolder holder, int position) {
            String[] messPull = TestClass.hashMap.get(position);
        String text = messPull[0];
        String date = messPull[1];
        String user = messPull[2];
        testint++;

        if (user.equals("0")){
            forUserMassageStyle(holder.itemView, text, date);
        } else {
            forFriendMassageStyle(holder.itemView, text, date);
        }

    }

    @Override
    public int getItemCount() {
        return TestClass.hashMap.size();
    }


    public void forFriendMassageStyle(View v, String text, String date){
        TextView timeTV = v.findViewById(R.id.message_time);
        TextView textTV = v.findViewById(R.id.message_text);
        textTV.setText(text);
        timeTV.setText(date);

        LinearLayout linearLayout = v.findViewById(R.id.message_frame);
        FrameLayout interFrame = linearLayout.findViewById(R.id.inter_frame_message);
        linearLayout.setGravity(Gravity.LEFT);

        ImageView imageView = v.findViewById(R.id.second_test_frame);
        ImageView imageView2 = v.findViewById(R.id.first_test_frame);
        imageView.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.VISIBLE);

    }

    public void forUserMassageStyle(View v, String text, String date){

        TextView timeTV = v.findViewById(R.id.message_time);
        TextView textTV = v.findViewById(R.id.message_text);
        textTV.setText(text);
        timeTV.setText(date);


        LinearLayout linearLayout = v.findViewById(R.id.message_frame);
        FrameLayout interFrame = linearLayout.findViewById(R.id.inter_frame_message);
        linearLayout.setGravity(Gravity.RIGHT);

        ImageView imageView = v.findViewById(R.id.first_test_frame);
        ImageView imageView2 = v.findViewById(R.id.second_test_frame);
        imageView.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.VISIBLE);



    }


    static int testint = 0;

    class DialogHolder extends RecyclerView.ViewHolder{


        DialogHolder(View v){
            super(v);
            System.out.println(getAdapterPosition());
        }


    }
}
