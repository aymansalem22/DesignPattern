package CommandPattern.Task2;

public class CloseFileCommand implements Command {

	private FileSystemReceiver fileSystem;

	public CloseFileCommand(FileSystemReceiver fs) {
		this.fileSystem = fs;
	}

	@Override
	public void exceute() {
		this.fileSystem.closeFile();

	}

}
