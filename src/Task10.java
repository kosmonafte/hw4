public class Task10 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000000000; i++) {
            int count = 0;
            for (int j = 1; j < 21; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 20) {
                System.out.println(i);
                break;
            }
        }
    }
}
