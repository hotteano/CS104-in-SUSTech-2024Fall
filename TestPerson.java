public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person(0,-1,1);
        p.walk(3);
        p.changeDirection();
        System.out.println(p.toString());
        p.walk(2);
        p.changeDirection();
        System.out.println(p.toString());
        p.walk(5);
        p.changeDirection();
        System.out.println(p.toString());
    }
}
