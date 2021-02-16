package org.LeetcodeSolution.Greedy; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution55 Tester. 
* @author cartoon
* @date 02/16/2021
* @version 1.0 
*/ 
public class Solution55Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution55Test.class);

    private Solution55 solution;

    private int[] source1;

    private int[] source2;

    private boolean expect1;

    private boolean expect2;

    @Before
    public void before(){ 
        solution = new Solution55();
        source1 = new int[]{2, 3, 1, 1, 4};
        source2 = new int[]{3, 2, 1, 0, 4};
        expect1 = true;
        expect2 = false;
    }

        /** 
     * 
     * Method: canJumpByInvertedOrder(int[] nums) 
     * 
     */ 
    @Test
    public void testCanJumpByInvertedOrder(){ 
        boolean res1 = solution.canJumpByInvertedOrder(source1);
        boolean res2 = solution.canJumpByInvertedOrder(source2);
        log.info("solution 55 test, test can jump by inverted order, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
        /** 
     * 
     * Method: canJumpByPositiveSequence(int[] nums) 
     * 
     */ 
    @Test
    public void testCanJumpByPositiveSequence(){
        boolean res1 = solution.canJumpByPositiveSequence(source1);
        boolean res2 = solution.canJumpByPositiveSequence(source2);
        log.info("solution 55 test, test can jump by positive sequence, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
        /** 
     * 
     * Method: canJumpByBackTracking(int[] nums) 
     * 
     */ 
    @Test
    public void testCanJumpByBackTracking(){
        boolean res1 = solution.canJumpByBackTracking(source1);
        boolean res2 = solution.canJumpByBackTracking(source2);
        log.info("solution 55 test, test can jump by back tracking, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 

} 
