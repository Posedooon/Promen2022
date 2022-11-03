package lecture03;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("何行入力しますか？>");
        int number = scanner.nextInt();scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        for(int i = 1;i <= number;i++){
            System.out.println(i + "行目:");
            String input = scanner.nextLine();
            list.add(input);
        }
        System.out.println("入力した文字列");
        for(String sting:list){
            System.out.println("["+list.indexOf(sting)+"]"+sting);
        }
    }
}
