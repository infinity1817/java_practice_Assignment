package Day_3_Assignment;

public class TemplatePattern {
     abstract class Beverage{
        public final void prepare(){
            boilWater();
            addIngredients();
            pourInCup();
            addSuger();
            serve();
        }
        protected void boilWater(){
            System.out.println("Water is boiled");
        }
        protected abstract void addIngredients();
        protected void pourInCup(){
            System.out.println("Poured in Cup");
        }

        protected void addSuger(){
            System.out.println("Sugar is added");
        }
        protected void serve(){
            System.out.println("Beverage is served");
        }
    }

    public class Tea extends Beverage{
        @Override
        protected void addIngredients() {
            System.out.println("Added Tea Leaves");
        }
    }
    public class Coffee extends Beverage{

        @Override
        protected void addIngredients() {
            System.out.println("added coffee beans");
        }


    }

    public void main(String[] args){
         Beverage tea = new Tea();
         tea.prepare();
         Beverage coffee  = new Coffee();
         coffee.prepare();
    }
}
