public class Person {
    private Direction direction;
    private int i;
    private int j;
    public Person(int i, int j, int index) {
        this.i = i;
        this.j = j;
        Direction di=new Direction(index);
        this.direction=di;
    }
    public Direction getDirection() {
        return direction;
    }
    public void changeDirection() {
        direction.setDirection();
    }
    public void walk(int steps) {
        i+= direction.getRow()*steps;
        j+= direction.getCol()*steps;
    }
    public String toString(){
        return String.format("(%d, %d)",i,j);
    }
}
