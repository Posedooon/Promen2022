package lecture03;

import java.util.Scanner;
//parseIntを使うタイプ
public class Exercise3_3_another {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("一つ目の整数を入力してください:");
        String number1 = scanner.nextLine();
        int num1 = Integer.parseInt(number1);

        System.out.print("二つ目の整数を入力してください:");
        String  number2 = scanner.nextLine();
        int num2 = Integer.parseInt(number2);
        int sum = num1+num2;
        System.out.println(number1 + "+" + number2 +"=" + sum);
    }
}