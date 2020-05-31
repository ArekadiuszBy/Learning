package com.company;

import com.sun.source.doctree.SystemPropertyTree;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int ordinal = MovieCategory.ROMANTIC.ordinal();
        System.out.println(ordinal);                //zwracanie pozycji ROMANTIC w enumie

        MovieCategory romantic = MovieCategory.ROMANTIC;
        MovieCategory horror = MovieCategory.HORROR;

        int j = romantic.compareTo(horror);
        System.out.println(j);

        List<Movie> movies = Arrays.asList(
                new Movie("Titanic", MovieCategory.ROMANTIC),
                new Movie("Matrix", MovieCategory.ACTION),
                new Movie("Shrek", MovieCategory.ACTION)
        );

        
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Podaj kategorie: (Dostępne)");

        MovieCategory[] movieCategories =  MovieCategory.values();

        for (MovieCategory movieCategory : movieCategories) {
            System.out.println(movieCategory.name());
        }
        
        String userInput = scanner.nextLine();

        MovieCategory movieCategory = MovieCategory.valueOf(userInput);

        System.out.println("Filmy z tej kategorii:");

        for (Movie movie : movies) {
            if (movie.getMovieCategory() == movieCategory) {      //mozna zamiast equals dać ==, bo enumy są tylko raz zdefiniowane
                System.out.println(movie.getTitle() + " " + movie.getMovieCategory());
            }

            if (movie.getMovieCategory().name().equals(userInput)) {
                System.out.println(movie.getTitle());
            }
        }

        System.out.println();  System.out.println();

        //is cool
        for (MovieCategory movieCategory1 : MovieCategory.values()) {
            System.out.println(movieCategory1+" "+ movieCategory1.isCool());
        }

    }
}
