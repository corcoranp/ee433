/**
 *  File: Directory.java<br/>
 *  Author: Peter M. Corcoran, pmcorcor@uab.edu<br/>
 *  Assignment: EE433 Research Project<br/>
 *  Version: 1.0.0 11/22/2015 pmc - initial coding<br/>
 *	Structure Component: Leaf
 */
package ee433.structural.composite;

public class File implements IFileSystemObject {
	public  String name = "File";
	public File(String filename){
		name = filename;
	}
	@Override
	public String getFileName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void add(IFileSystemObject fso) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(IFileSystemObject fso) {
		// TODO Auto-generated method stub

	}

	@Override
	public IFileSystemObject getChild(Integer i) {
		// TODO Auto-generated method stub
		return null;
	}

}
