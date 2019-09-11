package W1L3.prob2;

import java.text.DateFormat;
import java.util.Date;

public class Util {
	public static String dateAsString(Date d) {
		DateFormat f = DateFormat.getDateInstance(DateFormat.DEFAULT);
		return f.format(d);
	}
	
}
