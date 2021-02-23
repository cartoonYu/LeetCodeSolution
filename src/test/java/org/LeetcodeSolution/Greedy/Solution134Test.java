package org.LeetcodeSolution.Greedy; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution134 Tester. 
* @author cartoon
* @date 02/16/2021
* @version 1.0 
*/ 
public class Solution134Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution134Test.class);

    private Solution134 solution;

    private int[] source1Param1;

    private int[] source1Param2;

    private int[] source2Param1;

    private int[] source2Param2;

    private int expect1;

    private int expect2;

    @Before
    public void before(){ 
        solution = new Solution134();
        source1Param1 = new int[]{1, 2, 3, 4, 5};
        source1Param2 = new int[]{3, 4, 5, 1, 2};
        source2Param1 = new int[]{2, 3, 4};
        source2Param2 = new int[]{3, 4, 3};
        expect1 = 3;
        expect2 = -1;
    }

    /**
     * 
     * Method: canCompleteCircuit(int[] gas, int[] cost) 
     * 
     */ 
    @Test
    public void testCanCompleteCircuit(){
        int res1 = solution.canCompleteCircuit(source1Param1, source1Param2);
        int res2 = solution.canCompleteCircuit(source2Param1, source2Param2);
        log.info("solution 134 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 

}
