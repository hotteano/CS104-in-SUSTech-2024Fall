import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class ConcreteCinema implements Cinema {
    int hallIndex=1;
    int movieIndex=1;
    private List<Movie> movies;
    private List<MovieHall> halls;
    public ConcreteCinema(){
        this.halls=new ArrayList<MovieHall>();
        this.movies=new ArrayList<Movie>();
    }
    public void addMovieHall(int capacity)
    {
        halls.add(new MovieHall(capacity,hallIndex));
        hallIndex++;
    }
    public List<String> getAllMovieHallsCapacity()
    {
        List<String> list = new ArrayList<String>();
        for(MovieHall hall : halls)
        {
            list.add(hall.getCapacity());
        }
        return list;
    }
    public void addMovie(String name, int runtime, int hallNumber, double price, int type, Time startTime)
    {
        Time INF=computeTime(startTime,-20);
        Time SUP=computeTime(startTime,runtime+20);
        boolean flag=true;
        List<Movie>movies=halls.get(hallNumber-1).getMovies();
        if(movies!=null) {
            for (Movie m : movies) {
                if (comparingTime(computeTime(m.getStartTime(), m.getRuntime()), INF)) {
                    if (comparingTime(m.getStartTime(), SUP)) {
                        continue;
                    } else {
                        flag = false;
                    }
                } else if (comparingTime(SUP, m.getStartTime())) {
                    if (comparingTime(INF, computeTime(m.getStartTime(), m.getRuntime()))) {
                        continue;
                    } else {
                        flag = false;
                    }
                } else {
                    continue;
                }
            }
            if (flag) {
                if (type == 0) {
                    Movie mov = new OrdinaryMovie(movieIndex, name, startTime, runtime, price, halls.get(hallNumber - 1).getCapacity_int());
                    halls.get(hallNumber - 1).addMovie(mov);
                    this.movies.add(mov);
                    movieIndex++;
                } else if (type == 1) {
                    Movie mov = new ThreeDMovie(movieIndex, name, startTime, runtime, price, halls.get(hallNumber - 1).getCapacity_int());
                    halls.get(hallNumber - 1).addMovie(mov);
                    this.movies.add(mov);
                    movieIndex++;
                }
                else{
                    movieIndex++;
                }
            }
        }

    }
    public Time computeTime(Time time1,int time)
    {
        int h=time1.getHour();
        int m=time1.getMinute();
        Time time2= new Time(h + (m + time) / 60,(m + time + 60) % 60);
        return time2;
    }
    public boolean comparingTime(Time time1, Time time2) {
        if(time1.getHour()>=time2.getHour())
        {
            return true;
        }
        else if(time1.getHour()==time2.getHour())
        {
            if(time1.getMinute()>time2.getMinute())
            {
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    public List<Movie> getAllMovies()
    {
        return this.movies;
    }
    public int timeCompare(Time time1,Time time2)
    {
        if(comparingTime(time1,time2))
        {
            return 1;
        }
        else{
            return -1;
        }
    }
    public List<Movie> getMoviesFromMovieHallOrderByStartTime(int hallNumber)
    {
        List<Movie> movies=halls.get(hallNumber-1).getMovies();
        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                return timeCompare(m1.getStartTime(),m2.getStartTime());
            }
        });
        return movies;
    }
    public double reserveMovie(int movieId, int arg) {
        for(MovieHall hall : halls)
        {
            List<Movie>movies=hall.getMovies();
            for(Movie m:movies)
            {
                if(m.getId()==movieId)
                {
                    double price=m.purchase(arg);
                    m.addIncome(price);
                    return price;
                }
            }
        }
        return 0;
    }
    public Movie getMovieById(int movieId)
    {
        for(MovieHall hall : halls)
        {
            List<Movie>movies=hall.getMovies();
            for(Movie m:movies)
            {
                if(m.getId()==movieId)
                {
                    return m;
                }
            }
        }
        return null;
    }
    public double getOneMovieIncome(int movieId){
        for(MovieHall hall : halls)
        {
            List<Movie>movies=hall.getMovies();
            for(Movie m:movies)
            {
                if(m.getId()==movieId)
                {
                    return m.getIncome();
                }
            }
        }
        return 0;
    }

    public double getTotalIncome(){
        double total=0;
        for(MovieHall hall : halls)
        {
            List<Movie>movies=hall.getMovies();
            for(Movie m:movies)
            {
                total+=m.getIncome();
            }
        }
        return total;
    }

    public List<Movie> getAvailableMoviesByName(Time currentTime, String name){
        List<Movie> mv= new ArrayList<Movie>();
        for(MovieHall hall : halls)
        {
            List<Movie>movies=hall.getMovies();
            for(Movie m:movies)
            {
                if(m.getTicketsLeft()>0 && comparingTime(m.getStartTime(),currentTime) && m.getName().equals(name))
                {
                    mv.add(m);
                }
            }
        }

        return mv;
    }
}
