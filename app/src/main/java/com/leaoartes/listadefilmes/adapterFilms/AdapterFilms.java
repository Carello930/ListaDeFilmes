package com.leaoartes.listadefilmes.adapterFilms;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.leaoartes.listadefilmes.R;
import com.leaoartes.listadefilmes.model.films;

import java.util.List;

public class AdapterFilms extends RecyclerView.Adapter<AdapterFilms.MyViewHolder> {

    private List<films> movieListFilms;

    public AdapterFilms(List<films> movieList) {
        this.movieListFilms = movieList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View ItemsList = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_adapter, parent, false);
        return new MyViewHolder(ItemsList);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //
        films films = movieListFilms.get(position);
        holder.title.setText(films.getMovieTitle());
        holder.category.setText(films.getMovieGenre());
        holder.year.setText(films.getMovieYear());

    }

    @Override
    public int getItemCount()
    {
        return movieListFilms.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

         TextView title, year, category;

          public MyViewHolder(@NonNull View itemView) {
              super(itemView);

              title = itemView.findViewById(R.id.textViewTitle);
              year = itemView.findViewById(R.id.textViewYear);
              category = itemView.findViewById(R.id.textViewGenre);
            }
        }

}
