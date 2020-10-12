package zeus.simon.algos.algos01and10;


import org.junit.Assert;
import org.junit.Test;

public class AlgosIsPalindrome01Test {

    @Test
    public void isPalindromeTest() {
        AlgosIsPalindrome01 v = new AlgosIsPalindrome01();
        Assert.assertEquals(true, v.isPalindrome(null));
        Assert.assertEquals(true,v.isPalindrome(""));
        Assert.assertEquals(true,v.isPalindrome(" race a E-car "));
        Assert.assertEquals(false,v.isPalindrome("race a car"));
    }
}
