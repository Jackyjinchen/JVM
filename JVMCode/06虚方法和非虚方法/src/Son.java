/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/8/22
 * @Content: 虚方法和非虚方法调用
 */

class Father {
    public Father() {
        System.out.println("Father Constructor");
    }

    public static void showStatic(String str) {
        System.out.println("Father " + str);
    }

    public final void showFinal() {
        System.out.println("Father Final");
    }

    public void showCommon() {
        System.out.println("Father Common Method");
    }
}

public class Son extends Father {

    public Son() {
        super();
    }

    public Son(int age) {
        this();
    }

    public static void showStatic(String str) {
        System.out.println("Son " + str);
    }

    private void showPrivate(String str) {
        System.out.println("Son Private "+ str);
    }

    public void show() {
        showStatic("static");
        super.showStatic("static");
        showPrivate("private");
        super.showCommon();

        // 这里显示 invokevirtual
        // 但实际上是super.showFinal() 这时非虚方法
        showFinal();
        // 这样调用 显示的是invokespecial
//        super.showFinal();


        showCommon();
        info();

//        MethodInterface in = null;
//        in.methodA();
    }

    public void info(){ }

    public void display(Father f) {
        f.showCommon();
    }

    public static void main(String[] args) {
        Son so = new Son();
        so.show();
    }
}

interface MethodInterface {
    void methodA();
}