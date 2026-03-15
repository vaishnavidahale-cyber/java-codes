import java.util.*;

class Resort {
    int RNo;
    String Name;
    float Charges;
    int Days;

    float Compute() {
        float amount = Days * Charges;
        if(amount > 11000)
            amount = (float)(1.02 * amount);
        return amount;
    }

    void Getinfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Room No: ");
        RNo = sc.nextInt();

        System.out.print("Name: ");
        Name = sc.next();

        System.out.print("Charges: ");
        Charges = sc.nextFloat();

        System.out.print("Days: ");
        Days = sc.nextInt();
    }

    void DispInfo() {
        float amount = Compute();

        System.out.println("Room No: " + RNo);
        System.out.println("Name: " + Name);
        System.out.println("Charges: " + Charges);
        System.out.println("Days: " + Days);
        System.out.println("Amount: " + amount);
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo();
        r.DispInfo();
    }
}