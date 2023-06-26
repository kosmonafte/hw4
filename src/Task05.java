import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int tmp = input;
        int k = 0;
        boolean nechet = false;
        while (tmp > 0) {
            tmp /= 10;
            k++;
        }
        if (k%2 != 0) {
            nechet = true;
        }
        System.out.println(k);
        k /= 2;
        System.out.println(k);
        int kratno = (int) Math.pow(10, k);
        System.out.println(kratno);
        int leftPart = 0, rightPart = 0;
        if (nechet) {
            leftPart = input / (kratno * 10);
        } else {
            leftPart = input / kratno;
        }
        rightPart = input % kratno;
        System.out.println(leftPart);
        System.out.println(rightPart);
        int count = 0;
        for (int i = 0; i < k; i++) {
            int r = rightPart % 10;
            int l = (int) (leftPart / (Math.pow(10, k -i - 1)));
            System.out.println((Math.pow(10, k -i - 1)));
            System.out.println(l);
            System.out.println(r);
            if (l == r) {
                count++;
            }
            rightPart /= 10;
            leftPart %= (int) (Math.pow(10, k -i - 1));
            System.out.println(leftPart);
            System.out.println(rightPart);
            //int in = scanner.nextInt();
        }
        if (count == k) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not palindrom");
        }
    }
}
