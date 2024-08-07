import java.util.*;

public class Main {
    // Enumerations: group of variables which can't be changed
    // For some classes, only fixed number of objects are required
    // Month class can have only 12 objects, for example
    enum Week {
        Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;
        Week(){
            System.out.println("Constructor called for " + this);
        } // this is private or default, no new objects can be created other than the defined
        // hence it can't be public or protected
    }
    // enum constants
    // by default public static final
    // since final, can't create child enums
    // Type: week
    // Internally: public static final Week Monday = new Week();
    // All enums extend java.lang.enum class
    // Enums can implement interfaces but cannot extend classes


    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        // List is interface
        System.out.println(linkedList.size());
        List<Integer> list = new ArrayList<>();
        linkedList.add(24);
        linkedList.add(24);
        linkedList.add(24);
        linkedList.add(24);
        linkedList.add(24);
        System.out.println(linkedList);

        List<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(2);
        System.out.println(vector);

        Week week;
        Week weekday = Week.Monday;
        for(Week day : Week.values()){
            System.out.println(day);
        }
        System.out.println(weekday.ordinal()); // position of Monday

    }
}
