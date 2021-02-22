package org.LeetcodeSolution.Greedy; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution135 Tester. 
* @author cartoon
* @date 02/22/2021
* @version 1.0 
*/ 
public class Solution135Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution135Test.class);

    private Solution135 solution;

    private int[] source1;

    private int[] source2;

    private int expect1;

    private int expect2;

    @Before
    public void before(){ 
        solution = new Solution135();
        source1 = new int[]{1, 0, 2};
        source2 = new int[]{1, 2, 2};
        expect1 = 5;
        expect2 = 4;
    }

    /**
     * 
     * Method: candy(int[] ratings) 
     * 
     */ 
    @Test
    public void testCandy(){
        int res1 = solution.candy(source1);
        int res2 = solution.candy(source2);
        log.info("solution 135 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
        
}
