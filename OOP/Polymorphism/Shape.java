public class Shape {
    void area(){
        System.out.println("Shape area.");
    }
}
class Circle extends Shape{
    void area(){
        System.out.println("Circle area.");
    }
}

class Triangle extends Shape{
    void area(){
        System.out.println("Triangle area.");
    }
}

class Square extends Shape{
    void area(){
        System.out.println("Square area.");
    }
}

class Main{
    public static void main(String[] args) {
//        Shape shape = new Shape();
////        Circle circle = new Circle();
//        Triangle triangle = new Triangle();
////        shape.area();
////        circle.area();
//        Shape shape2 = new Square();
//        shape2.area(); // Square area
//        triangle.area();
        Shape circle = new Circle();
        circle.area(); // Shape should have a method area()
    }

}