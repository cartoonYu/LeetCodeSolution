package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution414 Tester. 
* @author cartoon.yu
* @date 10/22/2020
* @version 1.0 
*/ 
public class Solution414Test {

    private static final Logger log = LoggerFactory.getLogger(Solution414Test.class);

    private Solution414 solution;

    private int[] source1;

    private int[] source2;

    private int[] source3;

    private int expect1;

    private int expect2;

    private int expect3;

    @Before
    public void before(){ 
        solution = new Solution414();
        source1 = new int[]{3, 2, 1};
        source2 = new int[]{1, 2};
        source3 = new int[]{2, 2, 3, 1};
        expect1 = 1;
        expect2 = 2;
        expect3 = 1;
    }

    /**
     * 
     * Method: thirdMax(int[] nums) 
     * 
     */ 
    @Test
    public void testThirdMax(){ 
        int res1 = solution.thirdMax(source1);
        int res2 = solution.thirdMax(source2);
        int res3 = solution.thirdMax(source3);
        log.info("solution 414 test, calculate data 1: {}, expect result 1: {}, " +
                        "calculate data 2: {}, expect result 2: {}, " +
                        "calculate data 3: {}, expect result 3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 
    
}
