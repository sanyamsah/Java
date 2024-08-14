package StaticExample;

public class Main {
    public static void main(String[] args) {
        Human sanyam = new Human(22, "Sanyam", 0, false);
        System.out.println(sanyam.name);
        System.out.println("Population: " + sanyam.population);
        Human ram = new Human(22, "ram", 10000, true);
        System.out.println(ram.name);
        System.out.println("Population: " + ram.population); // Human.population
        System.out.println("Population: " + sanyam.population); // Human.population

        Human lakshman = new Human(21, "Lakshman", 10000, true);
        // By convention, use this:
        System.out.println(Human.population);
//        Main main = new Main();
//        greeting();

    }
    void greeting(){
        System.out.println("Hello!");
    }
}
