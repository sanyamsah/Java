public abstract class Parent {
    int age;
    Parent(int age){
        this.age = age;
    }
    abstract void career();
    abstract void partner();
    // abstract methods cannot have body
//    abstract void display(){
//        System.out.println("Hello");
//    }
    static void hello(){
        System.out.println("Hello, I'm parent.");
    }
    void normalMethod(){
        System.out.println("Normal method");
    }
}
class Son extends Parent{
    Son(int age){
        super(age);
    }
    void career(){
        System.out.println("Engineer");
    }
    void partner(){
        System.out.println("Girl");
    }
}
class Daughter extends Parent{
    Daughter(int age){
        super(age);
    }
    void career(){
        System.out.println("Doctor");
    }
    void partner(){
        System.out.println("Boy");
    }
}
class Main{
    public static void main(String[] args) {
        Son son = new Son(25);
        son.career();
        Daughter daughter = new Daughter(24);
        daughter.career();

        Parent p = new Son(22);
        p.career();
        Parent q = new Daughter(23);
        q.career();
//        Parent parent = new Parent();
        Parent.hello();
        son.normalMethod();
    }
}