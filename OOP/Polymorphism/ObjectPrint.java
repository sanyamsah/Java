public class ObjectPrint /* extends Object */{
    int num;
    ObjectPrint(int num){
        this.num = 25;
    }

    @Override
    public String toString() {
        return "Object created, value: " + this.num;
    }
    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(25);
        System.out.println(obj);
    }
}
