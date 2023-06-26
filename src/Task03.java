
public class Task03 {
    public static void main(String[] args) {
        for (int i = 10; i < 1000000; i++) {
            int k = 0, tmp = 0, tmpTwo = 0;
            tmp = i;
            tmpTwo = i;
            while (tmp > 0) {
                tmp /= 10;
                k++;
            }
            int rightSum = 0;
            for (int j = 0; j < k; j++) {
                rightSum += Math.pow(tmpTwo % 10, k);
                tmpTwo /= 10;
            }
            if (i == rightSum) {
                System.out.println(i);
            }
        }
    }
}
