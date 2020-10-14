package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* Solution209 Tester.
* @author cartoon
* @date 10/14/2020
* @version 1.0 
*/ 
public class Solution209Test {

    private static final Logger log = LoggerFactory.getLogger(Solution209Test.class);

    private Solution209 solution;

    private int sourceParam1;

    private int[] sourceParam2;

    private int expect;

    @Before
    public void before(){ 
        solution = new Solution209();
        sourceParam1 = 7;
        sourceParam2 = new int[]{2, 3, 1, 2, 4, 3};
        expect = 2;
    }

    /**
     * 
     * Method: minSubArrayLen(int s, int[] nums) 
     * 
     */ 
    @Test
    public void testMinSubArrayLen(){ 
        int res = solution.minSubArrayLen(sourceParam1, sourceParam2);
        log.info("solution 209 test, calculate data: {}, expect result: {}",
                res, expect);
        Assert.assertEquals(expect, res);
    } 

}
