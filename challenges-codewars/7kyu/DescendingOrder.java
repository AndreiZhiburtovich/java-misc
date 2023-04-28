/*
Your task is to make a function that can take any non-negative integer as an argument and return it
with its digits in descending order. Essentially, rearrange the digits to create the highest
possible number.
Examples:
Input: 42145 Output: 54421
Input: 145263 Output: 654321
Input: 123456789 Output: 987654321
Input: 127456389 Output: 987654321
*/

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(int num) {
        String[] nums = String.valueOf(num).split("");
        Arrays.sort(nums, Collections.reverseOrder());
        return Integer.valueOf(String.join("", nums));
    }
}

/*
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        return Integer.parseInt(String.valueOf(num)
                                      .chars()
                                      .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                                      .sorted(Comparator.reverseOrder())
                                      .collect(Collectors.joining()));
    }
}
*/

/*
import org.junit.Test;
        import static org.junit.Assert.assertEquals;


public class DescendingOrderTest {

    @Test
    public void test_01() {
        assertEquals(0, DescendingOrder.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(51, DescendingOrder.sortDesc(15));
    }

    @Test
    public void test_03() {
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }
}
*/
