package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution628 Tester. 
* @author cartoon
* @date 11/10/2020
* @version 1.0 
*/ 
public class Solution628Test {

    private static final Logger log = LoggerFactory.getLogger(Solution628Test.class);

    private Solution628 solution;

    private int[] source1;

    private int[] source2;

    private int expect1;

    private int expect2;

    @Before
    public void before(){ 
        solution = new Solution628();
        source1 = new int[]{1, 2, 3};
        source2 = new int[]{1, 2, 3, 4};
        expect1 = 6;
        expect2 = 24;
    }

    /**
     * 
     * Method: maximumProduct(int[] nums) 
     * 
     */ 
    @Test
    public void testMaximumProduct(){ 
        int res1 = solution.maximumProduct(source1);
        int res2 = solution.maximumProduct(source2);
        log.info("solution 628 test, maximum product calculate data1: {}, expect result1: {}, " +
                "calculate data2: {}, expect result2: {}", res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
    /**
     * 
     * Method: maximumProductBySort(int[] nums) 
     * 
     */ 
    @Test
    public void testMaximumProductBySort(){
        int res1 = solution.maximumProductBySort(source1);
        int res2 = solution.maximumProductBySort(source2);
        log.info("solution 628 test, maximum product by sort calculate data1: {}, expect result1: {}, " +
                "calculate data2: {}, expect result2: {}", res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 

}
