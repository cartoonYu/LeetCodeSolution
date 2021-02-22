package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution1550 Tester. 
* @author cartoon
* @date 02/23/2021
* @version 1.0 
*/ 
public class Solution1550Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution1550Test.class);

    private Solution1550 solution;

    private int[] source1;

    private int[] source2;

    private boolean expect1;

    private boolean expect2;

    @Before
    public void before(){ 
        solution = new Solution1550();
        source1 = new int[]{2, 6, 4, 1};
        source2 = new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12};
        expect1 = false;
        expect2 = true;
    }

    /**
     * 
     * Method: threeConsecutiveOdds(int[] arr) 
     * 
     */ 
    @Test
    public void testThreeConsecutiveOdds(){
        boolean res1 = solution.threeConsecutiveOdds(source1);
        boolean res2 = solution.threeConsecutiveOdds(source2);
        log.info("solution 1550 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 

}
