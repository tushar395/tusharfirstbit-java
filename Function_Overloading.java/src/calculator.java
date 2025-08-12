
class Calculator {
    void add(int a, int b) {
        System.out.println("Sum (int): " + (a + b));
    }

    void add(float a, float b) {
        System.out.println("Sum (float): " + (a + b));
    }

    void add(int a, float b) {
        System.out.println("Sum (int, float): " + (a + b));
    }

    void add(float a, int b) {
        System.out.println("Sum (float, int): " + (a + b));
    }

    
}

class TestCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add(10, 20);          
        calc.add(5.5f, 3.3f);      
        calc.add(5, 2.5f);          
        calc.add(3.5f, 5);         
    }
}
