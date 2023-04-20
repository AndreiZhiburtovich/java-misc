/*
Create a function called shortcut to remove the lowercase vowels (a, e, i, o, u ) in a given string.
Examples
"hello"     -->  "hll"
"codewars"  -->  "cdwrs"
"goodbye"   -->  "gdby"
"HELLO"     -->  "HELLO"
don't worry about uppercase vowels
y is not considered a vowel for this kata
*/

public class VowelRemover {
    public static String shortcut(String input) {
        return input.replaceAll("[aeiou]", "");
    }
}

/*
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class KataTest {
    @Test
    void test1() {
      assertEquals("hll", Kata.shortcut("hello"));
      assertEquals("hw r y tdy?", Kata.shortcut("how are you today?"));
      assertEquals("cmpln", Kata.shortcut("complain"));
      assertEquals("nvr", Kata.shortcut("never"));
    }
}
*/