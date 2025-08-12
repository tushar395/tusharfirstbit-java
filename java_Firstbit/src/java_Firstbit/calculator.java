package java_Firstbit;



	
      class Calculator {

	    // 1. ADDITION
	    public int add(int a, int b) {
	        return a + b;
	    }

	    public float add(float a, float b) {
	        return a + b;
	    }

	    public float add(int a, float b) {
	        return a + b;
	    }

	    public float add(float a, int b) {
	        return a + b;
	    }

	    // 2. SUBTRACTION
	    public int subtract(int a, int b) {
	        return a - b;
	    }

	    public float subtract(float a, float b) {
	        return a - b;
	    }

	    public float subtract(int a, float b) {
	        return a - b;
	    }

	    public float subtract(float a, int b) {
	        return a - b;
	    }

	    // 3. MULTIPLICATION
	    public int multiply(int a, int b) {
	        return a * b;
	    }

	    public float multiply(float a, float b) {
	        return a * b;
	    }

	    public float multiply(int a, float b) {
	        return a * b;
	    }

	    public float multiply(float a, int b) {
	        return a * b;
	    }

	    // 4. DIVISION
	    public int divide(int a, int b) {
	        if (b == 0) {
	            System.out.println("Error: Division by zero!");
	            return 0;
	        }
	        return a / b;
	    }

	    public float divide(float a, float b) {
	        if (b == 0.0f) {
	            System.out.println("Error: Division by zero!");
	            return 0;
	        }
	        return a / b;
	    }

	    public float divide(int a, float b) {
	        if (b == 0.0f) {
	            System.out.println("Error: Division by zero!");
	            return 0;
	        }
	        return a / b;
	    }

	    public float divide(float a, int b) {
	        if (b == 0) {
	            System.out.println("Error: Division by zero!");
	            return 0;
	        }
	        return a / b;
	    }
	}

         class Main {
	    public static void main(String[] args) {
	        Calculator calc = new Calculator();

	        System.out.println("=== ADDITION ===");
	        System.out.println("int + int: " + calc.add(5, 3));
	        System.out.println("float + float: " + calc.add(2.5f, 3.5f));
	        System.out.println("int + float: " + calc.add(4, 2.5f));
	        System.out.println("float + int: " + calc.add(3.5f, 2));

	        System.out.println("\n=== SUBTRACTION ===");
	        System.out.println("int - int: " + calc.subtract(10, 4));
	        System.out.println("float - float: " + calc.subtract(5.5f, 2.5f));
	        System.out.println("int - float: " + calc.subtract(5, 1.2f));
	        System.out.println("float - int: " + calc.subtract(7.5f, 3));

	        System.out.println("\n=== MULTIPLICATION ===");
	        System.out.println("int * int: " + calc.multiply(4, 5));
	        System.out.println("float * float: " + calc.multiply(1.5f, 2.0f));
	        System.out.println("int * float: " + calc.multiply(3, 2.5f));
	        System.out.println("float * int: " + calc.multiply(2.5f, 2));

	        System.out.println("\n=== DIVISION ===");
	        System.out.println("int / int: " + calc.divide(10, 2));
	        System.out.println("float / float: " + calc.divide(5.5f, 2.2f));
	        System.out.println("int / float: " + calc.divide(10, 4.0f));
	        System.out.println("float / int: " + calc.divide(9.0f, 3));
	    }
	}

