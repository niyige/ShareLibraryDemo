package oyy.com.utilsdemolibrary;

/**
 * Created by
 * ouyangyi on 17/8/3.
 */

public class Toasts {

    public static Toasts toasts;

    public static Toasts getInstance() {
        if (toasts == null) {
            toasts = new Toasts();
        }
        return toasts;
    }

    public String getStrData() {
        return "分享module给其他人用，测试成功了";
    }
}
