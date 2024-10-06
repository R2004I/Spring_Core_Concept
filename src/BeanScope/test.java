package BeanScope;

public class test {
    public static void main(String[] args) {
        Singelton singelton1 = Singelton.getInstance();
        Singelton singelton2 = Singelton.getInstance();
        Singelton singelton3 = Singelton.getInstance();
        Singelton singelton4 = Singelton.getInstance();

        System.out.println(singelton1);
        System.out.println(singelton2);
    }
}
