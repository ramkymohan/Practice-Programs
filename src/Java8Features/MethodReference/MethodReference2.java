package Java8Features.MethodReference;

public class MethodReference2 {
    public static int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        addTwoNumbers addTwoNumbers = MethodReference2::add;
        System.out.println(addTwoNumbers.add(3,5));

        addTwoNumbers addTwoNumbers1 = (a,b)->{
            return a+b;
        };
        System.out.println(addTwoNumbers1.add(6,3));
    }
}
