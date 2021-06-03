package us.careydevelopment.util.date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;

public class TimeZoneConversionUtilTest {

    @Test
    public void testEastCoastConversion() {
        LocalDateTime ldt = LocalDateTime.now();
        ZonedDateTime utc = ldt.atZone(ZoneId.of("UTC"));
        ZonedDateTime eastern = utc.withZoneSameInstant(ZoneId.of("US/Eastern"));
        Long now = eastern.toInstant().toEpochMilli();
        System.err.println(eastern);
        
        //Long now = System.currentTimeMillis();
        System.err.println(now);
        
        Long zoned = TimeZoneConversionUtil.convertToUtcInMilliseconds(now);
        System.err.println(zoned);
        
        System.err.println(now - zoned);
    }
}
