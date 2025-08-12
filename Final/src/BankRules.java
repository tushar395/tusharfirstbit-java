final class BankRules {
    final double interestRate = 6.5;

    final void showPolicy() {
        System.out.println("Bank Interest Rate is: " + interestRate + "%");
    }
}

// The below will cause error if uncommented:
// class NewPolicy extends BankRules {}

 class BankPolicy {
    public static void main(String[] args) {
        BankRules rules = new BankRules();
        rules.showPolicy();

        // rules.interestRate = 7.5;  // ❌ Error: cannot assign value to final variable
    }
}
