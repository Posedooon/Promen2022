package lecture04;

public class Fighter {
    private int hp;
    private int pow;
    private String name;

    public Fighter(int hp,int pow,String name) {
        this.hp = hp;
        this.pow = pow;
        this.name = name;
    }
    public void attack(Fighter enemy){
        System.out.println(name+"は"+enemy.name+"に"+pow+"ダメージ");
        enemy.hp -= pow;

    }
    //死んでいたらFalseを返すように設計
    public boolean isAlive() {
        if (hp <= 0) {
           return false;
        }
        return true;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }
}
