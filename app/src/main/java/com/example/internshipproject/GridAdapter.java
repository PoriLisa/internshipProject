package com.example.internshipproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import java.util.ArrayList;

public class GridAdapter extends Adapter<GridAdapter.GridAdapterViewHolder> {

    private Context context;
    private ArrayList<String> courselist;

    public GridAdapter(Context context, ArrayList<String> courselist) {
        this.context = context;
        this.courselist = courselist;
    }

    @NonNull
    @Override
    public GridAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.cell_grid_view, parent, false);
        return new GridAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridAdapterViewHolder holder, int position) {
        String couseName = courselist.get(position);
        holder.mTvCouseName.setText(couseName);

    }

    @Override
    public int getItemCount() {
        return courselist.size();
    }

    public class GridAdapterViewHolder extends RecyclerView.ViewHolder {
        TextView mTvCouseName;

        public GridAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            mTvCouseName = itemView.findViewById(R.id.name);
        }
    }
}
