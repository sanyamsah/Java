class Students{

    String name;
    int roll;
    float cgpa;

    Students(){
//        this.roll = 0;
//        this.name = null;
//        this.cgpa = 0.0f;
        // Calling constructor from constructor
        this("null",0, 0.0f);
        // new Student("null", 0, 0.0f);
    }

    Students(String name, int roll, float cgpa){
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    Students(Students student) {
        this.name = student.name;
        this.roll = student.roll;
        this.cgpa = student.cgpa;
    }

    void greeting(){
        System.out.println("Hello, my name is " + name + "."); // this.name
    }
    void changeName(String newName){
        name = newName;
    }
}

// Constructor is a special function that runs when you create an object & it assigns some variables.

public class Constructor{

    public static void main(String[] args) {

        Students s1 = new Students();
        Students s2 = new Students("Sanyam", 21053318, 9.00f);
        System.out.println(s1.name); // null
        System.out.println(s1.roll); // 0
        System.out.println(s1.cgpa); // 0.0
        System.out.println(s2.name); // Sanyam
        System.out.println(s2.roll); // 21053318
        System.out.println(s2.cgpa); // 9.0

        s1.greeting();
        s2.greeting();
        s2.changeName("Ram");
        s2.greeting();

        Students abc = new Students("Lakshman", 1008, 10);
        Students xyz = new Students(abc);
        System.out.println(abc.name); // Lakshman
        System.out.println(abc.roll); // 1008
        System.out.println(abc.cgpa); // 10.0
        System.out.println(xyz.name); // Lakshman
        System.out.println(xyz.roll); // 1008
        System.out.println(xyz.cgpa); // 10.0

        Students pqr = new Students();
        System.out.println(pqr.name); // null
        System.out.println(pqr.roll); // 0
        System.out.println(pqr.cgpa); // 0.0

        Students one = new Students("one", 10, 9);
        Students two = one;
        two.name = "changed to two";
        one.greeting(); // changed to two
    }
}