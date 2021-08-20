/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/8/18
 * @Content:
 */
public class MyString {
    public static void main(String[] args) {
        // 并没有运行自己写的java.lang包。双亲委派
        String str = new String();
        System.out.println("MyString");
    }
}
