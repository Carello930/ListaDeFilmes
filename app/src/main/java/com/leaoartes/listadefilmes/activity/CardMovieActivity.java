package com.leaoartes.listadefilmes.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.leaoartes.listadefilmes.R;
import com.leaoartes.listadefilmes.model.MovieMain;



import java.util.List;

public class CardMovieActivity extends AppCompatActivity {


    public TextView textViewTitleCard, textViewYearCard, textViewDescriptionCard;
    public ImageView imageViewCardMovie;

    private List<MovieMain> movieList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_movie);

        listItemClicked();

        textViewDescriptionCard = findViewById(R.id.textViewDescriptionCard);
        textViewTitleCard = findViewById(R.id.textViewTitleCard);
        textViewYearCard = findViewById(R.id.textViewYearCard);
        imageViewCardMovie = findViewById(R.id.imageViewCardMovie);



    }

    public void listItemClicked(){

        if(getIntent().hasExtra("genre") && getIntent().hasExtra("title") && getIntent().hasExtra("year") && getIntent().hasExtra("image")){

            String genre = getIntent().getStringExtra("genre");
            String title = getIntent().getStringExtra("title");
            String year = getIntent().getStringExtra("year");

            setItems(genre, title, year);

        }

    }

    public void setItems(String genre, String title, String year){

        textViewDescriptionCard = findViewById(R.id.textViewDescriptionCard);
        textViewDescriptionCard.setText(genre);

        textViewTitleCard = findViewById(R.id.textViewTitleCard);
        textViewTitleCard.setText(title);

        textViewYearCard = findViewById(R.id.textViewYearCard);
        textViewYearCard.setText(year);

        imageViewCardMovie = findViewById(R.id.imageViewCardMovie);
        Bundle bundle = this.getIntent().getExtras();
        int imageList = bundle.getInt("image");
        imageViewCardMovie.setImageResource(imageList);


    }


}


