package com.leaoartes.listadefilmes.adapterFilms;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.leaoartes.listadefilmes.R;

public class AdapterFilms extends RecyclerView.Adapter<AdapterFilms.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View ItemsList = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_adapter, parent, false);
        return new MyViewHolder(ItemsList);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

            TextView title, year, category;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
            }
        }

}
