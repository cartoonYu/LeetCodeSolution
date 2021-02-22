package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution1502 Tester. 
* @author cartoon
* @date 02/23/2021
* @version 1.0 
*/ 
public class Solution1502Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution1502Test.class);

    private Solution1502 solution;

    private int[] source1;

    private int[] source2;

    private boolean expect1;

    private boolean expect2;

    @Before
    public void before(){ 
        solution = new Solution1502();
        source1 = new int[]{3, 5, 1};
        source2 = new int[]{1, 2, 4};
        expect1 = true;
        expect2 = false;
    }

    /**
     * 
     * Method: canMakeArithmeticProgression(int[] arr) 
     * 
     */ 
    @Test
    public void testCanMakeArithmeticProgression(){
        boolean res1 = solution.canMakeArithmeticProgression(source1);
        boolean res2 = solution.canMakeArithmeticProgression(source2);
        log.info("solution 1502 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 

}
