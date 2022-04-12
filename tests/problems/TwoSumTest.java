package problems;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    //TODO: Find a way to create tests with parametrized inputs like Theories in C#'s xUnit
    @Test
    public void twoSum_givenAnArrayAndTarget_shouldReturnIndexesOfNumbersThatSumToTarget() {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] expected = {0, 1};

        int[] result = TwoSum.twoSum(numbers, target);
        Assert.assertArrayEquals(expected, result);

        numbers = new int[] {3, 2, 4};
        target = 6;
        expected = new int[] {1, 2};

        result = TwoSum.twoSum(numbers, target);
        Assert.assertArrayEquals(expected, result);

        numbers = new int[] {3, 3};
        target = 6;
        expected = new int[] {0, 1};

        result = TwoSum.twoSum(numbers, target);
        Assert.assertArrayEquals(expected, result);
    }
}
