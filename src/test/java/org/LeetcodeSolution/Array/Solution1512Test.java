package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution1512 Tester. 
* @author cartoon
* @date 12/03/2020
* @version 1.0 
*/ 
public class Solution1512Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1512Test.class);

    private Solution1512 solution;

    private int[] source1;

    private int[] source2;

    private int[] source3;

    private int expect1;

    private int expect2;

    private int expect3;

    @Before
    public void before(){ 
        solution = new Solution1512();
        source1 = new int[]{1, 2, 3, 1, 1, 3};
        source2 = new int[]{1, 1, 1, 1};
        source3 = new int[]{1, 2, 3};
        expect1 = 4;
        expect2 = 6;
        expect3 = 0;
    }

    /**
     * 
     * Method: numIdenticalPairs(int[] nums) 
     * 
     */ 
    @Test
    public void testNumIdenticalPairs(){ 
        int res1 = solution.numIdenticalPairs(source1);
        int res2 = solution.numIdenticalPairs(source2);
        int res3 = solution.numIdenticalPairs(source3);
        log.info("solution 1512 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 
    
        
}
