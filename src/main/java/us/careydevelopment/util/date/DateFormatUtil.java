package us.careydevelopment.util.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatUtil {
    
    public static final DateFormat JUST_DATE_FORMAT = new SimpleDateFormat("MM/dd/yy");
    public static final DateFormat TIME_OF_DAY_FORMAT = new SimpleDateFormat("HH:mm");
    public static final DateFormat JUST_HOUR_FORMAT = new SimpleDateFormat("hha");
    public static final DateFormat FORMAT_8601 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX");
    
    public static String getDate(Long time) {
        return JUST_DATE_FORMAT.format(new Date(time));
    }
    
    public static String getHourOfDay(Long time) {
        return JUST_HOUR_FORMAT.format(new Date(time));
    }
    
    public static Long getTime(String dateString, DateFormat dateFormat) {
        Long time = 0l;
        
        try {
            Date d = dateFormat.parse(dateString);
            time = d.getTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return time;
    }
}
