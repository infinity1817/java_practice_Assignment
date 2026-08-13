package Day_3_Assignment;

public class Prototype {

   public  class Person implements Cloneable{
       String name;
       int age;
       Person(String name,int age){
           this.name = name;
           this.age = age;
       }
       @Override
       public Person clone() throws CloneNotSupportedException{
           return (Person)super.clone();
       }
       public void getInfo(){
           System.out.println(name + " "+ age);
       }

   }

   public void main(String[] args) throws CloneNotSupportedException {
       Person p1 = new Person("Nimish" ,21);
       Person p2 = p1.clone();
       p2.getInfo();
   }
}
