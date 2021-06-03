package us.careydevelopment.util.date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Converts date/time objects to another time zone
 */
public class TimeZoneConversionUtil {

    public static Long convertToUtcInMilliseconds(Long time) {
        Long zoned = 0l;
        
        if (time != null) {
            Instant instant = Instant.ofEpochMilli(time);
            ZonedDateTime zdt = instant.atZone(ZoneId.of("UTC"));
            zoned = zdt.toInstant().toEpochMilli();
        }
        
        return zoned;
    }
}
