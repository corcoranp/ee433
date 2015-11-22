/**
 *  File: VoltageAdapter5V.java<br/>
 *  Author: Peter M. Corcoran, pmcorcor@uab.edu<br/>
 *  Assignment: EE433 Research Project<br/>
 *  Version: 1.0.0 11/22/2015 pmc - initial coding<br/>
 *	Structure Component: Concrete Adapter
 */

package ee433.structural.adapter;

public class VoltageAdapter5V implements IVoltageAdapter {
	public static ACSocket adapted;
	
	public VoltageAdapter5V(ACSocket ac){
		adapted = ac;
	}
	
	@Override
	public Integer getOutput() {
		//Illustrates conversion of some value to make it 
		//compatible for the calling client.
		Double d = (adapted.getOutput() * 0.636); //AC to DC
		Double divider = d / 15.2;  // Hard coded voltage divider
		Integer output = divider.intValue(); // should be 5 volts..
		return output;
	}

}
