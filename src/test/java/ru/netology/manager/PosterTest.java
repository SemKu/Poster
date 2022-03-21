package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class PosterTest {
    Movie first = new Movie("first", 1);
    Movie second = new Movie("second", 2);
    Movie third = new Movie("third", 3);
    Movie fourth = new Movie("fourth", 4);
    Movie fifth = new Movie("fifth", 5);
    Movie sixth = new Movie("sixth", 6);
    Movie seventh = new Movie("seventh", 7);
    Movie eighth = new Movie("eighth", 8);
    Movie ninth = new Movie("ninth", 9);
    Movie tenth = new Movie("tenth", 10);
    Movie eleventh = new Movie("eleventh", 11);

    @Test
    public void shouldAddedMovie() {


        Poster poster = new Poster();
        poster.add(first);

        Movie[] expected = {first};
        Movie[] actual = poster.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddedAllMovie() {

        Poster poster = new Poster();
        poster.add(first);
        poster.add(second);
        poster.add(tenth);
        poster.add(third);
        poster.add(fourth);
        poster.add(fifth);
        poster.add(sixth);
        poster.add(seventh);
        poster.add(eighth);
        poster.add(eleventh);
        poster.add(ninth);


        Movie[] expected = {first, second, tenth, third, fourth, fifth, sixth, seventh, eighth, eleventh, ninth};
        Movie[] actual = poster.findAll();
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddedMoreMaxNumberMoviesWithoutParametersConstructor() {

        Poster poster = new Poster();

        poster.add(first);
        poster.add(second);
        poster.add(third);
        poster.add(fourth);
        poster.add(fifth);
        poster.add(sixth);
        poster.add(seventh);
        poster.add(eighth);
        poster.add(ninth);
        poster.add(tenth);
        poster.add(eleventh);


        Movie[] actual = poster.getFindLast();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddedMaxNumberMoviesReverseOrderFromAdditionWithoutParametersConstructor() {
        Poster poster = new Poster();
        poster.add(first);
        poster.add(fifth);
        poster.add(second);
        poster.add(third);
        poster.add(fourth);
        poster.add(sixth);
        poster.add(seventh);
        poster.add(eighth);
        poster.add(tenth);
        poster.add(ninth);

        Movie[] actual = poster.getFindLast();
        Movie[] expected = new Movie[]{ninth, tenth, eighth, seventh, sixth, fourth, third, second, fifth, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddedMinNumberMoviesWithoutParametersConstructor() {
        Poster poster = new Poster();

        poster.add(sixth);

        Movie[] actual = poster.getFindLast();
        Movie[] expected = new Movie[]{sixth};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddedNumberMoviesReverseOrderFromAdditionWithParametersConstructor() {
        Poster poster = new Poster(5);

        poster.add(first);
        poster.add(tenth);
        poster.add(third);
        poster.add(fourth);
        poster.add(fifth);
        poster.add(sixth);
        poster.add(seventh);
        poster.add(eighth);
        poster.add(eleventh);
        poster.add(second);
        poster.add(ninth);

        Movie[] actual = poster.getFindLast();
        Movie[] expected = new Movie[]{ninth, second, eleventh, eighth, seventh};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldEmptyPosterWithParametersConstructor() {
        Poster poster = new Poster(0);

        poster.add(null);

        Movie[] actual = poster.getFindLast();
        Movie[] expected = new Movie[]{};
        assertArrayEquals(expected, actual);
    }

}