public class Task11 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 15 == 0) {
                System.out.println("hiss");
            } else {
                System.out.println(i);
            }
        }
    }
}
