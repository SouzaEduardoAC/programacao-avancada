package pacote.execucao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RunDates {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date parse = sdf.parse("08/11/1983 00:15:32");
		System.out.println(parse);
		
		Calendar instance = Calendar.getInstance();
		instance.set(Calendar.DAY_OF_MONTH, 8);
		instance.set(Calendar.MONTH, Calendar.NOVEMBER);
		instance.set(Calendar.YEAR, 1983);
		instance.set(Calendar.HOUR_OF_DAY, 0);
		instance.set(Calendar.MINUTE, 15);
		instance.set(Calendar.SECOND, 32);
		
		Date time = instance.getTime();
		System.out.println(time);
	}

}
