abstract class Employee {
    String name;
    int id;

    Employee(String n, int i) {
        name = n;
        id = i;
    }

    abstract double calculateBonus(double salary);
}

class Manager extends Employee {

    Manager(String n, int i) {
        super(n,i);
    }

    double calculateBonus(double salary) {
        return salary * 0.20;
    }
}

class Developer extends Employee {

    Developer(String n, int i) {
        super(n,i);
    }

    double calculateBonus(double salary) {
        return salary * 0.10 + 5000;
    }
}

public class EmployeeBonusDemo {
    public static void main(String[] args) {

        Employee e1 = new Manager("Aman",1);
        Employee e2 = new Developer("Riya",2);

        System.out.println("Manager Bonus: " + e1.calculateBonus(50000));
        System.out.println("Developer Bonus: " + e2.calculateBonus(50000));
    }
}