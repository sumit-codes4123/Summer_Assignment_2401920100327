class Outer {
    public void display() {
        System.out.println("Display method inside the Outer class.");
    }

    class Inner {
        public void display() {
            System.out.println("Display method inside the Inner class.");
        }
    }
}

public class MainClass {
    public static void main(String[] args) {
        Outer outerObj = new Outer();
        outerObj.display();

        Outer.Inner innerObj = outerObj.new Inner();
        innerObj.display();
    }
}
