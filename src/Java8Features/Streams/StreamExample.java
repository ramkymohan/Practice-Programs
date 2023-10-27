package Java8Features.Streams;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<>();
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

//        for(Product product: productsList){
//            System.out.println(product);
//        }

//        List<Float> productPriceList = new ArrayList<>();
//
//        //Filtering Collection without using Stream
//        for(Product p: productsList){
//            if(p.getPrice()<30000){
//                productPriceList.add(p.price);
//            }
//        }
//        System.out.println(productPriceList);


        //Filtering Collection by using Stream
//        List<Float> productPricelist = productsList.stream()
//                .filter(p->p.getPrice()<30000)
//                .map(Product::getPrice)
//                .collect(Collectors.toList());
//        System.out.println(productPricelist);

        //Stream Iterating
//        Stream.iterate(0, element->element+1)
//                .filter(element->element%5==0)
//                .limit(5)
//                .forEach(System.out::println);

        //Filtering and Iterating Collection
//        productsList.stream()
//                .filter(p->p.getPrice()<30000)
//                .forEach(product -> System.out.println(product.price));
        //Sum by using Collectors Methods
//        Double sum=productsList.stream().collect(Collectors.summingDouble(p->p.getPrice()));
//        System.out.println(sum);
        //Find Max and Min Product Price
//        Product price=productsList.stream().max((p1,p2)->p1.getPrice()>p2.getPrice()?1:-1).get();
//        System.out.println(price.name);

        //Find count in a stream

        //System.out.println(productsList.stream().count());
        //Convert List into Set
//        Map<Integer,String> set= productsList.stream().filter(p->p.price<90000).collect(Collectors.toMap(p->p.id,p->p.name));
//        System.out.println(set);

        //Convert List into Map
        //Method Reference in stream
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(result);

        int sumOfSquares = IntStream.rangeClosed(1, 10)
                .map(n -> n * n)
                .sum();
        System.out.println(sumOfSquares);

        List<String> words = Arrays.asList("Hello", "World", "Java", "Streams");
        String concatenated = words.stream()
                .collect(Collectors.joining(", "));
        System.out.println(concatenated);

        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "David", "Eve");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(filteredNames);

        List<String> word = Arrays.asList("apple", "banana", "cherry", "date", "fig");
        Map<Integer, List<String>> wordGroups = word.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(wordGroups);
    }
}
