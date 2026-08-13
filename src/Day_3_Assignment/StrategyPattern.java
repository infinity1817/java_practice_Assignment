package Day_3_Assignment;

public class StrategyPattern {
    interface Strategy{
        void pay(double amount);

    }

    public class UpiPayment implements Strategy{

        private double amount;
//        UpiPayment(double amount){
//            this.amount = amount;
//        }
        public void pay(double amount){
            System.out.println("Paid " + amount + " By upi");
        }
    }

    public class CreditCard implements Strategy{
        private double amount;
//        CreditCard(double amount){
//            this.amount = amount;
//        }
        public void pay(double amount){
            System.out.println("Paid " + amount + " using Credit Card");
        }
    }

    public class Context{
        Strategy strategy ;
        Context(Strategy strategy){
            this.strategy = strategy;
        }

        public void payment(double amount){
            strategy.pay(amount);
        }
    }

    public void main(String[] args){
        Strategy strategy = new CreditCard();
        Context context = new Context(strategy);
        context.payment(1000);


    }


}
