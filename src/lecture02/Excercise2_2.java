package lecture02;

public class Excercise2_2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.run();
        GasStation gasStation = new GasStation();
        gasStation.refuel(car);
        car.run();
    }
}
