package ObserverPattern.Task1;

public class ObserverMain {
	
public static void main(String[] args) {
	IBM ibm=new IBM();
	Apple apple=new Apple();
	Microsoft microsoft=new Microsoft();
	
	Mobile mobile=new Mobile();
	DisplayBoard displayBoard=new DisplayBoard();
	Desktop desktop=new Desktop();
	
	ibm.registerObserver(mobile);
	ibm.registerObserver(displayBoard);
	ibm.registerObserver(desktop);
	
	apple.registerObserver(mobile);
	apple.registerObserver(displayBoard);
	
	microsoft.registerObserver(mobile);
	microsoft.registerObserver(displayBoard);
	
	for(int i=0;i<300;i++) {
		ibm.updateStockPrice((int) (Math.random()*101)+1);
		apple.updateStockPrice((int) (Math.random()*101)+1);
		microsoft.updateStockPrice((int) (Math.random()*101)+1);
		System.out.println("=====================");
	}
}
}
