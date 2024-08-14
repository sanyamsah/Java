package Interface;

public interface Engine {
//    int price = 10000; // by default public static final
    public static final int price = 10000;
    void start();
    void stop();
    void accelerate();
}
// All methods are public and abstract
interface Extension extends Engine{
    void hello();
} // Interface can extend another interface

