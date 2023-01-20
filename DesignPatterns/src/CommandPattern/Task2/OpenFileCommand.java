package CommandPattern.Task2;

public class OpenFileCommand implements Command {
	private FileSystemReceiver fileSystem;

	public OpenFileCommand(FileSystemReceiver fs) {
		this.fileSystem = fs;
	}

	@Override
	public void exceute() {
		this.fileSystem.openFile();

	}

}
