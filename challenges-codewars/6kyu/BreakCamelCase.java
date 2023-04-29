/*
Complete the solution so that the function will break up camel casing, using a space between words.
Example
"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""
*/

class BreakCamelCase {
    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}

/*
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void tests() {
      assertEquals( "Incorrect", "camel Casing", Solution.camelCase("camelCasing"));
      assertEquals( "Incorrect", "camel Casing Test", Solution.camelCase("camelCasingTest"));
      assertEquals( "Incorrect", "camelcasingtest", Solution.camelCase("camelcasingtest"));
    }
}
*/
