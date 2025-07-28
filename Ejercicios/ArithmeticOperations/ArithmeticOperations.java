package ArithmeticOperations;

public class ArithmeticOperations {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Sum: " + sum(a, b));
        System.out.println("Difference: " + difference(a, b));
        System.out.println("Product: " + product(a, b));

        if(b != 0) {
            System.out.println("Quotient: " + quotient(a, b));
            System.out.println("Remainder: " + remainder(a, b));
        } else {
            System.out.println("Division by zero is not allowed");
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int difference(int a, int b) {
        return a - b;
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static int quotient(int a, int b) {
        return a / b;
    }

    public static int remainder(int a, int b) {
        return a % b;
    }
}
