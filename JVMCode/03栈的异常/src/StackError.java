/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/8/20
 * @Content:
 */
public class StackError {

    private static int count = 1;
    // StackOverflowError
    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
