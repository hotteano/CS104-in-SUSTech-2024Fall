public class OrdinaryMovie extends Movie {
    public OrdinaryMovie(int id, String name, Time startTime, int runtime, double price, int ticketsLeft) {
        super(id, name, startTime, runtime, price, ticketsLeft);
    }

    @Override
    public String toString()
    {
        return "id="+getId()+", name='"+getName()+"', startTime:"+getStartTime()+", runtime="+getRuntime()+", price="+getPrice()+", ticketsLeft="+getTicketsLeft()+" OrdinaryMovie";
    }
    public double purchase(int arg)
    {
        if(getTicketsLeft()-arg<=0)
        {
            int p=getTicketsLeft();
            setTicketsLeft(0);
            return getPrice()*p;
        }
        else{
            ticketMinus(arg);
            return getPrice()*arg;
        }
    }
}
