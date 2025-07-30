public class Player {
    private int id;
    private double money;
    private int location;
    private boolean isActive;
    public Player(int id) {
        this.id = id;
        this.isActive = true;
        this.money = 100;
        this.location = 0;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }
    public int getLocation() {
        return location;
    }
    public void setLocation(int location) {
        this.location = location;
    }
    public boolean getStatus() {
        return isActive;
    }
    public String toString()
    {
        if(isActive)return String.format("Player %d: at %d, has %.1f", id, location, money);
        else{
            return String.format("Player %d: Failed", id);
        }
    }
    public double payRent(double housePrice)
    {
        if(this.money >= housePrice*0.5)
        {
            money -= housePrice*0.5;
            return housePrice*0.5;
        }
        else{
            isActive = false;
            double m=money;
            this.money = 0;
            return m;
        }
    }
    public void collectRent(double rentPrice)
    {
        money += rentPrice;
    }
    public boolean buildHouse(Land land, int housePrice)
    {
        if(land.getHouse()!=null || housePrice==0 || money<housePrice)
        {
            return false;
        }
        else{
            this.money-=housePrice;
            land.setHouse(this,housePrice);
            return true;
        }
    }
    public void setActive(boolean active){
        isActive = active;
    }
}
