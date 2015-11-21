/**
 *  File: DogFactory.java<br/>
 *  Author: Peter M. Corcoran, pmcorcor@uab.edu<br/>
 *  Assignment: EE433 Research Project<br/>
 *  Version: 1.0.0 11/21/2015 pmc - initial coding<br/>
 *	Description: 
 */

package ee433.creational.abstractfactory;

public class DogFactory extends AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Dog();
	}

}
