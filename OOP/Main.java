import java.util.Arrays;
class Student{
    int roll;
    String name;
    float cgpa;
}
public class Main {
    public static void main(String[] args) {
        Student[] s1 = new Student[5];
        System.out.println(Arrays.toString(s1));
        Student s2 = new Student(); // Dynamically allocates memory & returns a reference to it.
        // Student s2: compile time
        // new Student(): run time
        // Accessing addresses is not allowed in Java.
        System.out.println(s2); // Some random value
        System.out.println(s2.roll); // 0
        System.out.println(s2.name); // null
        System.out.println(s2.cgpa); // 0.0
        s2.roll = 21053318;
        s2.name = "Sanyam";
        s2.cgpa = 9.00f;
        System.out.println(s2); // Some random value
        System.out.println(s2.roll); // 21053318
        System.out.println(s2.name); // Sanyam
        System.out.println(s2.cgpa); // 9.00
    }
}
