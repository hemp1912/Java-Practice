public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("add(int, int): " + calc.add(10, 20));
        System.out.println("add(double, double): " + calc.add(5.5, 4.5));
        System.out.println("add(int, int, int): " + calc.add(1, 2, 3));
        System.out.println("add(String, String): " + calc.add("Hello ", "World"));
    }
}
