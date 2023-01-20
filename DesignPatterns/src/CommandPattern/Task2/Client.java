package CommandPattern.Task2;

public class Client {
	public static void main(String[] args) {
		// creating the receiver
		FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

		// create the command with the associating receiver
		OpenFileCommand openFileCommand = new OpenFileCommand(fs);

		// creating invoker and associate it with the command
		FileInvoker myFile = new FileInvoker(openFileCommand);

		// perform action an invoker object
		myFile.execute();

		WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
		myFile = new FileInvoker(writeFileCommand);
		myFile.execute();

		CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
		myFile = new FileInvoker(closeFileCommand);
		myFile.execute();

	}

}
