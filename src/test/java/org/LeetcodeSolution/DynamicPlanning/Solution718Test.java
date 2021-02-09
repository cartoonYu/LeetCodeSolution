package org.LeetcodeSolution.DynamicPlanning; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution718 Tester. 
* @author cartoon
* @date 02/09/2021
* @version 1.0 
*/ 
public class Solution718Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution718Test.class);

    private Solution718 solution;

    private int[] source1Param1;

    private int[] source1Param2;

    private int expect;

    @Before
    public void before(){ 
        solution = new Solution718();
        source1Param1 = new int[]{1, 2, 3, 2, 1};
        source1Param2 = new int[]{3, 2, 1, 4, 7};
        expect = 3;
    }

        /** 
     * 
     * Method: findLength(int[] A, int[] B) 
     * 
     */ 
    @Test
    public void testFindLength(){ 
        int res = solution.findLength(source1Param1, source1Param2);
        log.info("solution 718 test, calculate data: {}, expect result: {}",
                res, expect);
        Assert.assertEquals(expect, res);
    }
        
}
