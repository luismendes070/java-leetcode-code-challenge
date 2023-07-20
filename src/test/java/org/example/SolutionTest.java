package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class SolutionTest
    extends TestCase
{

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SolutionTest(String testName )
    {
        super( testName );
    }



    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    // @Test
    public void test1() {
        Solution s = new Solution();
        int[] nums = {1,3,5,2};
        int[] cost = {2,3,1,14};
        long expected = 8;
        long result = s.minCost(nums, cost);
        assertEquals(expected, result);
    }

    // @Test
    public void test2() {
        Solution s = new Solution();
        int[] nums = {2,2,2,2,2};
        int[] cost = {4,2,8,1,3};
        long expected = 0;
        long result = s.minCost(nums, cost);
        assertEquals(expected, result);
    }

} // end class SolutionTest
