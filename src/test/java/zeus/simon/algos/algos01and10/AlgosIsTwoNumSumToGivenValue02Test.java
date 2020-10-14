package zeus.simon.algos.algos01and10;


import org.junit.Assert;
import org.junit.Test;

public class AlgosIsTwoNumSumToGivenValue02Test {


    @Test
    public void BruteForceVersionTest() {
        AlgosTwoNumSumToGivenValue02 t = new AlgosTwoNumSumToGivenValue02();
        Assert.assertArrayEquals(new int[]{1, 4}, t.getTwoNumSumToGivenValueBruteForce(new int[]{1, 2, 3, 6, 8, 11}, 10));
        Assert.assertArrayEquals(new int[]{1, 2}, t.getTwoNumSumToGivenValueBruteForce(new int[]{8, 2, 1, 4}, 3));
        Assert.assertArrayEquals(new int[]{-1, -1}, t.getTwoNumSumToGivenValueBruteForce(new int[]{8, 2, 1, 4}, 0));
        Assert.assertArrayEquals(new int[]{-1, -1}, t.getTwoNumSumToGivenValueBruteForce(new int[]{}, 0));
    }

    @Test
    public void HashMapVersionTest() {
        AlgosTwoNumSumToGivenValue02 t = new AlgosTwoNumSumToGivenValue02();
        Assert.assertArrayEquals(new int[]{1, 4}, t.getTwoNumSumToGivenValueHashMap(new int[]{1, 2, 3, 6, 8, 11}, 10));
        Assert.assertArrayEquals(new int[]{1, 2}, t.getTwoNumSumToGivenValueHashMap(new int[]{8, 2, 1, 4}, 3));
        Assert.assertArrayEquals(new int[]{-1, -1}, t.getTwoNumSumToGivenValueHashMap(new int[]{8, 2, 1, 4}, 0));
        Assert.assertArrayEquals(new int[]{-1, -1}, t.getTwoNumSumToGivenValueHashMap(new int[]{}, 0));
    }


}
