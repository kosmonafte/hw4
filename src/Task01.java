public class Task01 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int tmp;
        System.out.println(a);
        System.out.println(b);
        while (true) {
            tmp = a;
            a = b;
            b += tmp;
            if (b > 10000000) {
                break;
            }
            System.out.println(b);
        }
    }
}
