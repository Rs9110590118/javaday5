
abstract class Bank {
    abstract void loan();

    void Balance() {
        System.out.println("your balance is 50000");
    }
}

class Sbi extends Bank {
    void loan() {
        System.out.println("balance accepted");
    }
}

class Money {
    public static void main(String[] args) {
        Sbi s = new Sbi();
        s.loan();
        s.Balance();
    }
}
