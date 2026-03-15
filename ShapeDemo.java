abstract class Shape {
    abstract void calculate_area();

    void display_info() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void calculate_area() {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

class Rectangle extends Shape {
    int length, width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void calculate_area() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4,6);

        c.display_info();
        c.calculate_area();

        r.display_info();
        r.calculate_area();
    }
}