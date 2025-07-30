public abstract class Movie {
    private int id;
    private String name;
    private Time startTime;
    private int runtime;
    private double price;
    protected int ticketsLeft;
    private double income=0;
    public Movie(int id, String name, Time startTime, int runtime, double price, int ticketsLeft) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.runtime = runtime;
        this.price = price;
        this.ticketsLeft = ticketsLeft;
    }
    @Override
    public String toString() {
       return
       "id="+id+", name="+name+", startTime="+startTime+", runtime="+runtime+", price="+price+", ticketsLeft="+ticketsLeft;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Time getStartTime() {
        return startTime;
    }
    public int getRuntime() {
        return runtime;
    }
    public double getPrice() {
        return price;
    }
    public int getTicketsLeft() {
        return ticketsLeft;
    }
    public void ticketMinus(int arg)
    {
        ticketsLeft-=arg;
    }
    public void setTicketsLeft(int arg) {
        ticketsLeft = arg;
    }
    public abstract double purchase(int arg);
    public void addIncome(double arg) {
        income += arg;
    }
    public double getIncome() {
        return income;
    }
    public void setId(int id) {
        this.id = id;
    }
}
