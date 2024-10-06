package ritam.looseCoupling;

public class Car {

    IEngine engine;

   public Car(IEngine engine){
        this.engine = engine;
    }

    public void start(){
       int start = engine.start();
        if(start>=0){
            System.out.println("Engine has started");
        }
        else{
            System.out.println("Engine is in trouble");
        }
    }


}
