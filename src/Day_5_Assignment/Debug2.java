package Day_5_Assignment;

public class Debug2 {
    public static void main(String[] args) {

        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

}
// The first statement is false because when we create string like this new object is created in string pool and
// s1==s2 checks if objects are same or not so it is false.
// but s1.equals(s2) compares the value inside the string and it is same so it is true.