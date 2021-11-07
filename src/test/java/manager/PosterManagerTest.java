package manager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PosterManagerTest {

    @org.junit.jupiter.api.Test
    void addMovie() {

        PosterManager manager = new PosterManager();

        Movie first = new Movie(1, "first");
        Movie sec = new Movie(2, "sec");

        manager.addMovie(first);
        manager.addMovie(sec);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{sec, first};

        assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void getLastMovies() {

        PosterManager manager = new PosterManager(3);

        Movie first = new Movie(1, "first");
        Movie sec = new Movie(2, "sec");
        Movie third = new Movie(3, "third");
        Movie fourth = new Movie(4, "fourth");

        manager.addMovie(first);
        manager.addMovie(sec);
        manager.addMovie(third);
        manager.addMovie(fourth);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{fourth, third, sec};

        assertArrayEquals(expected, actual);
    }
}