package problems;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void twoSum_givenAnArrayAndTarget_shouldReturnIndexesOfNumbersThatSumToTarget() {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] expected = {0, 1};

        int[] result = TwoSum.twoSum(numbers, target);
        Assert.assertArrayEquals(expected, result);
    }
}
