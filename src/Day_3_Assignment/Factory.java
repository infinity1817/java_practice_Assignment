package Day_3_Assignment;

public class Factory {
    interface Vehicle{
        void sound();
    }

    public class Car implements Vehicle{
        @Override
        public void sound() {
            System.out.println("This is a car");
        }
    }

    public class Bike implements Vehicle{
        @Override
        public void sound() {
            System.out.println("This is a bike");
        }
    }

    public class FactoryMethod{
        public Vehicle ToCall(String type){
            if(type.equalsIgnoreCase("Car")){
                return new Car();
            }
            else{
                return new Bike();
            }
        }
    }

    public void main(String[] args){
        FactoryMethod F1 = new FactoryMethod();
        Vehicle vehicle =  F1.ToCall("Car");
        vehicle.sound();
    }
}
