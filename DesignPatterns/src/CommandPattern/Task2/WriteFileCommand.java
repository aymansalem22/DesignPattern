package CommandPattern.Task2;

public class WriteFileCommand implements Command {
	private FileSystemReceiver fileSystem;

	public WriteFileCommand(FileSystemReceiver fs) {
		this.fileSystem = fs;
	}

	@Override
	public void exceute() {
		this.fileSystem.writeFile();

	}

}
