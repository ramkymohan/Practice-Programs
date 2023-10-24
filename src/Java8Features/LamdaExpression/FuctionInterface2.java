package Java8Features.LamdaExpression;

public class FuctionInterface2 {
    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = (a,b)->{return a+b;};
        System.out.println(addTwoNumbers.add(4,5));
    }
}
