class Class1{
    int roll;
    float cgpa;
    Class1(){}
    Class1(int r, int c){
        this.roll = r;
        this.cgpa = c;
    }
}
public class ReferenceExample {
    public static void main(String[] args) {
        Class1 one = new Class1(25, 9);
        Class1 two = one;
        System.out.println(one.roll);
        System.out.println(one.cgpa);
        System.out.println(two.roll); // 25
        System.out.println(two.cgpa); // 9.0

    }
}
