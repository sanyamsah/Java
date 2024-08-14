public class Box {
    double l, b, h;

    Box(){
        l = 0;
        b = 0;
        h = 0;
    }

    Box(double side){ // cube
        l = side;
        b = side;
        h = side;
    }

    Box(double l, double b, double h){ // cuboid
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box(Box old){
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }

    public void display(){
        System.out.println("Length: " + l + " Breadth: " + b + " Height: " + h);
    }
}

class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        weight = 0;
    }

    BoxWeight(double l, double b, double h, double w){
        super(l,b,h); // calls the parent class constructor
        // if super constructor is not called, default constructor of the base class is called
        this.weight = w;
    }

    BoxWeight(BoxWeight other){
        super(other); // BoxWeight type is sent as parameter which is referred by Box-type variable
        // hence, only Box-type variables can be accessed above
        weight = other.weight;
    }

    // method overriding
//    public void display(){
//        super.display();
//        System.out.println("Weight: " + weight);
//    }
}

class BoxPrice extends BoxWeight{
    double cost;

    BoxPrice(){
        super(); // must be the first statement in the constructor body
        this.cost = 0;
    }

    BoxPrice(double l, double b, double h, double weight, double cost){
        super(l,b,h,weight);
        this.cost = cost;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }
}

class Main{
    public static void main(String[] args) {
        Box box = new Box();
        box.display();
        Box cube = new Box(2);
        cube.display();
        Box cuboid = new Box(1,2,3);
        cuboid.display();

        BoxWeight bw = new BoxWeight();
        bw.display(); // method from Box class
        BoxWeight cuboidW = new BoxWeight(1,2,3,4);
        cuboidW.display();

        Box box2 = new BoxWeight(5,4,3,2);
//        System.out.println(box2.weight); // reference type box2 doesn't have weight as data member;
//        BoxWeight box3 = new Box(1,2,3); // referencing child with parent
        // has access to only the weight variable

    }
}