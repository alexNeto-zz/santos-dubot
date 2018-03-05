package com.admin.tafmetar.utils;

import java.util.Calendar;
import java.util.TimeZone;

public class DateTimeUtils {

    private Calendar now;

    public DateTimeUtils() {
        this.now = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    }

    public String getFormatedDate() {
        StringBuffer dateBuffer = new StringBuffer();
        dateBuffer.append(now.YEAR);
        dateBuffer.append(now.MONTH);
        dateBuffer.append(now.DAY_OF_MONTH);
        dateBuffer.append(now.HOUR_OF_DAY);
        return dateBuffer.toString();
    }
}
