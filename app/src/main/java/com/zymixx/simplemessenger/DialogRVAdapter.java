package com.zymixx.simplemessenger;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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

    }

    @Override
    public int getItemCount() {
        return 12;
    }

    static int testint = 0;

    class DialogHolder extends RecyclerView.ViewHolder{

        DialogHolder(View v){
            super(v);
            testint++;
            if (testint == 4){
                LinearLayout frameLayout = v.findViewById(R.id.message_frame);
                FrameLayout interFrame = frameLayout.findViewById(R.id.inter_frame_message);
                frameLayout.setGravity(Gravity.RIGHT);
                interFrame.setBackground(DialogScreen.uzerRect);
              //  interFrame.setForegroundGravity(Gravity.RIGHT);
                TextView text = v.findViewById(R.id.message_text);
                text.setText("ЛЮБОЙ ДРУГОЙ ТЕКСТ");
            }
        }
    }
}
