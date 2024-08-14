package Interface;

public class Car implements Engine, Brake{ // Multiple inheritance

    @Override
    public void brake() {
        System.out.println("Brake");
    }

    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate");
    }
}
