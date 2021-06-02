package us.careydevelopment.util.date;

/**
 * Utility methods to convert date-related objects.
 */
public class DateConversionUtil {

    public static final Long NUMBER_OF_MILLISECONDS_IN_SECOND = 1000l;
    public static final Long NUMBER_OF_MILLISECONDS_IN_MINUTE = NUMBER_OF_MILLISECONDS_IN_SECOND * 60l;
    public static final Long NUMBER_OF_MILLISECONDS_IN_HOUR = NUMBER_OF_MILLISECONDS_IN_MINUTE * 60l;
    public static final Long NUMBER_OF_MILLISECONDS_IN_DAY = NUMBER_OF_MILLISECONDS_IN_HOUR * 24;
    public static final Long NUMBER_OF_MILLISECONDS_IN_WEEK = NUMBER_OF_MILLISECONDS_IN_DAY * 7;
    
    //TODO: gotta handle leap years
    public static final Long NUMBER_OF_MILLISECONDS_IN_YEAR = NUMBER_OF_MILLISECONDS_IN_DAY * 365;
    
    
    /**
     * Converts milliseconds to days.
     * 
     * @param time
     * @return the number of days
     */
    public static Long convertToDays(Long time) {
        return convert(time, NUMBER_OF_MILLISECONDS_IN_DAY);
    }
    
    
    /**
     * Converts milliseconds to hours.
     * 
     * @param time
     * @return the number of hours
     */
    public static Long convertToHours(Long time) {
        return convert(time, NUMBER_OF_MILLISECONDS_IN_HOUR);
    }
    
    
    /**
     * Converts milliseconds to minutes.
     * 
     * @param time
     * @return the number of minutes
     */
    public static Long convertToMinutes(Long time) {
        return convert(time, NUMBER_OF_MILLISECONDS_IN_MINUTE);
    }
    
    
    /**
     * Converts milliseconds to a different metric depending on denominator.
     * 
     * @param time
     * @return different metric
     */
    public static Long convert(Long time, Long denominator) {
        Long converted = 0l;
        
        if (time != null && denominator != null) {
            converted = time / denominator;
        }
        
        return converted;
    }
}
