package _05_MediatorPattern.problem.commands;

import _05_MediatorPattern.problem.Mediator;

//concrete _02_CommandPattern
public class TurnOnAllLightsCommand implements Command {

	private Mediator med;
	
	public TurnOnAllLightsCommand(Mediator med) {
		this.med = med;
	}
	
	@Override
	public void execute() {
		med.turnOnAllLights();
	}
}