package org.LeetcodeSolution.DynamicPlanning; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution1025 Tester. 
* @author cartoon
* @date 02/16/2021
* @version 1.0 
*/ 
public class Solution1025Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution1025Test.class);

    private Solution1025 solution;

    private int source1;

    private int source2;

    private boolean expect1;

    private boolean expect2;

    @Before
    public void before(){ 
        solution = new Solution1025();
        source1 = 2;
        source2 = 3;
        expect1 = true;
        expect2 = false;
    }

        /** 
     * 
     * Method: divisorGame2(int N) 
     * 
     */ 
    @Test
    public void testDivisorGame2(){ 
        boolean res1 = solution.divisorGame2(source1);
        boolean res2 = solution.divisorGame2(source2);
        log.info("solution 838 test, test divisor game 2, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
        /** 
     * 
     * Method: divisorGame1(int N) 
     * 
     */ 
    @Test
    public void testDivisorGame1(){
        boolean res1 = solution.divisorGame2(source1);
        boolean res2 = solution.divisorGame2(source2);
        log.info("solution 838 test, test divisor game, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
        
}
