package Java8Features.FunctionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    static void ShowDetails(String name, Integer age){
        System.out.println(name+" "+age);
    }
    public static void main(String[] args) {
        BiConsumer<String, Integer> biCon = BiConsumerExample::ShowDetails;
        biCon.accept("rama",25);
        biCon.accept("Sita",22);


        BiConsumer<String,Integer> biConsumer = (name,age)->{
            System.out.println(name+ " " + age);
        };
        biConsumer.accept("gayatri",45);

    }


}
