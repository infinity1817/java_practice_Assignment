package Day_3_Assignment;

public class Facade {
    public class Tv {
        public void on(){
            System.out.println("Tv is on");
        }

        public  void off(){
            System.out.println("Tv is off");
        }

    }

    public class Speaker{
        public void on(){
            System.out.println("Speakers are on");

        }

        public void off(){
            System.out.println("Speakers are off");
        }
        public void setVolume(int vol){
            System.out.println("Volume is now " + vol);
        }

    }

    public class Lights{
        public void on(){
            System.out.println("Lights are on");

        }
        public void off(){
            System.out.println("Lights are off");
        }

    }

    public class HomeThetare{
        Tv tv;
        Speaker speaker;
        Lights lights;

        HomeThetare(Tv tv, Speaker speaker,Lights lights){
            this.tv = tv;
            this.speaker = speaker;
            this.lights = lights;
        }
        public void watchShow(String name){
            System.out.println(name + " is currently playing");
            tv.on();
            speaker.on();
            lights.off();
        }

        public void stopShow(){
            System.out.println("Stop playing");
            tv.off();
            speaker.off();
            lights.on();
        }

    }

    public void main(String[] args){
        Tv tv = new Tv();
        Speaker speaker = new Speaker();
        Lights lights = new Lights();
        HomeThetare homeThetare = new HomeThetare(tv,speaker,lights);
        homeThetare.watchShow("Sex Education");
    }
}


