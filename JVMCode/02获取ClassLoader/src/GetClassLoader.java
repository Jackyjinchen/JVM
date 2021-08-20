/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/8/18
 * @Content:
 */
public class GetClassLoader {

    public static void main(String[] args) throws Exception {
        // 方式1
        ClassLoader clazz = Class.forName("java.lang.String").getClassLoader();
        System.out.println(clazz);

        // 方式2
        ClassLoader clazz2 = Thread.currentThread().getContextClassLoader();
        System.out.println(clazz2);

        // 方式3
        ClassLoader clazz3 = ClassLoader.getSystemClassLoader();
        System.out.println(clazz3);

    }
}
