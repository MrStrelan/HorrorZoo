public class Main {

    public static void main(String[] args) {

        // creating objects
        Animals predator = new Animals("Snake", 0, 3);
        Animals prey = new Animals("Rabbit", -1, 1);

        // Playing loop
        for (int i = 0; i >= 5; i++) {
            predator.move(randomMove());
            prey.move(randomMove());
            System.out.println(
                    "I am the " + predator.getSpecies() + ", I am standing on square " + predator.getPosition());
            System.out.println("I am the " + prey.getSpecies() + ", I am standing on square " + prey.getPosition());
        }

    }

    // Method that returns one randomly generated direction
    private static String randomMove() {
        String[] availableDirections = { "left", "right", "up", "down" };
        java.util.Random random = new java.util.Random();
        int randomDirection = random.nextInt(availableDirections.length);
        return availableDirections[randomDirection];
    }

}
