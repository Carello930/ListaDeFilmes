package com.leaoartes.listadefilmes.mainActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.leaoartes.listadefilmes.R;
import com.leaoartes.listadefilmes.adapterFilms.AdapterFilms;
import com.leaoartes.listadefilmes.model.films;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewMain;
    private List<films> movieList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewMain = findViewById(R.id.recyclerViewMain);

        //Listagem de filmes
        this.createMovieFilms();

        //Configuração Adaptador
        AdapterFilms adapterFilms = new AdapterFilms(movieList);

        //Configuração RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewMain.setLayoutManager(layoutManager);
        recyclerViewMain.setHasFixedSize(true);
        recyclerViewMain.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerViewMain.setAdapter(adapterFilms);

    }

    public void createMovieFilms(){

        films films = new films("Homem-Aranha - De Volta ao lar", "Aventura", "2017");
        this.movieList.add(films );

        films = new films("Mulher Maravilha", "Fantasia", "2017");
        this.movieList.add(films );

        films = new films("Liga da Justiça", "Ficção", "2017");
        this.movieList.add(films );

        films = new films("Capitão América - Guerra Civíl", "Aventura/Ficção", "2016");
        this.movieList.add(films );

        films = new films("It: A Coisa", "Drama/Terror", "2017");
        this.movieList.add(films );

        films = new films("Pica=Pau: O Filme", "Comédia/Animação", "2017");
        this.movieList.add(films );

        films = new films("A Múmia", "Terror", "2017");
        this.movieList.add(films );

        films = new films("A Bela e a Fera", "Romance", "2017");
        this.movieList.add(films );

        films = new films("Meu malvado favorito 3", "Comédia", "2017");
        this.movieList.add(films );

        films = new films("Carros 3", "Comédia", "2017");
        this.movieList.add(films );

    }
}
