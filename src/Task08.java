public class Task08 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                if (i < 10) {
                    int tmpJ = j / 10;
                    if (i == tmpJ && j % 10 == 0) {
                        count++;
                        System.out.printf("%02d:%d\n", i, j);
                    }
                } else {
                    int a = i / 10;
                    int b = i % 10;
                    int c = j / 10;
                    int d = j % 10;
                    if (a == d && b == c) {
                        count++;
                        System.out.printf("%02d:%02d\n", i, j);
                    }
                }
            }
        }
        System.out.println(count);
    }
}
