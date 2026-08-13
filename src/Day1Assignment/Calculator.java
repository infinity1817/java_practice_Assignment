package Day1Assignment;

public  class Calculator {
    int a,b;
    Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    void add(){
        int sum = a+b;
        System.out.println(sum);
    }

    void subtract(){
        int sum = a-b;
        System.out.println(sum);
    }

    void multiply(){
        int sum = a*b;
        System.out.println(sum);
    }

    void divide(){
        if(b == 0){
            System.out.println("Undefined");
        }
        else{
            int sum  = a/b;
            System.out.println(sum);
        }
    }

    public static void main(String[] args){
        Calculator C1 = new Calculator(5,10);
        C1.add();
    }
}
