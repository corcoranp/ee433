/**
 *  File: IObserver.java<br/>
 *  Author: Peter M. Corcoran, pmcorcor@uab.edu<br/>
 *  Assignment: EE433 Research Project<br/>
 *  Version: 1.0.0 11/23/2015 pmc - initial coding<br/>
 *	Structure Component: Interface Observer
 */
package ee433.behavior.observer;

public interface IObserver {

	public void update(ISubject subject, Object arg);
}
