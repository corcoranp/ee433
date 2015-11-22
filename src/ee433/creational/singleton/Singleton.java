package ee433.creational.singleton;

public class Singleton {
	private static Singleton uniqueInstance = new Singleton();
	private String singletonData = "Some Data";
	
	// Private constructor
	private Singleton(){ }
	
	public static Singleton getInstance(){
		return uniqueInstance;
	}
	
	public String SingletonOperation(String data){
		singletonData = singletonData + data;
		return singletonData ;
	}
}
