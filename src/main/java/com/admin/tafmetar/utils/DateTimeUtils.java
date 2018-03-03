package com.admin.tafmetar.utils;

import java.util.Calendar;

public class DateTimeUtils {

    Calendar now;

    public DateTimeUtils() {
        this.now = Calendar.getInstance();
    }

    public String getFormatedDate() {
        StringBuffer dateBuffer = new StringBuffer();
        dateBuffer.append(now.YEAR);
        dateBuffer.append(now.MONTH);
        dateBuffer.append(now.DAY_OF_MONTH);
        dateBuffer.append(now.HOUR);
        return dateBuffer.toString();
    }
}
