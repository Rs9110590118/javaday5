
class Rbi {
    void loan() {
        System.out.println("this is parent class");
    }
}

class Sbi extends Rbi {
    Sbi() {
        System.out.println("this is child class");
    }
}

class Bankers {
    public static void main(String[] args) {
        Sbi s = new Sbi();
        s.loan();
    }
}
