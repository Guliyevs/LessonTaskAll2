package object_class_constructor;

public class Audi {
    int horsePower;
    Engine engine;

    public Audi(int horsePower, Engine engine) {
        this.horsePower = horsePower;
        this.engine = engine;
    }

    public void startCar() {
        engine.startEngine();
    }
}
