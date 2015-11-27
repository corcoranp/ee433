/**
 *  File: ComputerOnCommand.java<br/>
 *  Author: Peter M. Corcoran, pmcorcor@uab.edu<br/>
 *  Assignment: EE433 Research Project<br/>
 *  Version: 1.0.0 11/27/2015 pmc - initial coding<br/>
 *	Structure Component: Concrete Command Object
 */
package ee433.behavior.command;

public class ComputerOnCommand extends Command {
	public Computer computer;
	
	public ComputerOnCommand(Computer comp){
		computer = comp;
	}
	
	@Override
	public void execute() {
		//Do other items related to turn on
		computer.turnOn();
	}
}
