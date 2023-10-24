package Java8Features.LamdaExpression;

public class Lambda1 {
    public static void main(String[] args) {
        Adding adding= ()->{
            return 1;
        };
        System.out.println(adding.add());
    }

    //Try with single parameter
    //Try with multiple parameters
    //Use For each loop
}
