class Staff {
    void work() {
        System.out.println("Staff members perform hospital duties.");
    }
}

class Doctor extends Staff {
    void work() {
        System.out.println("Doctor treats patients and prescribes medicines.");
    }
}

class Nurse extends Staff {
    void work() {
        System.out.println("Nurse takes care of patients and assists doctors.");
    }
}

class Receptionist extends Staff {
    void work() {
        System.out.println("Receptionist manages appointments and patient records.");
    }
}

public class HospitalDemo {
    public static void main(String[] args) {

        Doctor d = new Doctor();
        Nurse n = new Nurse();
        Receptionist r = new Receptionist();

        d.work();
        n.work();
        r.work();
    }
}