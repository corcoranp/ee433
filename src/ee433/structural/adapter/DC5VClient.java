/**
 *  File: Client.java<br/>
 *  Author: Peter M. Corcoran, pmcorcor@uab.edu<br/>
 *  Assignment: EE433 Research Project<br/>
 *  Version: 1.0.0 11/22/2015 pmc - initial coding<br/>
 *	Structure Component: Client
 */

package ee433.structural.adapter;

public class DC5VClient {
	private IVoltageAdapter powerAdapter;
	
	public DC5VClient(IVoltageAdapter adapter){
		this.powerAdapter = adapter;
	}
	
	public String getPower(){
		Integer voltage = powerAdapter.getOutput();
		if(voltage > 5){
			return "Voltage too high!!";
		}
		if(voltage < 5){
			return "Voltage too low!!";
		}
		return "5V received from adapter";	
	}
}
