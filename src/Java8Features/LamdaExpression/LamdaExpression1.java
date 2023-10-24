package Java8Features.LamdaExpression;

public class LamdaExpression1 {
    public static void main(String[] args) {
        String msg = null;
        PrintString printString = (str)->{
           return "this is lambda exprestion";
        };
        System.out.println(printString.printmessage(msg));
    }
}
