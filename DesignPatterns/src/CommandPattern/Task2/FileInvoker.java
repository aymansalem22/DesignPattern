package CommandPattern.Task2;

public class FileInvoker {
	public Command command;

	public FileInvoker(Command c) {
		this.command = c;
	}

	public void execute() {
		command.exceute();
	}

}
