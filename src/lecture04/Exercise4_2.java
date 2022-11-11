package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.existsAccount("石田雪也","12345");

        atm.registerAccount("石田雪也","12345");

        if(atm.existsAccount("石田雪也","12345")){
            atm.deposit("12345", 1000000);
            atm.withdraw("12345", 200000);
            atm.withdraw("12345", 500000);
        }
    }
}
