public class Main {
    public static void main(String[] args) {

        // creating objects
        Animals predator = new Animals("Snake", 0, 3);
        Animals prey = new Animals("Rabbit", -1, 1);
        prey.right();

        // Checking if Snake sees the Rabbit
        if (prey.getX() == predator.getX() && (predator.getY() - prey.getY()) == 1) {
            System.out.println("Nooooo Please don't eat me!!!");
            predator.down();
            System.out.println("Omn omn omn I'm eating you wahahahahahaa!!!");
        }
        if (prey.getX() == predator.getX() && (predator.getY() - prey.getY()) == -1) {
            System.out.println("Nooooo Please don't eat me!!!");
            predator.up();
            System.out.println("Omn omn omn I'm eating you wahahahahahaa!!!");
        }
        if (prey.getY() == predator.getY() && (predator.getX() - prey.getX()) == 1) {
            System.out.println("Nooooo Please don't eat me!!!");
            predator.right();
            System.out.println("Omn omn omn I'm eating you wahahahahahaa!!!");
        }
        if (prey.getY() == predator.getY() && (predator.getX() - prey.getX()) == -1) {
            System.out.println("Nooooo Please don't eat me!!!");
            predator.left();
            System.out.println("Omn omn omn I'm eating you wahahahahahaa!!!");
        }
        predator.down();

        // Checking if Snake sees the Rabbit
        if (prey.getX() == predator.getX() && (predator.getY() - prey.getY()) == 1) {
            System.out.println("Nooooo Please don't eat me!!!");
            predator.down();
            System.out.println("Omn omn omn I'm eating you wahahahahahaa!!!");
        }
        if (prey.getX() == predator.getX() && (predator.getY() - prey.getY()) == -1) {
            System.out.println("Nooooo Please don't eat me!!!");
            predator.up();
            System.out.println("Omn omn omn I'm eating you wahahahahahaa!!!");
        }
        if (prey.getY() == predator.getY() && (predator.getX() - prey.getX()) == 1) {
            System.out.println("Nooooo Please don't eat me!!!");
            predator.right();
            System.out.println("Omn omn omn I'm eating you wahahahahahaa!!!");
        }
        if (prey.getY() == predator.getY() && (predator.getX() - prey.getX()) == -1) {
            System.out.println("Nooooo Please don't eat me!!!");
            predator.left();
            System.out.println("Omn omn omn I'm eating you wahahahahahaa!!!");
        }

    }
}
