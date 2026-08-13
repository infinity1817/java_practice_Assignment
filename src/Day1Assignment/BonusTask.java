package Day1Assignment;

import java.util.Objects;

public class BonusTask {
    String name;
    int  grade;
    static int count  = 0;
    String[] student = new String[10];
    int[] grades = new int[10];
    void add(String name,int grade){
        student[count] = name;
        grades[count] = grade;
        count++;

        System.out.println("Successfully added new student");

    }
    void display(){
        for(int i=0;i<count;i++){
            System.out.println(student[i] + " " + grades[i]);
        }
    }

    void search(String name){
        boolean tr = false;
        for(int i=0;i<count;i++){
            if(Objects.equals(student[i], name)){
                tr = true;
                break;
            }
        }
        if(tr){
            System.out.println("Student Found");
        }
        else {
            System.out.println("Student Not Found");
        }
    }




}
