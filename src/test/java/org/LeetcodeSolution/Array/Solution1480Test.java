package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution1480 Tester. 
* @author cartoon
* @date 12/01/2020
* @version 1.0 
*/ 
public class Solution1480Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1480Test.class);

    private Solution1480 solution;

    private int[] source1;

    private int[] source2;

    private int[] source3;

    private int[] expect1;

    private int[] expect2;

    private int[] expect3;

    @Before
    public void before(){ 
        solution = new Solution1480();
        source1 = new int[]{1, 2, 3, 4};
        source2 = new int[]{1, 1, 1, 1, 1};
        source3 = new int[]{3, 1, 2, 10, 1};
        expect1 = new int[]{1, 3, 6, 10};
        expect2 = new int[]{1, 2, 3, 4, 5};
        expect3 = new int[]{3, 4, 6, 16, 17};
    }

    /**
     * 
     * Method: runningSum(int[] nums) 
     * 
     */ 
    @Test
    public void testRunningSum(){ 
        int[] res1 = solution.runningSum(source1);
        int[] res2 = solution.runningSum(source2);
        int[] res3 = solution.runningSum(source3);
        log.info("solution 1480 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertArrayEquals(expect1, res1);
        Assert.assertArrayEquals(expect2, res2);
        Assert.assertArrayEquals(expect3, res3);
    } 
    
        
}
