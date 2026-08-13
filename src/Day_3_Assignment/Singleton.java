package Day_3_Assignment;

public class Singleton {

    public class newDb{
        private static newDb  newInstance ;
        private newDb(){}

        public synchronized newDb getNewInstance(){
            if(newInstance  == null){
                newInstance = new newDb();
            }

                return newInstance;
            }


    }
    public void main(String[] args){
        newDb N  = new newDb();
        newDb M  = new newDb();

      newDb x =  N.getNewInstance();
      newDb y = M.getNewInstance();
     if(x == y){
         System.out.println("Yessss");
     }
    }
}
