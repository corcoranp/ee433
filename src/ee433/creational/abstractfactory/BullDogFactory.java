/**
 *  File: BullDogFactory.java<br/>
 *  Author: Peter M. Corcoran, pmcorcor@uab.edu<br/>
 *  Assignment: EE433 Research Project<br/>
 *  Version: 1.0.0 11/21/2015 pmc - initial coding<br/>
 *	
 */

package ee433.creational.abstractfactory;

public class BullDogFactory extends AnimalFactory {

	@Override
	public Animal createAnimal() {
		Dog d = new Dog();
		d.name = "Bull Dog";
		d.sound = "BARK!";
		return d;
	}

}
