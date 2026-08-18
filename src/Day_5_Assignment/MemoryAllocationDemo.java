package Day_5_Assignment;

public class MemoryAllocationDemo {
    public class demo{
        //local variables
        int name,age;
        demo(int n,int a){
            this.name=n;
            this.age=a;
        }
        // method creation
        void getName(){
            System.out.println(name);
        }
        void getAge(){
            System.out.println(age);
        }
    }
    public  void main(String[] args) {
        // object creation of demo class
        demo d1 = new demo(22,24);
        d1.getName();
        d1.getAge();
        //primitive variables
        int a = 50;
        // variables like a , object variables like name age are stored in stack memory.
        // Objects like d1 are stored in heap memory


    }
}
