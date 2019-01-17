package _02_CommandPattern.problem.commands;

import _02_CommandPattern.problem.Light;

//concrete _02_CommandPattern
public class OnCommand implements Command {

	private Light light;
	
	public OnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

}
