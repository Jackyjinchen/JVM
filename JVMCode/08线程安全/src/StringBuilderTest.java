/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/8/22
 * @Content:
 */
public class StringBuilderTest {

    // 内部产生内部消化，线程安全
    public static void method1() {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
    }

    // 线程不安全
    public static void method2(StringBuilder sb) {
        sb.append("a");
        sb.append("b");
    }

    // 线程不安全
    public static StringBuilder method3() {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        return sb;
    }

    // 线程安全
    public static String method4() {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        return sb.toString();
    }
}
