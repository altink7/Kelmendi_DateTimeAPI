package altin.fh.kelmendi_datetimeapi.UnitTests;

import altin.fh.kelmendi_datetimeapi.controller.DateTimeController;
import org.junit.*;

import java.time.LocalDate;

public class DateTimeTests {

    @Test
    public void testDate(){
        DateTimeController controller = new DateTimeController();

        String actual = controller.today();
        String expected = LocalDate.now().toString();

        Assert.assertEquals("Should be today!",expected, actual);
    }

}
