class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void area(int r) {
        System.out.println("Circle Area: " + (3.14*r*r));
    }
}

class Rectangle extends Shape {
    void area(int l, int w) {
        System.out.println("Rectangle Area: " + (l*w));
    }
}

public class ShapeInheritance {
    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.area(5);

        r.display();
        r.area(4,6);
    }
}