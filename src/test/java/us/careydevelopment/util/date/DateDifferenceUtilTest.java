package us.careydevelopment.util.date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DateDifferenceUtilTest {

    @Test
    public void testSingleDayDifference() {
        Long now = System.currentTimeMillis();
        
        //one day ahead + a little extra to prevent rounding issues
        Long then = now + 86500000;
        
        Long daysAhead = DateDifferenceUtil.numberOfDaysFromNow(then);
        
        Assertions.assertEquals(1, daysAhead);
    }
    
    
    @Test
    public void testPastDateDifference() {
        Long now = System.currentTimeMillis();
        
        //two days past
        Long then = now - (86500000 * 2);
        
        Long daysPast = DateDifferenceUtil.numberOfDaysFromNow(then);
        
        Assertions.assertEquals(-2, daysPast);
    }
}
