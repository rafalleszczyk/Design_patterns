package design.patterns;

public class Main {

    public static void main(String[] args) {

        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();

        // Objects are the same!
        System.out.println(firstInstance);
        System.out.println(secondInstance);

    }
}
