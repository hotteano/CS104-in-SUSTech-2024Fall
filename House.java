public class House {
    private Player player;
    private int housePrice;
    private double rent;
    public House(Player player, int housePrice) {
        this.player = player;
        this.housePrice = housePrice;
        this.rent = 0;
    }
    public Player getPlayer() {
        return player;
    }
    public int getHousePrice() {
        return housePrice;
    }
    public void setHousePrice(int housePrice) {
        this.housePrice = housePrice;
    }
    public double getRent() {
        return rent;
    }
    public void addRent(double money) {
        rent+=money;
    }
    public void setRent(double money) {
        rent=money;
    }
    @Override
    public String toString() {
        return String.format("[H P%d: %d]", player.getId(), housePrice);
    }
}
