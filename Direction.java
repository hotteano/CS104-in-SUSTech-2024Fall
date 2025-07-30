public class Direction {
    private int row;
    private int col;
    private int id;
    public Direction(int id) {
        this.id = id;
        setDirection(id);
    }
    public void setDirection(int id) {
        switch (id) {
            case 1:
                row = 0;
                col = 1;
                break;
            case 2:
                row = -1;
                col = 1;
                break;
            case 3:
                row = -1;
                col = 0;
                break;
            case 4:
                row = -1;
                col = -1;
                break;
            case 5:
                row = 0;
                col = -1;
                break;
            case 6:
                row = 1;
                col = -1;
                break;
            case 7:
                row = 1;
                col = 0;
                break;
            case 8:
                row = 1;
                col = 1;
                break;
            default:
                System.out.println("Invalid direction");
                break;
        }
    }
    public void setDirection()
    {
        id=(id+1)%9;
        setDirection(id);
    }
    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }
}
