package org.LeetcodeSolution.Greedy; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution1710 Tester. 
* @author cartoon
* @date 02/26/2021
* @version 1.0 
*/ 
public class Solution1710Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution1710Test.class);

    private Solution1710 solution;

    private int[][] source1Param1;

    private int source1Param2;

    private int[][] source2Param1;

    private int source2Param2;

    private int expect1;

    private int expect2;

    @Before
    public void before(){ 
        solution = new Solution1710();
        source1Param1 = new int[][]{{1, 3}, {2, 2}, {3, 1}};
        source1Param2 = 4;
        source2Param1 = new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        source2Param2 = 10;
        expect1 = 8;
        expect2 = 91;
    }

    /**
     * 
     * Method: maximumUnits(int[][] boxTypes, int truckSize) 
     * 
     */ 
    @Test
    public void testMaximumUnits(){ 
        int res1 = solution.maximumUnits(source1Param1, source1Param2);
        int res2 = solution.maximumUnits(source2Param1, source2Param2);
        log.info("solution 1710 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 

}
