package Polimorphism.Abstation;

public class TestAbstraction {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        Shape shape1 = new Circle();
        shape1.draw();
        shape.draw();
        Circle circle= new Circle();
        circle.draw();
        circle.shuppu();
        shape.shuppu();


    }
}
