package CommandPattern.Task1;

public class WingControls implements CommandController {

	public static final String MOVE_UP = "MOVE_UP";
	public static final String MOVE_DOWN = "MOVE_DOWN";
	public static final String KEEP_FLAT = "KEEP_FLAT";
	public static final String TURN_LEFT = "TURN_LEFT";
	public static final String TURN_RIGHT = "TURN_RIGHT";

	private Wings wings;

	public WingControls(Wings wings) {
		this.wings = wings;
	}

	@Override
	public void execute(String command) {
		switch (command) {
		case MOVE_UP:
			wings.moveUp();
			break;
		case MOVE_DOWN:
			wings.moveDown();
			break;
		case KEEP_FLAT:
			wings.keepFlat();
			break;
		case TURN_LEFT:
			wings.turnLeft();
			break;
		case TURN_RIGHT:
			wings.turnRight();
			break;
		default:
			System.out.println("Invalid wing command");
		}

	}

	@Override
	public boolean canHandle(String command) {
		return command.equals(MOVE_UP) || command.equals(MOVE_DOWN) || command.equals(KEEP_FLAT)
				|| command.equals(TURN_LEFT) || command.equals(TURN_RIGHT);
	}

}
