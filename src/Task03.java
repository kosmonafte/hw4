public class Task03 {
    public static void main(String[] args) {
        for (int i = 10; i < 1000000; i++) {
            int k = 0, tmp = 0;
            tmp = i;
            //System.out.println(tmp);
            while (tmp > 0) {
                tmp /= 10;
                k++;
                System.out.println(tmp);
                System.out.println(k);
            }
            //System.out.println(k);
            int rightSum = 0;
            for (int j = 0; j < k; j++) {
                rightSum += Math.pow(i % 10, k);
                i /= 10;
            }
            //System.out.println(rightSum);
            if (i == rightSum) {
                System.out.println(i);
            }
        }
    }
}
