package lecture02;

public class Engine {
   private int rpm;
    Engine(int rpm){
        this.rpm = rpm;
    }

    public void start(){
        System.out.println("エンジンを始動させました。回転数は"+rpm+"です。");

    }
}
