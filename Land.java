public class Land {
    private House house;
    private LandColor color;
    public Land(LandColor color)
    {
        this.color = color;
    }
    public House getHouse()
    {
        return house;
    }
    public LandColor getColor()
    {
        return color;
    }
    public void setHouse(Player player, int housePrice)
    {
        this.house= new House(player, housePrice);
    }
    public void removeHouse()
    {
        this.house=null;
    }
    public void setColor(LandColor color)
    {
        this.color = color;
    }
    public String toString()
    {
        return String.format("Land %s: %s",this.color,house != null ? house.toString() : "");
    }
}
