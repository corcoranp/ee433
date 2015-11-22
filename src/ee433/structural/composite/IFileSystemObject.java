/**
 *  File: IFileSystemObject.java<br/>
 *  Author: Peter M. Corcoran, pmcorcor@uab.edu<br/>
 *  Assignment: EE433 Research Project<br/>
 *  Version: 1.0.0 11/22/2015 pmc - initial coding<br/>
 *	Structure Component: Component Interface
 */

package ee433.structural.composite;

public interface IFileSystemObject {
	public String getFileName();
	public void add(IFileSystemObject fso);
	public void remove(IFileSystemObject fso);
	public IFileSystemObject getChild(Integer i);
}
