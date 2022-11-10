package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter(100,30,"小松川先生");
        Fighter fighter2 = new Fighter(150,35,"山川先生");

        while(Boolean.TRUE){
            fighter1.attack(fighter2);
            if(fighter2.isAlive()==Boolean.TRUE){
                System.out.println(fighter2.getName()+"の残りHP:"+fighter2.getHp()+"\n");
            }else{
                System.out.println(fighter2.getName()+"はちからつきた。");
                break;
            }
            fighter2.attack(fighter1);
            if(fighter1.isAlive()==Boolean.TRUE){
                System.out.println(fighter1.getName()+"の残りHP:"+fighter1.getHp()+"\n");
            }else{
                System.out.println(fighter1.getName()+"はちからつきた。");
                break;
            }

        }
    }
}
