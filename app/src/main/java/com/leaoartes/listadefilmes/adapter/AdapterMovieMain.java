package com.leaoartes.listadefilmes.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.leaoartes.listadefilmes.R;
import com.leaoartes.listadefilmes.model.MovieMain;

import java.util.List;

public class AdapterMovieMain extends RecyclerView.Adapter<AdapterMovieMain.MyViewHolder> {

    private List<MovieMain> movieListFilms;

    public AdapterMovieMain(List<MovieMain> movieList) {
        this.movieListFilms = movieList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View ItemsList = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_list_adapter, parent, false);
        return new MyViewHolder(ItemsList);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //
        MovieMain movieMain = movieListFilms.get(position);
        holder.title.setText(movieMain.getMovieTitle());
        holder.category.setText(movieMain.getMovieGenre());
        holder.year.setText(movieMain.getMovieYear());
        holder.movieImageView.setImageResource(movieMain.getMovieImage());

    }

    @Override
    public int getItemCount()
    {
        return movieListFilms.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

         TextView title, year, category;
        ImageView movieImageView;

          public MyViewHolder(@NonNull View itemView) {
              super(itemView);

              title = itemView.findViewById(R.id.textViewCardMovieTitle);
              year = itemView.findViewById(R.id.textViewCardMovieYear);
              category = itemView.findViewById(R.id.textViewGenre);
              movieImageView = itemView.findViewById(R.id.imageViewCardMovie);
            }
        }

}
