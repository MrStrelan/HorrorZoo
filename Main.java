public class Main {

    public static void main(String[] args) {

        // creating objects
        Animals predator = new Animals("Snake", 2, 3);
        Animals prey = new Animals("Rabbit", -1, 1);

        // Playing loop
        for (int i = 0; i <= 5; i++) {
            System.out.println("\n");
            predator.move(randomMove());
            prey.move(randomMove());

            if (Math.abs(predator.getPosition()[0] - prey.getPosition()[0]) == 1
                    || Math.abs(predator.getPosition()[1] - prey.getPosition()[1]) == 1) {
                prey.beg();
                predator.attack(prey.getPosition());
                break;
            }

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
