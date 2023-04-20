/*
Convert a Boolean to a String
Implement a function which convert the given boolean value into its string representation.
Note: Only valid inputs will be given.
*/

public class BooleanToString {
    public static String convert(boolean b) {
        return Boolean.toString(b);
    }
}

/*
import org.junit.jupiter.api.Test;
        import static org.junit.jupiter.api.Assertions.assertEquals;

class BoolToStrTest{
    @Test void testTrue(){
        assertEquals("true", BooleanToString.convert(true));
    }

    @Test void testFalse(){
        assertEquals("false", BooleanToString.convert(false));
    }
}
*/
