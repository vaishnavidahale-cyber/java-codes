import java.util.*;

class employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    float calculate() {
        return basic + hra + da;
    }

    void havedata() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Emp No: ");
        empno = sc.nextInt();

        System.out.print("Name: ");
        ename = sc.next();

        System.out.print("Basic: ");
        basic = sc.nextFloat();

        System.out.print("HRA: ");
        hra = sc.nextFloat();

        System.out.print("DA: ");
        da = sc.nextFloat();

        netpay = calculate();
    }

    void dispdata() {
        System.out.println(empno + " " + ename + " " + netpay);
    }

    public static void main(String[] args) {
        employee e = new employee();
        e.havedata();
        e.dispdata();
    }
}