/**
 *  File: Subject.java<br/>
 *  Author: Peter M. Corcoran, pmcorcor@uab.edu<br/>
 *  Assignment: EE433 Research Project<br/>
 *  Version: 1.0.0 11/23/2015 pmc - initial coding<br/>
 *	Structure Component: Concrete Subject
 */

package ee433.behavior.observer;

import java.util.ArrayList;

public class Subject implements ISubject {
	private ArrayList<IObserver> observers = new ArrayList<IObserver>();
	public String name = "name";
	@Override
	public void attach(IObserver o) {
		observers.add(o);
	}

	@Override
	public void detach(IObserver o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(IObserver o : observers){
			o.update(this, name);
		}
	}

}
