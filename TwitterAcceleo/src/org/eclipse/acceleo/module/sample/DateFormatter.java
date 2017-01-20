package org.eclipse.acceleo.module.sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateFormatter {
	public String formatDate(Date source, String timeIndicator) {
		final String NEW_FORMAT = "yyyy-MM-dd";
		SimpleDateFormat f = new SimpleDateFormat(NEW_FORMAT);
		if("until".equals(timeIndicator) || "untilsince".equals(timeIndicator)){
			Date today = new Date();
			Calendar cal = Calendar.getInstance();
			cal.setTime(today);
			cal.add(Calendar.DATE, -10);
			Date dateBefore10Days = cal.getTime();
			if((source.getTime() - dateBefore10Days.getTime()) < 0){
				return "Error#589748955412365478";
			}
		}
		return f.format(source);
	}
}
