package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution561 Tester. 
* @author cartoon
* @date 11/03/2020
* @version 1.0 
*/ 
public class Solution561Test {

    private static final Logger log = LoggerFactory.getLogger(Solution561Test.class);

    private Solution561 solution;

    private int[] source1;

    private int[] source2;

    private int expect1;

    private int expect2;

    @Before
    public void before(){ 
        solution = new Solution561();
        source1 = new int[]{1, 4, 3, 2};
        source2 = new int[]{6, 2, 6, 5, 1, 2};
        expect1 = 4;
        expect2 = 9;
    }

        /** 
     * 
     * Method: arrayPairSum(int[] nums) 
     * 
     */ 
    @Test
    public void testArrayPairSum(){ 
        int res1 = solution.arrayPairSum(source1);
        int res2 = solution.arrayPairSum(source2);
        log.info("solution 561 test, calculate data1: {}, expect result1: {}, " +
                "calculate data2: {}, expect result2: {}", res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
        
}
