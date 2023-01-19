package CommandPattern.Task1;

import javax.swing.JOptionPane;

public class Pilot {

	private Cockpit cockpit;
	private String[] commands = { Cockpit.TAKE_OFF, Cockpit.LAND, Cockpit.REACH_ALTITUDE, WingControls.MOVE_UP,
			WingControls.MOVE_DOWN, WingControls.KEEP_FLAT, EngineControls.SLOW_DOWN, EngineControls.SPEED_UP,
			Cockpit.EXIT };

	public Pilot(Cockpit cockpit) {
		this.cockpit = cockpit;
	}

	public void fly() {
		do {
			String command = (String) JOptionPane.showInputDialog(null, "Give Command", "Fly",
					JOptionPane.INFORMATION_MESSAGE, null, commands, Cockpit.TAKE_OFF);
			cockpit.execute(command);

		} while (true);
	}

}
