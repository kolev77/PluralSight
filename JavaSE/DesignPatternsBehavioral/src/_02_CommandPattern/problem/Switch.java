package _02_CommandPattern.problem;

import _02_CommandPattern.problem.commands.Command;

//invoker
public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}
}
