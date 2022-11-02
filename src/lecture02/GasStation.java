package lecture02;

public class GasStation {
    int fuel;
    void refuel(Car car){
       fuel= car.getFuel() + 20;
        car.setFuel(fuel);
        System.out.println("給油してfuelが"+fuel+"になりました");
    }
}
