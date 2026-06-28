class Box {
    protected double length;
    protected double breadth;

    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double findArea() {
        return length * breadth;
    }
}

class Box3d extends Box {
    private double height;

    public Box3d(double length, double breadth, double height) {
        super(length, breadth); 
        this.height = height;
    }

    @Override
    public double findArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }

    public double findVolume() {
        return length * breadth * height;
    }
}

public class TestBox {
    public static void main(String[] args) {
        Box3d myBox = new Box3d(5.0, 4.0, 3.0);
        System.out.println("Total Surface Area: " + myBox.findArea());
        System.out.println("Total Volume: " + myBox.findVolume());
    }
}
