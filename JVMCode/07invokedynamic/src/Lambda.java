/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/8/22
 * @Content:
 */
interface Func {
    public boolean func(String str);
}
public class Lambda {
    public void lambda(Func func) {
        return;
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        Func func = s -> {
            return true;
        };
        lambda.lambda(func);

        lambda.lambda(s -> {
            return true;
        });
    }
}
