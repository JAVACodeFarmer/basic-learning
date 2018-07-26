package thread;

/**
 * Created by yi.yh on 2018/7/25.
 */
public class SynchronizedRGBTest {
    public static void main(String[] args) {
        SynchronizedRGB color = new SynchronizedRGB(0,0,0,"Pitch Black");

        new Thread( () -> color.set(100, 101, 102, "不知道什么颜色！")).start();
//        synchronized(color){
//             myColorInt = color.getRGB();
//             myColorName = color.getName();
//        }
        int myColorInt = color.getRGB(); //声明1
        String myColorName = color.getName(); //声明2
        System.out.println(myColorInt);
        System.out.println(myColorName);

    }
}
