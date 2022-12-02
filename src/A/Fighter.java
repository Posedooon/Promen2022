package A;


public class Fighter {
    //private修飾子がついていない
     int hitPoint;
    int power;
    String name;
//コンストラクタの修飾子忘れてる
    Fighter(int hitPoint, int power, String name) {
        //Good！学んだことを生かせている
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    public void attack( Fighter enemy ) {
        //根本的にどこのhitPointを使っているのか明示されていないから、fighter1の持つHPのフィールドで処理が進んでいる
        enemy.hitPoint = enemy.hitPoint - power;
        System.out.println( name + " は " + enemy.name + " に " + power + " ダメージを与えた。" );
    //減ったヒットポイントが反映されていない原因↑
    }

    public int getHitpoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public boolean isAlive() {
        boolean b;
        b = (hitPoint > 0);//HP>0ならtrue
        return b;
    }

    public String getName() {
        return name;
    }
}