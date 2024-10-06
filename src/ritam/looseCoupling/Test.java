package ritam.looseCoupling;

public class Test {
    public static void main(String[] args) {
        EngineFactory engineFactory = new EngineFactory();
        Car car = new Car(engineFactory.getInstance("Petrol"));
        car.start();
    }
}
