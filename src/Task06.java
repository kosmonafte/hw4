public class Task06 {
    public static void main(String[] args) {
        for (int i = 10000000; i < 99999999; i++) {
            if (i % 12345 == 0) {
                System.out.println(i);
            }
        }
    }
}
