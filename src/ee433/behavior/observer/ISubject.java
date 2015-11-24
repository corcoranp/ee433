/**
 *  File: ISubject.java<br/>
 *  Author: Peter M. Corcoran, pmcorcor@uab.edu<br/>
 *  Assignment: EE433 Research Project<br/>
 *  Version: 1.0.0 11/23/2015 pmc - initial coding<br/>
 *	Structure Component: Interface Subject
 */
package ee433.behavior.observer;

public interface ISubject {
	public void attach(IObserver o);
	public void detach(IObserver o);
	public void notifyObservers();
}
