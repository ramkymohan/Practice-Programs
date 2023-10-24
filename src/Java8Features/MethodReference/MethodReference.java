package Java8Features.MethodReference;

public class MethodReference {
    public static String say(String msg){
        return "this is method referencing"+msg;
    }

    public static void main(String[] args) {
        Sayable sayable = MethodReference::say;
        System.out.println(sayable.say("is the very important"));
    }
}
