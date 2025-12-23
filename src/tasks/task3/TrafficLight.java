package tasks.task3;

public enum TrafficLight {
    GREEN(7),
    YELLOW(3),
    RED(5);

    private final int durationInSeconds;

    TrafficLight(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }
}
