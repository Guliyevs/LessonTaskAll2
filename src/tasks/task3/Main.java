package tasks.task3;

public class Main {
    public static void main(String[] args) {
        while (true) {
            for (TrafficLight light : TrafficLight.values()) {
                System.out.println("\n--- " + light + " light started ---");

                int seconds = light.getDurationInSeconds();

                while (seconds > 0) {
                    System.out.println(light + " seconds remaining: " + seconds);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("An error occurred during waiting.");
                    }

                    seconds--;
                }
            }
            System.out.println("\nSequence completed.");
        }
    }
}
