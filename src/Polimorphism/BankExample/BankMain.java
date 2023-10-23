package Polimorphism.BankExample;

public class BankMain {
    public static void main(String[] args) {
        Sbi sbi = new Sbi();
        Axis axis= new Axis();
        Icici icici= new Icici();
        System.out.println(sbi.getRateInterst(9));
        System.out.println(axis.getRateInterst(10));
        System.out.println(icici.getRateInterst(8));

    }
}
