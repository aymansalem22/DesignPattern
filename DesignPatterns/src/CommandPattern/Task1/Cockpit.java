package CommandPattern.Task1;

import java.util.Iterator;
import java.util.List;

public class Cockpit implements CommandController {
	public static final String TAKE_OFF = "TAKE_OFF";
	public static final String LAND = "LAND";
	public static final String REACH_ALTITUDE = "REACH_ALTITUDE";
	public static final String EXIT = "EXIT";

	private List<CommandController> commandControls;

	public Cockpit(List<CommandController> commandControls) {
		commandControls.add(this);
		this.commandControls = commandControls;
	}

	@Override
	public void execute(String command) {
		Iterator<CommandController> commandIterator = this.commandControls.iterator();
		while (commandIterator.hasNext()) {
			CommandController commandController = commandIterator.next();
			if (commandController instanceof Cockpit) {
				switch (command) {
				case TAKE_OFF:
					takeOff();
					break;
				case REACH_ALTITUDE:
					reachAltitudeAndFly();
					break;
				case LAND:
					land();
					break;
				case EXIT:
					System.exit(0);
					break;

				}

			} else if (commandController.canHandle(command)) {
				commandController.execute(command);
			}
		}

	}

	@Override
	public boolean canHandle(String command) {
		// TODO Auto-generated method stub
		return false;
	}

	private void takeOff() {
		System.out.println("Flight take off operations ------");
		this.execute(EngineControls.SPEED_UP);
		this.execute(WingControls.MOVE_UP);
		System.out.println("--------------------------------------------");
	}

	private void reachAltitudeAndFly() {
		System.out.println("Flying at an altitude-------");
		this.execute(EngineControls.SPEED_UP);
		this.execute(WingControls.KEEP_FLAT);
		System.out.println("--------------------------------------");
	}

	private void land() {
		System.out.println("Landing the Flight ---------------");
		this.execute(EngineControls.SLOW_DOWN);
		this.execute(WingControls.MOVE_DOWN);
		System.out.println("-----------------------------");
	}

}
