/**
 *  File: CatFactory.java<br/>
 *  Author: Peter M. Corcoran, pmcorcor@uab.edu<br/>
 *  Assignment: EE433 Research Project<br/>
 *  Version: 1.0.0 11/21/2015 pmc - initial coding<br/>
 *	Description: Defines how to create a cat
 */
package ee433.creational.abstractfactory;

public class CatFactory extends AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Cat();
	}
}
