package Singleton;

/**
 * singleton  lazzy holder
 * 
 * 
 */

public class SingletonLazzyHolder {

  private static class instanceHolder {
    
    public static SingletonLazzyHolder instancia = new SingletonLazzyHolder();
  }

  private SingletonLazzyHolder() {
    super();
  }

  public static SingletonLazzyHolder getInstancia() {

    return instanceHolder.instancia;

  }

}
