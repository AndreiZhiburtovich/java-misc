/*
Write a function named setAlarm which receives two parameters.
The first parameter, employed, is true whenever you are employed and the second parameter,
vacation is true whenever you are on vacation.
The function should return true if you are employed and not on vacation
(because these are the circumstances under which you need to set an alarm).
It should return false otherwise.
Examples:
setAlarm(true, true) -> false
setAlarm(false, true) -> false
setAlarm(false, false) -> false
setAlarm(true, false) -> true
*/

public class SetAlarm {
    public static boolean setAlarm(boolean employed, boolean vacation) {
        return employed && !vacation;
    }
}

/*
import static org.junit.Assert.*;
import org.junit.Test;

public class AlarmTest {

    @Test
    public void setAlarmTest() {
        assertTrue("Should be true.", Alarm.setAlarm(true, false));
        assertFalse("Should be false.", Alarm.setAlarm(true, true));
        assertFalse("Should be false.", Alarm.setAlarm(false, false));
        assertFalse("Should be false.", Alarm.setAlarm(false, true));
    }
}
*/
