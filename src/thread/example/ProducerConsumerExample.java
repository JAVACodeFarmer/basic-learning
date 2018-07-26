package thread.example;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by yi.yh on 2018/7/25.
 */
public class ProducerConsumerExample {
    public static void main(String[] args) {
        BlockingQueue<String> drop =  new SynchronousQueue<String>();
        (new Thread(new Producer(drop))).start();
        (new Thread(new Consumer(drop))).start();
    }
}
