public class Singleton {
    private int num = 25;
    private Singleton(){}
    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance == null) instance = new Singleton();
        return instance;
    }
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        System.out.println(obj.num);
        Singleton obj2 = Singleton.getInstance();
        obj.num = 05;
        System.out.println(obj2.num);
    }
}
