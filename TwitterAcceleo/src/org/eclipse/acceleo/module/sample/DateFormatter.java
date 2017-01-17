package org.eclipse.acceleo.module.sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Stereotype;

public class DateFormatter {
	public String formatDate(String source) {
		final String OLD_FORMAT = "EEE MMM dd HH:mm:ss ZZZZZ yyyy";
		final String NEW_FORMAT = "yyyy-MM-dd";

		String newDateString = "";

		SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
		Date d;
		try {
			d = sdf.parse(source);
			sdf.applyPattern(NEW_FORMAT);
			newDateString = sdf.format(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return newDateString;
	}
}
