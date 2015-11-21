/**
 *  File: Dog.java<br/>
 *  Author: Peter M. Corcoran, pmcorcor@uab.edu<br/>
 *  Assignment: EE433 Research Project<br/>
 *  Version: 1.0.0 11/21/2015 pmc - initial coding<br/>
 *  Structure Component: Concrete Product
 *	Description: 
 */

package ee433.creational.abstractfactory;

public class Dog extends Animal {
	public Dog(){
		//default dog information
		this.name = "dog";
		this.sound = "bark";
	}
}
