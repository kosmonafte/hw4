public class Task04 {
    public static void main(String[] args) {
        for (int j = 0; j < 10000; j++) {
            int sum = 0;
            for (int i = 1; i < j; i++) {
                if (j % i == 0) {
                    sum += i;
                }
            }
            if (sum == j) {
                System.out.println(j);
            }
        }
    }
}
