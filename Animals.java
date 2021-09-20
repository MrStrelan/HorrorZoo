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

    // Getters
    public String getPosition() {
        return position[0] + ", " + position[1];
    }

    public String getSpecies() {
        return species;
    }

}
