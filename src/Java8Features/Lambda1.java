package Java8Features;

public class Lambda1 implements Adding{
    public int add(){
        return  1;
    }
    public static void main(String[] args) {
        Lambda1 lambda1 = new Lambda1();
        System.out.println(lambda1.add());

        Adding adding = ()->{
            return 7;
        };
    }

    //Try with single parameter
    //Try with multiple parameters
    //Use For each loop
}
