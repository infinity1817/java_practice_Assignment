package Day_2_Assignment;

public class Thread_Basics {
    public  class downloadTask implements Runnable{
        @Override
         public void run(){
             System.out.println("Task is Downloading");
         }
    }

    public  class uploadTask implements Runnable{
        @Override
        public void run(){
            System.out.println("Task is Uploading");
        }

    }

    public    void main(String[] args) throws InterruptedException {
        Runnable task = new downloadTask();
        Runnable task2 = new uploadTask();

        Thread T1 = new Thread(task);
        Thread T2 = new Thread(task2);
        T1.start();
        T1.join();
        T2.start();
        T2.join();
        Thread.sleep(1000);
        System.out.println("Successfully Executed");

    }


}
