package CommandPattern.Task1;

public class EngineControls implements CommandController {

	public static final String SPEED_UP = "SPEED_UP";
	public static final String SLOW_DOWN = "SLOW_DOWN";

	Engine engine;

	public EngineControls(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void execute(String command) {
		switch (command) {
		case SPEED_UP:
			engine.speedUp();
			break;
		case SLOW_DOWN:
			engine.slowDown();
			break;
		default:
			System.out.println("Invalid Engine command");
		}

	}

	@Override
	public boolean canHandle(String command) {
		return command.equals(SPEED_UP) || command.equals(SLOW_DOWN);
	}

}
