package Day_5_Assignment;

class Student {

}
public class Demo3 {
    public static void main(String[] args) {

        Student s = new Student();

        s = null;

        System.gc();

        System.out.println("Finished");
    }
}

// new object is created and after that s points to null so no we cant access the object anymore so it is eligible for garbage collection.

// it depends on jvm because gc doesn't mean to run garbage collector it just hints jvm to run garbage collector and jvm decides whether run it or not.

