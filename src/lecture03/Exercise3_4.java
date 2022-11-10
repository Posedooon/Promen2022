package lecture03;

import java.util.ArrayList;

public class Exercise3_4 {
    public static void main(String[] args) {
        ArrayList<Vegetable> lists = new ArrayList<>();
        lists.add(new Vegetable("にんじん",117));
        lists.add(new Vegetable("たまねぎ",120));
        lists.add(new Vegetable("じゃがいも",154));

        for (Vegetable list : lists){
            list.print();
        }
    }
}
