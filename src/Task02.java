public class Task02 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000000; i++) {
            int k = 0;
            for (int j = 1; j <= i; j++) {
                int l = i%j;
                if (l == 0) {
                    k++;
                    if (k > 2) {
                        break;
                    }
                }
            }
            if (k == 2) {
                System.out.println(i);
            }
        }
    }
}
