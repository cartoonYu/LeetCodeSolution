package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution463 Tester. 
* @author cartoon.yu
* @date 10/29/2020
* @version 1.0 
*/ 
public class Solution463Test {

    private static final Logger log = LoggerFactory.getLogger(Solution463Test.class);

    private Solution463 solution;

    private int[][] source1;

    private int[][] source2;

    private int[][] source3;

    private int expect1;

    private int expect2;

    private int expect3;

    @Before
    public void before(){
        solution = new Solution463();
        source1 = new int[][]{{0, 1, 0, 0},{1, 1, 1, 0},{0, 1, 0, 0},{1, 1, 0, 0}};
        source2 = new int[][]{{1}};
        source3 = new int[][]{{1, 0}};
        expect1 = 16;
        expect2 = 4;
        expect3 = 4;
    }

    /**
     * 
     * Method: islandPerimeter(int[][] grid) 
     * 
     */ 
    @Test
    public void testIslandPerimeter(){ 
        int res1 = solution.islandPerimeter(source1);
        int res2 = solution.islandPerimeter(source2);
        int res3 = solution.islandPerimeter(source3);
        log.info("solution 463 test, calculate data1: {}, expect result1: {}, " +
                "calculate data2: {}, expect result2: {}, " +
                "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 
    
        
}
