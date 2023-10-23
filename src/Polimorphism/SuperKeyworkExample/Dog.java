package Polimorphism.SuperKeyworkExample;

public class Dog extends Animal{
    void eat(){
        System.out.println("eating bread...");
    }
    void bark(){
        System.out.println("barking...");
    }
    void work(){
        bark();
        super.eat();
    }
}
