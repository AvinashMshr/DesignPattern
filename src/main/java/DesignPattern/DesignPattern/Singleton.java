package DesignPattern.DesignPattern;

/**
 * Hello world!
 *
 */
public class Singleton 
{
  private static volatile Singleton singleton= null;
  
  private Singleton() {
	  if(singleton != null) {
		  throw new RuntimeException("Use get instance method");
	  }
  }
  
  public static Singleton getInstance() {
	  if(singleton == null) {
		  synchronized (Singleton.class) {
			if(singleton == null) {
				singleton = new Singleton();
			}
		}
	  }
	  return singleton;
  }
}
