package org.LeetcodeSolution.DynamicPlanning; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution63 Tester. 
* 
* @author cartoon 
* @since  01/06/2021
* @version 1.0 
*/ 
public class Solution63Test {
    
    private static Logger log = LoggerFactory.getLogger(Solution63Test.class);
    
    private Solution63 solution;

    private int[][] source1;

    private int[][] source2;

    private int expect1;

    private int expect2;

    @Before
    public void before(){ 
        solution = new Solution63();
        source1 = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        source2 = new int[][]{{0, 1}, {0, 0}};
        expect1 = 2;
        expect2 = 1;
    } 
    
    /** 
    * 
    * Method: uniquePathsWithObstacles(int[][] obstacleGrid) 
    * 
    */ 
    @Test
    public void testUniquePathsWithObstacles(){ 
        int res1 = solution.uniquePathsWithObstacles(source1);
        int res2 = solution.uniquePathsWithObstacles(source2);
        log.info("solution 63 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 

}
