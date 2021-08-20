/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/8/18
 * @Content: 00 反编译
 */
// javap -v Main.class
public class Main {
    private int a = 1;
    private static int c = 2;
    public static void main(String[] args) {
        int i = 2, j = 3;
        int k = i + j;
    }

    Main() {
        a = 2;
    }

    Main(int d) {
        a = 2;
    }
}