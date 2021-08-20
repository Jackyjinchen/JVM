
import org.openjsse.sun.security.util.CurveDB;

import java.net.URL;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/8/18
 * @Content:
 */
public class GetURL {
    public static void main(String[] args) {
        // 引导类加载器
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (URL url : urls) {
            System.out.println(url);
        }

        System.out.println();

        // 扩展类加载器
        String exts = System.getProperty("java.ext.dirs");
        for (String s : exts.split(":")) {
            System.out.println(s);
        }
        ClassLoader classLoader = CurveDB.class.getClassLoader();
        System.out.println(classLoader);
    }
}
