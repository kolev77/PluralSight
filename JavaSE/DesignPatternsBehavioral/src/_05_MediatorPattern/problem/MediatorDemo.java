package _05_MediatorPattern.problem;

import _05_MediatorPattern.problem.commands.Command;
import _05_MediatorPattern.problem.commands.TurnOffAllLightsCommand;
import _05_MediatorPattern.problem.commands.TurnOnAllLightsCommand;

public class MediatorDemo {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		
		Light bedroomLight = new Light("Bedroom");
		Light kitchenLight = new Light("Kitchen");
		
		mediator.registerLight(bedroomLight);
		mediator.registerLight(kitchenLight);
		
		Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
		
		turnOnAllLightsCommand.execute();
		
		Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
		
		turnOffAllLightsCommand.execute();
	}

}
