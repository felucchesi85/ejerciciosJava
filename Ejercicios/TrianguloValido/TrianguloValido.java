package TrianguloValido;

public class TrianguloValido {
    private static final String VALID_TRIANGLE = "The sides form a valid triangle.";
    private static final String INVALID_TRIANGLE = "The sides do not form a valid triangle.";

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.isValid() ? VALID_TRIANGLE : INVALID_TRIANGLE);
    }
}

class Triangle {
    private final int sideA;
    private final int sideB; 
    private final int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public boolean isValid() {
        return isPositive() && satisfiesTriangleInequality();
    }

    private boolean isPositive() {
        return sideA > 0 && sideB > 0 && sideC > 0;
    }

    private boolean satisfiesTriangleInequality() {
        return (sideA + sideB > sideC) && 
               (sideA + sideC > sideB) && 
               (sideB + sideC > sideA);
    }
}
