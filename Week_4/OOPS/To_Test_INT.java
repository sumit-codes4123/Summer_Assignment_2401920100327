interface Test {
    int square(int num);
}

class Arithmetic implements Test {
    @Override
    public int square(int num) {
        return num * num;
    }
}

public class ToTestInt {
    public static void main(String[] args) {
        Arithmetic arithmeticObj = new Arithmetic();
        int input = 7;
        int result = arithmeticObj.square(input);
        System.out.println("Square of " + input + " is: " + result);
    }
}
