public class Animals {

    // Attributes
    private String kind;
    private int x;
    private int y;

    public Animals(String kind, int x, int y) {
        this.kind = kind;
        this.x = x;
        this.y = y;
    }

    public void up() {
        this.y = y + 1;
        System.out.println("I am the " + this.kind + ", I am now standing on square" + this.x + ", " + this.y);
    }

    public void down() {
        this.y = y - 1;
        System.out.println("I am the " + this.kind + ", I am now standing on square" + this.x + ", " + this.y);
    }

    public void left() {
        this.x = x - 1;
        System.out.println("I am the " + this.kind + ", I am now standing on square" + this.x + ", " + this.y);
    }

    public void right() {
        this.x = x + 1;
        System.out.println("I am the " + this.kind + ", I am now standing on square" + this.x + ", " + this.y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
