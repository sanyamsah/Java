package StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("Human created.");
//        System.out.println("Age: " + this.age);
    }

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        // Human.population += 1;
//        this.population += 1;
        population += 1;
        message();
    }

}
