public class TestPlayer {
    public static void main(String[] args) {
        Player p1 = new Player(1);
        Player p2 = new Player(2);

        Land l1 = new Land(LandColor.RED);
        Land l2 = new Land(LandColor.BLUE);
        Land l3 = new Land(LandColor.BLACK);

        System.out.println(p1.toString());
        System.out.println(p1.buildHouse(l1, 55));//true
        System.out.println(p1.buildHouse(l2, 100));//false
        System.out.println(p2.buildHouse(l1, 50));//false
        System.out.println(p2.buildHouse(l2, 0));//false
        System.out.println(p2.buildHouse(l2, 50));//true
        System.out.println(p2.buildHouse(l3, 50));//true
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
}
