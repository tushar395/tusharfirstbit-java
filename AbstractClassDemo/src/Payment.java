abstract class Payment {
    abstract void pay(double amount);  // Abstract method

    void receipt() {
        System.out.println("Payment receipt generated.");
    }
}

class UpiPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

 class PaymentSystem {
    public static void main(String[] args) {
        Payment p1 = new UpiPayment();
        p1.pay(250.75);
        p1.receipt();

        Payment p2 = new CreditCardPayment();
        p2.pay(1500);
        p2.receipt();
    }
}
