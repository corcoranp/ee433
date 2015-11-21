/**
 *  File: AbstractFactoryClient.java<br/>
 *  Author: Peter M. Corcoran, pmcorcor@uab.edu<br/>
 *  Assignment: EE433 Research Project<br/>
 *  Version: 1.0.0 11/21/2015 pmc - initial coding<br/>
 *	
 */
package ee433.creational.abstractfactory;

public class AbstractFactoryClient {
	public AnimalFactory animalFactory; 
	
	public AbstractFactoryClient (AnimalFactory factory){
		animalFactory = factory;
	}
	
	public AbstractFactoryClient() {
		//no default factory
	}

	public void theAnimalSays(){
		Animal a = animalFactory.createAnimal();
		System.out.println("The " + a.name + " says " + a.sound);
	}
}
