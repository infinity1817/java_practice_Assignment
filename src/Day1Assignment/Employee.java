public static  class Employee {
    int id,salary;
    String name;

    Employee(int id,int salary,String name){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("The Employee with id " + id+ " is " + name );
    }

}

public static class Manager extends Employee{
    int id,salary;
    String name,department;
    Manager(int id,int salary,String name,String department){
        super(id,salary,name);
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.department = department;
    }
    @Override void display(){
        System.out.println("The Employee with id " + id  +" is " + name+" and is the manager of "+ department );
    }


}

public static void main(String[] args){
    Employee E1 = new Employee(2,30000,"Nimish");
            Manager M1 = new Manager(4,500000,"John" ,"Dev");
    E1.display();
    M1.display();
}

