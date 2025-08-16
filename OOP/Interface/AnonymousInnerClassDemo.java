@FunctionalInterface
interface OuterClass{
    void show();
}

public class AnonymousInnerClassDemo{
    public static void main(String[] args){
        OuterClass obj = new OuterClass(){
            public void show(){
                System.out.println("In inner class show..");
            }
        };
        obj.show();
    }
}