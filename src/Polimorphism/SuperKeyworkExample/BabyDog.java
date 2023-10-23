package Polimorphism.SuperKeyworkExample;

public class BabyDog extends Dog{
    void bath(){
        System.out.println("Doing bath");
    }
    void eat(){
        System.out.println("Babydog Eating");
    }
    void diff(){
        bath();
        super.eat();
    }

}
