package org.eclipse.acceleo.module.sample;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFormatter {
	public String formatDate(Date source) {
		final String NEW_FORMAT = "yyyy-MM-dd";
		SimpleDateFormat f = new SimpleDateFormat(NEW_FORMAT);
		return f.format(source);
	}
}
