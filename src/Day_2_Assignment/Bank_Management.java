package Day_2_Assignment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bank_Management {

    class BankAccount{
        private int balance = 1000;

        public synchronized void withdraw(int amount){
             if(balance >= amount) {
                 balance -= amount;
//                 System.out.println(balance);
             }
             else{
                 System.out.println("Insufficient Balance");
             }
        }

        public int getBalance(){
            return balance;
        }
    }

    public void main(String[] args){
        BankAccount Nimish = new BankAccount();
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for(int i=0;i<5;i++){
            executor.submit(() -> {
                Nimish.withdraw(300);
                System.out.println(Thread.currentThread().getName());
                System.out.println(Nimish.getBalance());
            });
        }
        executor.shutdown();
    }
}
