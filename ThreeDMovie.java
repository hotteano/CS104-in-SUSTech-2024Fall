public class ThreeDMovie extends Movie {
    private final int GLASS_PRICE = 20;
    public ThreeDMovie(int id, String name, Time startTime, int runtime, double price, int ticketsLeft) {
        super(id, name, startTime, runtime, price, ticketsLeft);
    }
    @Override
    public String toString()
    {
        return "id="+getId()+", name='"+getName()+"', startTime:"+getStartTime()+", runtime="+getRuntime()+", price="+getPrice()+", ticketsLeft="+getTicketsLeft()+" ThreeDMovie";
    }
    public double purchase(int arg)
    {
        if(getTicketsLeft()>0)
        {
            if(arg==1)
            {
                ticketsLeft--;
                return GLASS_PRICE+getPrice();
            }
            else{
                ticketsLeft--;
                return getPrice();
            }
        }
        else{
            return 0;
        }
    }
}
