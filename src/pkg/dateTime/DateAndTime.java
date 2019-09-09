package pkg.dateTime;

import java.util.Date;
import java.text.*;

public class DateAndTime {

	public static void main(String[] args) {
		
		Date data = new Date();
		System.out.println(data.toString());
		System.out.println(data.getTime());

		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd HH:mm:ss");
		System.out.println(sdf.format(data));
	
	}

}
