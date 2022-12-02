package lecture6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
    ArrayList<Integer> intLists = new ArrayList<>();
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    for(int i = 0 ;i < 5; i++){
        intLists.add(random.nextInt(1,6));

        }
    System.out.println("さいころを5つ振りました。参照したいさいころを入力してください");
    try{
    int index = scanner.nextInt();
        System.out.println(intLists.get(index));
    }catch (IndexOutOfBoundsException e){
        System.out.println("範囲外にアクセスしています。終了します");
        System.exit(1);
        }
    }
}
