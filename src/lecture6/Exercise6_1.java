package lecture6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("小数値を入力：");
        try{
           var input = scanner.nextFloat();
            System.out.println(input);
        }catch (InputMismatchException e){
            System.out.println("エラー.");
        }
    }
}
