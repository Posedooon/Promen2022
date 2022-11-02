package lecture02;

public class Human{
    /*変数の宣言*/
     private String name;
     private int age;
     /*コンストラクタ*/
   public Human(String name,int age){
       this.name = name;
       this.age = age;
   }

   public void Print(){
       if(age <= 18){
           System.out.print("生徒:");
       } else if (age <= 22) {
           System.out.print("学生:");
       }
       System.out.println(name + " "+ age + "歳です。");
   }
   }

