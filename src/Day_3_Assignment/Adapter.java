package Day_3_Assignment;

public class Adapter {
    interface Charger{
        void charge();
    }

    public class oldCharger implements Charger{
        @Override
        public void charge(){
            System.out.println("Old Charger Needed");
        }
    }
    public class newCharger  implements Charger{
        @Override
        public void charge(){

            System.out.println("New Charger needed");

        }

    }
    public class chargeAdapter implements Charger{
        oldCharger o1 = new oldCharger();
        newCharger n1 = new newCharger();

        String device;
        chargeAdapter(String device){
            this.device = device;
        }
       @Override
       public void charge(){
            if(device.equalsIgnoreCase("new")){
                n1.charge();
            }
            else if(device.equalsIgnoreCase("old")){

                o1.charge();
            }
            else{
                System.out.println("Device Not recognized");
            }

        }


    }

    public void main(String[] args){
        chargeAdapter adapter = new chargeAdapter("dcsdc");
        adapter.charge();
    }
}
