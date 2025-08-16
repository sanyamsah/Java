public class FunctionalInterfaceDemo {
    @FunctionalInterface
    interface FunctionalInterfaceClass {
        void show();
    }

    static class Implementation implements FunctionalInterfaceClass {
        public void show() {
            System.out.println("In show..");
        }
    }

    public static void main(String[] args) {
        FunctionalInterfaceClass obj = new Implementation();
        obj.show();
    }
}