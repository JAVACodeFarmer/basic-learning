package thread.producerConsumer;

/**
 * Created by yi.yh on 2018/7/25.
 */
public class ProducerConsumerExample {
    public static void main(String [] args){
        Drop drop = new Drop();
        (new Thread(new Producer(drop))).start();
        (new Thread(new Consumer(drop))).start();
    }
}
