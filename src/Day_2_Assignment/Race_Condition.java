package Day_2_Assignment;

public class Race_Condition {
    class  Counter {
        private int count = 0;

      public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }
   public void main(String[] args) throws InterruptedException {


        Counter counter = new Counter();

       Runnable task = () -> {
           for(int i=0;i<100000;i++) {
               counter.increment();
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


// The previous code shows value below 200000 because of race condition both threads access and update the same count value multiple times .
// Synchronization solves the problem by locking the count when a thread is reading it and updating it thereby preventing race condition.