package W1L3.prob5;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class MyDate {

	private LocalDate date;
	private Month month;

	public MyDate(int m, int d, int y) {
		this.date = LocalDate.of(y, m, d);
	}

	public MyDate(String mS, int d, int y) {

		switch (mS) {
		case "January":
			month = Month.JANUARY;
			break;
		case "February":
			month = Month.FEBRUARY;
			break;
		case "March":
			month = Month.MARCH;
			break;
		case "April":
			month = Month.APRIL;
			break;
		case "May":
			month = Month.MAY;
			break;
		case "June":
			month = Month.JUNE;
			break;
		case "July":
			month = Month.JULY;
			break;
		case "August":
			month = Month.AUGUST;
			break;
		case "September":
			month = Month.SEPTEMBER;
			break;
		case "October":
			month = Month.OCTOBER;
			break;
		case "November":
			month = Month.NOVEMBER;
			break;
		case "December":
			month = Month.DECEMBER;
			break;
		default:
			month = Month.JANUARY;
		}

		this.date = LocalDate.of(y, month, d);
	}

	public MyDate(int dn, int y) {
		this.date = LocalDate.ofYearDay(y, dn);
	}

	public String getFormattedDate() {
		return "MM/dd/yyyy: " + date.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")) + '\n' + "MMMM dd,yyyy: "
				+ date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)) + '\n' + "DDD yyyy: "
				+ date.format(DateTimeFormatter.ofPattern("D YYYY")) + '\n';
	}

}
