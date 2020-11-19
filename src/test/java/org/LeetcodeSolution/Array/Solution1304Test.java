package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution1304 Tester. 
* @author cartoon.yu
* @date 11/19/2020
* @version 1.0 
*/ 
public class Solution1304Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1304Test.class);

    private Solution1304 solution;

    private int source1;

    private int source2;

    private int source3;

    private int[] expect1;

    private int[] expect2;

    private int[] expect3;

    @Before
    public void before(){ 
        solution = new Solution1304();
        source1 = 5;
        source2 = 3;
        source3 = 1;
        expect1 = new int[]{2, 1, 0, -1, -2};
        expect2 = new int[]{1, 0, -1};
        expect3 = new int[]{0};
    }

    /**
     * 
     * Method: sumZero(int n) 
     * 
     */ 
    @Test
    public void testSumZero(){ 
        int[] res1 = solution.sumZero(source1);
        int[] res2 = solution.sumZero(source2);
        int[] res3 = solution.sumZero(source3);
        log.info("solution 1304 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertArrayEquals(expect1, res1);
        Assert.assertArrayEquals(expect2, res2);
        Assert.assertArrayEquals(expect3, res3);
    } 
    
        
}
