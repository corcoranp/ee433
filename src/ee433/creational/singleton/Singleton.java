/**
 *  File: Singleton.java<br/>
 *  Author: Peter M. Corcoran, pmcorcor@uab.edu<br/>
 *  Assignment: EE433 Research Project<br/>
 *  Version: 1.0.0 11/22/2015 pmc - initial coding<br/>
 *	Structure Component: Singleton
 */

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
