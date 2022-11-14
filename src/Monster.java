public class Monster {
    public static void main(String[] args) {
        Status srime = new Status(1,1,"スライム");
        Status chottotuyoi = new Status(10,25,"ちょっと強い敵");
        Status maou = new Status(100,70,"山川広人");

        srime.Print();
        chottotuyoi.Print();
        maou.Print();
    }
}
