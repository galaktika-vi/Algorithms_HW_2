import java.util.Scanner;

public class SequenceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов в последовательности: ");
        int terms = scanner.nextInt();

        for (int n = 1; n <= terms; n++) {
            double term = calculateTerm(n);
            System.out.println("a(" + n + ") = " + term);
        }

        scanner.close();
    }

    public static double calculateTerm(int n) {
        if (n % 2 == 0) {
            return 0;
        } else {
            return 2.0 / (n + 1);
        }
    }
}
