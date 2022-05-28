package Singleton;

public class test1 {

    public static void main(String[] args) {

        SingletonLazzy lazy = SingletonLazzy.getInstancia();
        SingletonLazzy lazy1 = SingletonLazzy.getInstancia();
        /// testes duas instacias

        SingletonEager eager = SingletonEager.getInstancia();
        SingletonEager eager1 = SingletonEager.getInstancia();

        SingletonLazzyHolder lazyHolder = SingletonLazzyHolder.getInstancia();
        SingletonLazzyHolder lazyHolder1 = SingletonLazzyHolder.getInstancia();

        // tests relacionados ao Design Pattern Singeton;
        System.out.println("--------------------------------");
        System.out.println("             Test               ");
        System.out.println("--------------------------------");
        System.out.println(lazy);
        System.out.println(lazy1);
        System.out.println("--------------------------------");

        System.out.println(eager);
        System.out.println(eager1);
        System.out.println("--------------------------------");

        System.out.println(lazyHolder);
        System.out.println(lazyHolder1);
        System.out.println("--------------------------------");

    }

}
