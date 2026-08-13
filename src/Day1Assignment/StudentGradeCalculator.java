package Day1Assignment;

public  class StudentGradeCalculator {
    String name;
    int rollNo;
    int m1,m2,m3,m4,m5;

    StudentGradeCalculator(String name, int rollNo, int m1, int m2, int m3, int m4, int m5){
        this.name = name;
        this.rollNo = rollNo;
        this.m1 =m1;
        this.m2 =m2;
        this.m3 =m3;
        this.m4 =m4;
        this.m5 =m5;

    }

    void total(){
        int sum = m1+m2+m3+m4+m5;
        System.out.println(sum);
    }
    void getPercentage(){
        float sum = m1+m2+m3+m4+m5;
        sum/=500;
        sum*=100;
        System.out.println(sum);
    }

    void grade(){
        float sum = m1+m2+m3+m4+m5;
        sum/=500;
        sum*=100;

        if(sum >= 90){
            System.out.println("A");
        }
        else if(sum >=80 ){
            System.out.println("B");
        }
        else{
            System.out.println("C");
        }
    }

    public static void main(String[] args) {
        StudentGradeCalculator Sc = new StudentGradeCalculator("Nimish", 10, 50, 60, 70, 80, 81);
        Sc.getPercentage();
        Sc.grade();
    }


    }

//public static void main(String[] args){
//    StudentGradeCalculator Sc = new StudentGradeCalculator("Nimish" ,10 ,50,60,70,80,81);
//    Sc.getPercentage();
//    Sc.grade();
//}
