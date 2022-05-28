package Singleton;

import Strategy.Comportamento;
import Strategy.ComportamentoAgressivo;
import Strategy.ComportamentoDefensivo;
import Strategy.ComportamentoNormal;
import Strategy.Robo;

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

        // Singleton 
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

        // Strategy 
        
        
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.Mover();
        robo.Mover();
        System.out.println("--------------------------------");
        robo.setComportamento(defensivo);
        robo.Mover();
        robo.Mover();
        System.out.println("--------------------------------");
        robo.setComportamento(agressivo);
        robo.Mover();
        robo.Mover();
        System.out.println("--------------------------------");
    }


}
