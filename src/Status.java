public class Status {
    //共通して持つステータス
    int Pow;
    int HP;
    int Def;
    String Name;
    //敵のモンスターに応じてステータスを設定する部分＝コンストラクタ
    public Status(int Pow,int Def,String Name){
    //this...引数の名前がフィールド変数と同じ名前の時、引数ですよ、のサイン
    this.Pow = Pow;
    HP = 1000;
    this.Def = Def;
    this.Name = Name;
    }
    public void Print(){
         System.out.println("名前:"+Name+" 攻撃："+Pow+" HP:"+HP+" 防御力:"+Def);
    }


}
