/**
 *  File: Program.java<br/>
 *  Author: Peter M. Corcoran, pmcorcor@uab.edu<br/>
 *  Assignment: EE433 Research Project<br/>
 *  Version: 1.0.0 11/21/2015 pmc - initial coding<br/>
 *	
 */

import ee433.creational.abstractfactory.*;
import ee433.creational.singleton.*;


public class Program {

	public static void main(String[] args) {
		write("Peter Corcoran - EE433");
		
		runAbstractFactoryExample();
		runSingletonExample();
		
		
	}
	
	public static void runAbstractFactoryExample(){
		write("");
		write("------------------------------------------------------------");
		write("     Abstract Factory Example"); 
		write("------------------------------------------------------------");
		write("Create Animal Factories");
		
		CatFactory cf = new CatFactory();
		DogFactory df = new DogFactory();
		BullDogFactory bf = new BullDogFactory();
		
		write("Create Abstract Factory Client 1 - Cat");
		AbstractFactoryClient afClient1 = new AbstractFactoryClient(cf);
		afClient1.theAnimalSays();
		
		write("Create Abstract Factory Client 2 - Dog");
		AbstractFactoryClient afClient2 = new AbstractFactoryClient(df);
		afClient2.theAnimalSays();
		
		write("Create Abstract Factory Client 3 - Bull Dog");
		AbstractFactoryClient afClient3 = new AbstractFactoryClient(bf);
		afClient3.theAnimalSays();
		
		write("");
		write("------------------------------------------------------------");
		
	}
	
	public static void runSingletonExample(){
		write("");
		write("------------------------------------------------------------");
		write("     Singleton Example"); 
		write("------------------------------------------------------------");
		write("");
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		write("Singleton data: " + s1.SingletonOperation(""));
		write("Modify data for first reference: " + s1.SingletonOperation(" s1 "));
		write("Modify data for second reference: " + s2.SingletonOperation(" s2 "));
		
		write("");
		write("Singleton Score Example");
		
		Score scr1 = Score.getInstance();
		write("Add point: " + scr1.addPoints(100).toString());
		Score scr2 = Score.getInstance();
		write("Add more point: " + scr2.addPoints(100).toString());
		
		
		
		
		write("------------------------------------------------------------");
	}
	
	public static void write(String msg){
		System.out.println(msg);
	}

}