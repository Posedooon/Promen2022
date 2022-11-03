package lecture02;

public class Exercise2_2 {
    public static void main(String[] args) {
        /*2-3の変更による影響でここないとエラー起こっちゃいます*/
        Tire[] tires = new Tire[4];

        for(int i = 0;i < tires.length;i++){
            tires[i] = new Tire(65);
        }

        Engine engine = new Engine(4000);
        Car car = new Car(tires,engine);
        car.run();
        GasStation gasStation = new GasStation();
        gasStation.refuel(car);
        car.run();
    }
}
