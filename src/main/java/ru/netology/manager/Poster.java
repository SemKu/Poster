package ru.netology.manager;

import ru.netology.domain.Movie;

public class Poster {
    private Movie[] movies = new Movie[0];
    private int moviesPoster = 10;

    public Poster() {

    }

    public Poster(int moviesPoster) {
        this.moviesPoster = moviesPoster;
    }


    public void save(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] findAll() {
        return movies;
    }

    public void add(Movie movie) {
        save(movie);
    }

    public Movie[] getFindLast() {
        int resultLength = Math.min(moviesPoster, movies.length);
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}
