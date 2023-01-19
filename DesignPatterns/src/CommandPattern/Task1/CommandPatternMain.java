package CommandPattern.Task1;

import java.util.ArrayList;
import java.util.List;

public class CommandPatternMain {
	public static void main(String[] args) {
		WingControls wingControls = new WingControls(new Wings());
		EngineControls engineControls = new EngineControls(new Engine());
		List<CommandController> commandControllers = new ArrayList<>();
		commandControllers.add(wingControls);
		commandControllers.add(engineControls);
		Cockpit cockpit = new Cockpit(commandControllers);

		Pilot pilot = new Pilot(cockpit);
		pilot.fly();
	}
}
