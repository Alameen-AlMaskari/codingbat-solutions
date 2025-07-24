public class sumDouble {
    public static void main(String[] args) {
        System.out.println(sumDouble(10, 10));
    }

    public static int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else {
            return a + b;
        }
    }
}
