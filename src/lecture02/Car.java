package lecture02;

public class Car {
    private int fuel;
    private Tire[] tires;
    private Engine engine;
    /*コンストラクタ*/
    Car(Tire[] tires,Engine engine){
        this.fuel = 0;
        this.tires = tires;
        this.engine = engine;
    }

    public void run(){
        if(fuel > 0) {
            System.out.println("燃料を1消費して走行");
            fuel--;
        }else{
            System.out.println("燃料が切れて走れません");
            }
        }
    public void startEngine(){
        engine.start();
    }
    /*セッター*/
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    /*ゲッター*/

    public int getFuel() {
        return fuel;
    }
}

