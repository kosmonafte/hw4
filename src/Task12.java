import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputSteps = scanner.nextInt();
        double steps = 1;
        int days = 0;
        while (steps < inputSteps) {
            steps += 0.1 * steps;
            days++;
        }
        System.out.println(days);
    }
}
