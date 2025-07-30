import java.util.ArrayList;
import java.util.List;

public class MovieHall {
    private int capacity;
    private int id;
    private List<Movie>movies;
    public MovieHall(int capacity, int id) {
        this.capacity = capacity;
        this.id = id;
        this.movies = new ArrayList<Movie>();
    }
    public String getCapacity() {
        return String.format("%d-%d", id, capacity);
    }
    public List<Movie> getMovies() {
        return movies;
    }
    public int getCapacity_int()
    {
        return capacity;
    }
    public void addMovie(Movie movie)
    {
        movies.add(movie);
    }
}
