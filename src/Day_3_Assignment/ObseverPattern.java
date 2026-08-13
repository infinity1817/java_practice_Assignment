package Day_3_Assignment;

import java.util.ArrayList;
import java.util.List;

public class ObseverPattern {

    interface Observer{
        void update(String video);
    }
    interface Subject{
        void subscribe();
        void unsubscribe();
        void notification();
    }

    public class ConcObserver implements Observer{
        String name;

        ConcObserver(String name){
            this.name = name;
        }

        public void update(String video){
            System.out.println("Hii " + name + " new video arrives on  " + video);
        }
    }

    public class SubjectMain{
        List<ConcObserver> L1 = new ArrayList<>();

        void subscribe(ConcObserver concObserver){
            L1.add(concObserver);
        }

        void unsubscribe(ConcObserver concObserver){
            L1.remove(concObserver);
        }

        void notification(String video){
            for(ConcObserver c:L1){
                c.update(video);
            }
        }
    }
    public void main(String[] args){
        ConcObserver user1 = new ConcObserver("Nimish");
        ConcObserver user2 = new ConcObserver("Abhishek");
        ConcObserver user3 = new ConcObserver("Vansh");
        SubjectMain soti = new SubjectMain();
        soti.subscribe(user1);
        soti.subscribe(user2);
        soti.subscribe(user3);
        soti.notification("Lecture on Design patterns");

    }

}
