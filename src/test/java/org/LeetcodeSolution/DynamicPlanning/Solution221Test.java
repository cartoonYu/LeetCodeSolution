package org.LeetcodeSolution.DynamicPlanning; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution221 Tester. 
* 
* @author cartoon 
* @since  01/15/2021
* @version 1.0 
*/ 
public class Solution221Test {
    
    private static Logger log = LoggerFactory.getLogger(Solution221Test.class);
    
    private Solution221 solution;

    private char[][] source1;

    private char[][] source2;

    private char[][] source3;

    private int expect1;

    private int expect2;

    private int expect3;

    @Before
    public void before(){ 
        solution = new Solution221();
        source1 = new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        source2 = new char[][]{{'0', '1'}, {'1', '0'}};
        source3 = new char[][]{{'0'}};
        expect1 = 4;
        expect2 = 1;
        expect3 = 0;
    } 
    
    /** 
    * 
    * Method: maximalSquare(char[][] matrix) 
    * 
    */ 
    @Test
    public void testMaximalSquare(){
        int res1 = solution.maximalSquare(source1);
        int res2 = solution.maximalSquare(source2);
        int res3 = solution.maximalSquare(source3);
        log.info("solution 221 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 

}
