/**
 *  File: Observer.java<br/>
 *  Author: Peter M. Corcoran, pmcorcor@uab.edu<br/>
 *  Assignment: EE433 Research Project<br/>
 *  Version: 1.0.0 11/23/2015 pmc - initial coding<br/>
 *	Structure Component: Concrete Observer
 */
package ee433.behavior.observer;

public class Observer implements IObserver {
	public String name = "";
	@Override
	public void update(ISubject subject, Object arg) {
		System.out.println(name + " was updated from : " + arg);
	}
}
