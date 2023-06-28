import java.util.ArrayList;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int tmpNum = i;
            int j = 0;
            while (tmpNum > 0) {
                int number = tmpNum % 10;
                tmpNum /= 10;
                int tmpNum2 = tmpNum;
                while (tmpNum2 > 0) {
                    if (number == tmpNum2 % 10) {
                        j++;
                    }
                    tmpNum2 /= 10;
                }
            }
            if (j == 0) {
                System.out.println(i);
            }
        }
    }
}
