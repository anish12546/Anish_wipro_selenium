package assignment_4;

class Hospital {
    void showHospital() {
        System.out.println("Welcome to the Hospital.");
    }
}

class Doctor extends Hospital {
    void showDoctor() {
        System.out.println("Doctor Department.");
    }
}

class Gynac extends Doctor {
    void showGynac() {
        System.out.println("You selected Gynac.");
    }
}

class Endo extends Doctor {
    void showEndo() {
        System.out.println("You selected Endocrinology.");
    }
}

class Cardiac extends Doctor {
    void showCardiac() {
        System.out.println("You selected Cardiac.");
    }
}

class Operation extends Cardiac {
    void showOperation() {
        System.out.println("Cardiac Operation Unit.");
    }
}

class OPD extends Cardiac {
    void showOPD() {
        System.out.println("Cardiac OPD Unit.");
    }
}

class Nurse extends Hospital {
    void showNurse() {
        System.out.println("Nurse Department.");
    }
}

class Accountant extends Hospital {
    void showAccountant() {
        System.out.println("Accountant Department.");
    }
}

class Payments extends Accountant {
    void showPayments() {
        System.out.println("Handling Payments.");
    }
}

class Documentation extends Accountant {
    void showDocumentation() {
        System.out.println("Handling Documentation.");
    }
}

public class PracticeHospital {
    public static void main(String[] args) {

        Gynac g = new Gynac();
        g.showHospital();
        g.showDoctor();
        g.showGynac();

        System.out.println();

        Operation op = new Operation();
        op.showHospital();
        op.showDoctor();
        op.showCardiac();
        op.showOperation();

        System.out.println();

        Nurse n = new Nurse();
        n.showHospital();
        n.showNurse();

        System.out.println();

        Payments p = new Payments();
        p.showHospital();
        p.showAccountant();
        p.showPayments();
    }
}
