public class Animals {

    // Attributes
    private String species;
    private int[] position = { 0, 0 };

    // Constructor
    public Animals(String newSpecies, int x, int y) {
        species = newSpecies;
        position[0] = x;
        position[1] = y;
    }

    // Methods

    // Move method - modify animal's position
    public void move(String direction) {
        if (direction == "left") {
            position[0] = position[0] - 1;
        } else if (direction == "right") {
            position[0] = position[0] + 1;
        } else if (direction == "up") {
            position[1] = position[1] - 1;
        } else if (direction == "down") {
            position[1] = position[1] + 1;
        } else {
            System.out.println("incorrect parameter in the move method");
        }
        System.out.println("I am the " + species + ", I am standing on square " + position[0] + ", " + position[1]);
    }

    // Attack method (only for snake)
    public void attack() {
        System.out.println("Omn omn omn I'm eating you wahahahahahaa!!!");
    }

    // Begging method (only for rabbit)
    public void beg() {
        System.out.println("Nooooo Please don't eat me!!!");
    }

    // Getters
    public int[] getPosition() {
        return position;
    }

    public String getSpecies() {
        return species;
    }

}
