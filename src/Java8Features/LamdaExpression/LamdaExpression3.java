package Java8Features.LamdaExpression;

import java.util.ArrayList;
import java.util.List;

public class LamdaExpression3 {
    public static void main(String[] args) {
        AddThreeNumbers addThreeNumbers = (a, b, c) -> {
            System.out.println(a + c);
            System.out.println("ramky" + b);
        };
        addThreeNumbers.add(4, " is good boy", 8);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("suppu");
        arrayList.add("ramky");
        arrayList.add("prasu");
        arrayList.add("gaya");
        arrayList.add("pratima");

        arrayList.forEach((n)-> System.out.println(n));


    }
}

