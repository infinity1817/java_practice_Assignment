package Day_2_Assignment;

import java.util.concurrent.atomic.AtomicInteger;

public class Bonus {
    class  Counter {
        private AtomicInteger count = new AtomicInteger(0);

        public  int increment() {

           return count.incrementAndGet();
        }

        public int getCount() {
            return count.get();
        }
    }
    public void main(String[] args) throws InterruptedException {


     Counter counter = new Counter();

        Runnable task = () -> {
            for(int i=0;i<100000;i++) {
              int ans =   counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);


        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(counter.getCount());


    }
}
