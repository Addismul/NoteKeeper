package com.example.notekeeper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NoteRecyclerAdapter extends RecyclerView.Adapter<NoteRecyclerAdapter.viewHolder> {
    private  final Context mContext;

    public NoteRecyclerAdapter(Context mContext) {
        this.mContext = mContext;
        LayoutInflater layoutInflater=LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public  class viewHolder extends RecyclerView.ViewHolder{

        public viewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
