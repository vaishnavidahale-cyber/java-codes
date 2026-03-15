class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Sum1: " + c.add(5,6));
        System.out.println("Sum2: " + c.add(3,4,5));
        System.out.println("Sum3: " + c.add(4.5,3.2));
    }
}