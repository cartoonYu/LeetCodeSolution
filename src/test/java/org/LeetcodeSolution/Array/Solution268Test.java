package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution268 Tester. 
* @author cartoon
* @date 10/14/2020
* @version 1.0 
*/ 
public class Solution268Test {

    private static final Logger log = LoggerFactory.getLogger(Solution268Test.class);

    private Solution268 solution;

    private int[] source1;

    private int[] source2;

    private int[] source3;

    private int[] source4;

    private int expect1;

    private int expect2;

    private int expect3;

    private int expect4;

    @Before
    public void before(){ 
        solution = new Solution268();
        source1 = new int[]{3, 0, 1};
        expect1 = 2;
        source2 = new int[]{0, 1};
        expect2 = 2;
        source3 = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        expect3 = 8;
        source4 = new int[]{0};
        expect4 = 1;
    }

    /**
     * 
     * Method: missingNumber(int[] nums) 
     * 
     */ 
    @Test
    public void testMissingNumber(){ 
        int res1 = solution.missingNumber(source1);
        int res2 = solution.missingNumber(source2);
        int res3 = solution.missingNumber(source3);
        int res4 = solution.missingNumber(source4);
        log.info("solution 268 test, calculate data 1: {}, expect result 1: {}, " +
                        "calculate data 2: {}, expect result 2: {}, " +
                        "calculate data 3: {}, expect result 3: {}, " +
                        "calculate data 4: {}, expect result 4: {}",
                res1, expect1, res2, expect2, res3, expect3, res4, expect4);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
        Assert.assertEquals(expect4, res4);
    } 
    
        
    } 
