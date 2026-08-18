package Day_5_Assignment;

public class Debug {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
//        System.out.println(s1 == s2);




    }
}
// the output is produced true because java creates a string pool and when we create same string again no new string
// is created it points to same object in string pool thats why it shows true.