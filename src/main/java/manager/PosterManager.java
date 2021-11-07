package manager;

public class PosterManager {
    private Movie [] movies = new Movie[0];
    private int moviesCount;

    public PosterManager(int moviesCount) {
        this.moviesCount = moviesCount;
    }

    public PosterManager() {
        this.moviesCount = 10;
    }

    public void addMovie(Movie movieItem){

        int len = movies.length + 1;
        Movie [] tmp = new Movie[len];

        for (int i = 0; i< movies.length; i++){
            tmp[i] = movies[i];
        }

        int lastIndex = tmp.length-1;
        tmp[lastIndex] = movieItem;
        movies = tmp;
    }

    public Movie[] getLastMovies(){
        int resultLength;
        if (moviesCount > movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = moviesCount;
        }

        Movie[] result = new Movie[resultLength];
        for (int i = 0; i< resultLength; i++) {
            int index = movies.length - i -1;
            result[i] = movies[index];
        }

        return result;
    }
}
