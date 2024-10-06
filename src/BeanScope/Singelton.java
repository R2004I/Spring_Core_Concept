package BeanScope;

public class Singelton {

    public static Singelton singelton = null;

    public static Singelton getInstance(){
        if(singelton==null){
            singelton = new Singelton();
        }
        return singelton;
    }
}
