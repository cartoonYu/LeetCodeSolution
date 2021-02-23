package org.LeetcodeSolution.Greedy; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution1725 Tester. 
* @author cartoon
* @date 02/24/2021
* @version 1.0 
*/ 
public class Solution1725Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution1725Test.class);

    private Solution1725 solution;

    private int[][] source1;

    private int[][] source2;

    private int expect1;

    private int expect2;

    @Before
    public void before(){ 
        solution = new Solution1725();
        source1 = new int[][]{{5, 8}, {3, 9}, {5, 12}, {16, 5}};
        source2 = new int[][]{{2, 3}, {3, 7}, {4, 3}, {3, 7}};
        expect1 = 3;
        expect2 = 3;
    }

    /**
     * 
     * Method: countGoodRectangles(int[][] rectangles) 
     * 
     */ 
    @Test
    public void testCountGoodRectangles(){
        int res1 = solution.countGoodRectangles(source1);
        int res2 = solution.countGoodRectangles(source2);
        log.info("solution 1725 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
        
}
