package ObserverPattern.Task2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("hh:mm MM/dd/yyyy");
		int c=1;
		try {
			Date d=sdf.parse(c+":00 "+c+"/5/2022");
			System.out.println(d);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
