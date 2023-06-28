import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        while (input>0) {
            if (input%2==0) {
                System.out.print("0");
            } else {
                System.out.print("1");
            }
            input/=2;
        }
    }
}
