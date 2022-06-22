package altin.fh.kelmendi_datetimeapi.UnitTests;

import altin.fh.kelmendi_datetimeapi.controller.DateTimeController;
import org.junit.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeTests {

    @Test
    public void testDate(){
        DateTimeController controller = new DateTimeController();

        String actual = controller.today();
        String expected = LocalDate.now().toString();

        Assert.assertEquals("Should be today!",expected, actual);
    }

    @Test
    public void testTime(){
        DateTimeController controller = new DateTimeController();

        String actual = controller.now().substring(0,6);
        String expected = LocalTime.now().toString().substring(0,6);

        Assert.assertEquals("Should be today!",expected, actual);
    }

}
