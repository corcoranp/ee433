/**
 *  File: Directory.java<br/>
 *  Author: Peter M. Corcoran, pmcorcor@uab.edu<br/>
 *  Assignment: EE433 Research Project<br/>
 *  Version: 1.0.0 11/22/2015 pmc - initial coding<br/>
 *	Structure Component: Component
 */
package ee433.structural.composite;

import java.util.Vector;

public class Directory implements IFileSystemObject {
	public String name = "directory";
	public Vector<IFileSystemObject> subitems = new Vector<IFileSystemObject>();
	
	@Override
	public String getFileName() {
		return name;
	}

	@Override
	public void add(IFileSystemObject fso) {
		subitems.add(fso);
	}

	@Override
	public void remove(IFileSystemObject fso) {
		subitems.remove(fso);
	}

	@Override
	public IFileSystemObject getChild(Integer i) {
		return subitems.get(i);
	}
}
