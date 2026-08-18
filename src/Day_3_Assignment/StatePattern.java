package Day_3_Assignment;

public class StatePattern {
    interface ATMstate{
        void insertCard();
        void insertPin();
        void withdraw(double amount);
    }

    public class NoCardState implements ATMstate{
       private ATM atm ;
       NoCardState(ATM atm){
           this.atm = atm;
       }

        @Override
        public void insertCard() {
            System.out.println("Card is inserted");
            atm.setState(new CardInsertedState(atm));
        }

        @Override
        public void insertPin() {
            System.out.println("Please insert card");
        }

        @Override
        public void withdraw(double amount) {
            System.out.println("Please insert Card");
        }
    }

    public class CardInsertedState implements ATMstate{
       private ATM atm;
       CardInsertedState(ATM atm){
           this.atm = atm;
       }

        @Override
        public void insertCard() {
            System.out.println("Card is already inserted");
        }

        @Override
        public void insertPin() {
            System.out.println("Pin is verified");
            atm.setState(new PinVerifiedState(atm));
        }

        @Override
        public void withdraw(double amount) {
            System.out.println("Please enter your pin");
        }
    }

    public class PinVerifiedState implements ATMstate{
             ATM atm ;
             PinVerifiedState(ATM atm){
                 this.atm  = atm;
             }

        @Override
        public void insertCard() {
            System.out.println("Card is already iserted");
        }

        @Override
        public void insertPin() {
            System.out.println("Pin is already verified");
        }

        @Override
        public void withdraw(double amount) {
            if(atm.balance() >= amount){
                atm.setBalance(atm.balance() - amount);
                System.out.println("Successfully withdrawn " + amount);
            }
            else{
                System.out.println("Insufficient balance");
            }
        }
    }

    public class ATM{
        private double amt  ;
        ATMstate atMstate;
        public void setState(ATMstate atMstate){
            this.atMstate = atMstate;
        }
       public ATM(double amt){
            this.amt = amt;
            atMstate = new NoCardState(this);
        }
        public double balance(){
            return amt;
        }
        public void  setBalance(double rem){
            amt = rem;


        }
        public void insertCard(){
            atMstate.insertCard();
        }
        public void pinInsert(){
            atMstate.insertPin();
        }
        public void withdraw(double amt){
            atMstate.withdraw(amt);
        }
    }
    public void main(String[] args){
        ATM atm = new ATM(5000);

        atm.insertCard();
        atm.withdraw(2342);
        atm.pinInsert();
        atm.insertCard();
        atm.withdraw(2344);
      System.out.println(  atm.balance());

//        CardInsertedState cardInsertedState = new CardInsertedState(atm);
//        cardInsertedState.withdraw(3434);
//        PinVerifiedState pinVerifiedState = new PinVerifiedState(atm);
//        pinVerifiedState.withdraw(6000);
//        pinVerifiedState.withdraw(3000);
    }
}
