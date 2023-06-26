import java.util.ArrayList;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 10000000; i < 99999999; i++) {
            int count = 0;
            int tmp = i;
            while (tmp > 0) {
                tmp /= 10;
                count++;
            }
//            ArrayList<Integer> array = new ArrayList<Integer>();
//            for (int j = 0; j < count; j++) {
//                array.add(i % 10);
//                i /= 10;
//            }

            int array[] = new int[count];
            for (int j = 0; j < count; j++) {
                array[j] = i % 10;
                i /= 10;
            }
            for (int j = 0; j < count; j++) {
                System.out.println(array[i]);
            }
        }
        int in = scanner.nextInt();
    }
}
