package us.careydevelopment.util.date;

/**
 * Convenience methods for getting the difference between two date/time objects.
 * 
 * Note that, unless otherwise specified, all dates are assumed to be in UTC. 
 */
public class DateDifferenceUtil {

    
    /**
     * Returns the number of days between now and the given time.
     * 
     * Note that time here is give in the number of milliseconds since 1970 began.
     * 
     * Will return a negative number if the give time is in the past.
     * 
     * @param time
     * @return the number of days in the future or past
     */
    public static Long numberOfDaysFromNow(Long time) {
        Long difference = 0l; 
        Long currentTime = System.currentTimeMillis();
       
        difference = time - currentTime;
        return DateConversionUtil.convertToDays(difference);
    }
}
