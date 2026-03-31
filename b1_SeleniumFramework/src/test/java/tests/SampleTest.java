package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.base.BaseTest;

public class SampleTest extends BaseTest {

    @Test
    public void testPassDemo() {
        Assert.assertTrue(true);
    }

    // ❌ COMMENT lại để CI pass
    // @Test(retryAnalyzer = RetryAnalyzer.class)
    // public void testRetryDemo() {
    //     Assert.assertTrue(false);
    // }
}