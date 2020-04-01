package com.leaoartes.listadefilmes.model;

import java.util.List;

public class MovieMain {

    //Variaveis para criação dos itens do layout
    private String movieTitle, movieGenre, movieYear;
    private int movieImage;


    public MovieMain(){

    }

    public MovieMain(String movieTitle, String movieGenre, String movieYear, int MovieImage) {
        this.movieTitle = movieTitle;
        this.movieGenre = movieGenre;
        this.movieYear = movieYear;
        this.movieImage = MovieImage;

    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(String movieYear) {
        this.movieYear = movieYear;
    }

    public int getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(int cardMovieImage) {
        this.movieImage = cardMovieImage;
    }
}
