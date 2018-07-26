package thread.hightLevelConcurrency;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by yi.yh on 2018/7/25.
 */
public class AtomicCounter {
    private AtomicInteger c = new AtomicInteger(0);

    public void increment(){
        c.incrementAndGet();
    }

    public void decrement(){
        c.decrementAndGet();
    }

    public int value(){
        return c.get();
    }

    public static void main(String[] args) {
        int r = ThreadLocalRandom.current().nextInt(5, 6);
        System.out.println(r);
    }
}
