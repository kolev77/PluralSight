package _02_CommandPattern.problem;

import _02_CommandPattern.problem.commands.AllLightsCommand;
import _02_CommandPattern.problem.commands.Command;
import _02_CommandPattern.problem.commands.OnCommand;
import _02_CommandPattern.problem.commands.ToggleCommand;

import java.util.ArrayList;
import java.util.List;

//client
public class CommandDemo {

	public static void main(String args[]) {
		Light bedroomLight = new Light();
		Light kitchenLight = new Light();
		Switch lightSwitch = new Switch(); 
		
		Command toggleCommand = new ToggleCommand(bedroomLight);
		
		lightSwitch.storeAndExecute(toggleCommand);
		OnCommand onCommand = new OnCommand(bedroomLight);

		//lightSwitch.storeAndExecute(toggleCommand);
		//lightSwitch.storeAndExecute(toggleCommand);
		
//		List<Light> lights = new ArrayList<>();
//		lights.add(kitchenLight);
//		lights.add(bedroomLight);
//		Command allLightsCommand = new AllLightsCommand(lights);
//
//		lightSwitch.storeAndExecute(allLightsCommand);
	}
}
