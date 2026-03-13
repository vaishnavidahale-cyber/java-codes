class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class java1 {
    public static void main(String[] args) {

        // Creating two Person objects
        Person p1 = new Person("Rahul", 20);
        Person p2 = new Person("Priya", 21);

        // Printing details
        p1.display();
        System.out.println();
        p2.display();
    }
}