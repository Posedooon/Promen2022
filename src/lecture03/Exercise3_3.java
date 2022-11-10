package lecture03;

import java.util.Scanner;
//3_2をそのまま行くタイプ
public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("一つ目の整数を入力してください:");
        int number1 = scanner.nextInt();scanner.nextLine();

        System.out.print("二つ目の整数を入力してください:");
        int number2 = scanner.nextInt();scanner.nextLine();
        int sum = number1+number2;
     System.out.println(number1 + "+" + number2 +"=" + sum);
    }
}
