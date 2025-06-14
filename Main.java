interface Calculator {
    public int add(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> {
            System.out.println("Hasilnya adalah:");
            return a + b;
        };

        System.out.println(calculator.add(4, 5));
    }
}

