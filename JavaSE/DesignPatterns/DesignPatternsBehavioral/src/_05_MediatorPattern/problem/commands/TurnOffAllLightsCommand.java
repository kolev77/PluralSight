package _05_MediatorPattern.problem.commands;

import _05_MediatorPattern.problem.Mediator;

//concrete _02_CommandPattern
public class TurnOffAllLightsCommand implements Command {

	private Mediator med;
	
	public TurnOffAllLightsCommand(Mediator med) {
		this.med = med;
	}
	
	@Override
	public void execute() {
		med.turnOffAllLights();
	}
}