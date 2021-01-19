package org.LeetcodeSolution.DynamicPlanning; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution300 Tester. 
* 
* @author cartoon 
* @since  01/20/2021
* @version 1.0 
*/ 
public class Solution300Test {
    
    private static Logger log = LoggerFactory.getLogger(Solution300Test.class);
    
    private Solution300 solution;

    private int[] source1;

    private int[] source2;

    private int[] source3;

    private int expect1;

    private int expect2;

    private int expect3;

    @Before
    public void before(){ 
        solution = new Solution300();
        source1 = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        source2 = new int[]{0, 1, 0, 3, 2, 3};
        source3 = new int[]{7, 7, 7, 7, 7, 7, 7};
        expect1 = 4;
        expect2 = 4;
        expect3 = 1;
    } 
    
    /** 
    * 
    * Method: lengthOfLISByBinarySearch(int[] nums) 
    * 
    */ 
    @Test
    public void testLengthOfLISByBinarySearch(){ 
        int res1 = solution.lengthOfLISByBinarySearch(source1);
        int res2 = solution.lengthOfLISByBinarySearch(source2);
        int res3 = solution.lengthOfLISByBinarySearch(source3);
        log.info("solution 300 test, test length of lts by binary search, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    }

    /**
    * 
    * Method: lengthOfLIS(int[] nums) 
    * 
    */ 
    @Test
    public void testLengthOfLIS(){
        int res1 = solution.lengthOfLIS(source1);
        int res2 = solution.lengthOfLIS(source2);
        int res3 = solution.lengthOfLIS(source3);
        log.info("solution 300 test, test length of lts, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 

}
