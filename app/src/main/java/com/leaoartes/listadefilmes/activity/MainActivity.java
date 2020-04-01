package com.leaoartes.listadefilmes.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.leaoartes.listadefilmes.R;
import com.leaoartes.listadefilmes.onClickListener.RecyclerItemClickListener;
import com.leaoartes.listadefilmes.adapter.AdapterMovieMain;
import com.leaoartes.listadefilmes.model.MovieMain;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Variavel RecyclerView
    public RecyclerView recyclerViewMain;

    //Criar um ArrayList
    public List<MovieMain> movieList = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewMain = findViewById(R.id.recyclerViewCardMovie);

        //Motodo para chamar a listagem dos filmes
        this.createMovieFilms();

        //Configuração Adaptador
        AdapterMovieMain adapterMovieMain = new AdapterMovieMain(movieList);

        //Configuração RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewMain.setLayoutManager(layoutManager);
        recyclerViewMain.setHasFixedSize(true);
        recyclerViewMain.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerViewMain.setAdapter(adapterMovieMain);


        //Evento de Click
        recyclerViewMain.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerViewMain,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {

                                Intent cardView = new Intent(MainActivity.this,
                                    CardMovieActivity.class);
                                MovieMain movieMain = movieList.get(position);

                                //Enviar String para outra Activity
                                cardView.putExtra("genre", movieMain.getMovieGenre());
                                cardView.putExtra("title", movieMain.getMovieTitle());
                                cardView.putExtra("year", movieMain.getMovieYear());

                                //ENviar imagem para outra Activity
                                Bundle bundle = new Bundle();
                                bundle.putInt("image", R.drawable.logocompleto);
                                cardView.putExtras(bundle);
                                startActivity(cardView);


                                /*Toast.makeText(
                                        getApplicationContext(),
                                        "Item pressionado: " + movieMain.getMovieTitle(),
                                        Toast.LENGTH_SHORT
                                ).show();*/
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                MovieMain movieMain = movieList.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "Item longo pressionado: " + movieMain.getMovieTitle(),
                                        Toast.LENGTH_SHORT
                                ).show();
                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                )
        );

    }


    //Listagem dos filmes (Valores)
    public void createMovieFilms(){

        MovieMain movieMain = new MovieMain("Homem-Aranha - De Volta ao lar", "Aventura", "2017", R.drawable.logosemfundo);
        this.movieList.add(movieMain);

        movieMain = new MovieMain("Mulher Maravilha", "Fantasia", "2017", R.drawable.logocompleto);
        this.movieList.add(movieMain);

        movieMain = new MovieMain("Liga da Justiça", "Ficção", "2017", R.drawable.logosemfundo);
        this.movieList.add(movieMain);

        movieMain = new MovieMain("Capitão América - Guerra Civíl", "Aventura/Ficção", "2016", R.drawable.logocompleto);
        this.movieList.add(movieMain);

        movieMain = new MovieMain("It: A Coisa", "Drama/Terror", "2017", R.drawable.logosemfundo);
        this.movieList.add(movieMain);

        movieMain = new MovieMain("Pica-Pau: O Filme", "Comédia/Animação", "2017", R.drawable.logocompleto);
        this.movieList.add(movieMain);

        movieMain = new MovieMain("A Múmia", "Terror", "2017", R.drawable.logosemfundo);
        this.movieList.add(movieMain);

        movieMain = new MovieMain("A Bela e a Fera", "Romance", "2017", R.drawable.logocompleto);
        this.movieList.add(movieMain);

        movieMain = new MovieMain("Meu malvado favorito 3", "Comédia", "2017", R.drawable.logosemfundo);
        this.movieList.add(movieMain);

        movieMain = new MovieMain("Carros 3", "Comédia", "2017", R.drawable.logocompleto);
        this.movieList.add(movieMain);

    }



}
