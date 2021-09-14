public class Animals {

    // Attributes
    private String species;
    private int[] position;

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
    }

    // Getters
    public int[] getPosition() {
        return position;
    }

    public String getSpecies() {
        return species;
    }

}
