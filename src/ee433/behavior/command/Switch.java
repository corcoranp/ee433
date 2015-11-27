/**
 *  File: Swtich.java<br/>
 *  Author: Peter M. Corcoran, pmcorcor@uab.edu<br/>
 *  Assignment: EE433 Research Project<br/>
 *  Version: 1.0.0 11/27/2015 pmc - initial coding<br/>
 *	Structure Component: Invoker Object
 */
package ee433.behavior.command;

public class Switch {
	public Command onCmd;
	public Command offCmd;
	
	public Switch (Command oncmd, Command offcmd){
		onCmd = oncmd;
		offCmd = offcmd;
	}
	
	public void PressOn (){
		onCmd.execute();
	}
	
	public void PressOff(){
		offCmd.execute();
	}
}
