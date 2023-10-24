package Java8Features.FunctionalInterface;

public class FunctionalInterfaceMain implements FunctionalInterface{
    public void draw(){
        System.out.println("this is functional interface");
    }
    public static void main(String[] args) {
        FunctionalInterface functionalInterface =new FunctionalInterfaceMain();
        functionalInterface.draw();
    }

}
