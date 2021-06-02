package us.careydevelopment.util.date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DateConversionUtilTest {

    @Test
    public void testConvertToDays() {
        //5 days
        Long time = Long.valueOf(5 * 24 * 60 * 60 * 1000);
        
        Long days = DateConversionUtil.convertToDays(time);
        
        Assertions.assertEquals(5, days);
    }
    
    
    @Test
    public void testConvertToDaysNegative() {
        //-5 days
        Long time = Long.valueOf(-5 * 24 * 61 * 62 * 1000);
        
        Long days = DateConversionUtil.convertToDays(time);
        
        Assertions.assertEquals(-5, days);
    }
    
    
    @Test
    public void testConvertToDaysRounded() {
        //5 days+
        Long time = Long.valueOf(5 * 24 * 60 * 61 * 1000);
        
        Long days = DateConversionUtil.convertToDays(time);
        
        Assertions.assertEquals(5, days);
    }
    
    
    @Test
    public void testConvertToDaysWithNull() {
        Long days = DateConversionUtil.convertToDays(null);
        
        Assertions.assertEquals(0, days);
    }
}
