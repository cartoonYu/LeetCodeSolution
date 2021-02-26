package org.LeetcodeSolution.Greedy; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution860 Tester. 
* @author cartoon
* @date 02/26/2021
* @version 1.0 
*/ 
public class Solution860Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution860Test.class);

    private Solution860 solution;

    private int[] source1;

    private int[] source2;

    private int[] source3;

    private int[] source4;

    private boolean expect1;

    private boolean expect2;

    private boolean expect3;

    private boolean expect4;


    @Before
    public void before(){ 
        solution = new Solution860();
        source1 = new int[]{5, 5, 10};
        source2 = new int[]{10, 10};
        source3 = new int[]{5, 5, 10, 10, 20};
        source4 = new int[]{5, 5, 5, 10, 20};
        expect1 = true;
        expect2 = false;
        expect3 = false;
        expect4 = true;
    }

    /**
     * 
     * Method: lemonadeChange(int[] bills) 
     * 
     */ 
    @Test
    public void testLemonadeChange(){ 
        boolean res1 = solution.lemonadeChange(source1);
        boolean res2 = solution.lemonadeChange(source2);
        boolean res3 = solution.lemonadeChange(source3);
        boolean res4 = solution.lemonadeChange(source4);
        log.info("solution 860 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}, " +
                        "calculate data4: {}, expect result4: {}",
                res1, expect1, res2, expect2, res3, expect3, res4, expect4);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
        Assert.assertEquals(expect4, res4);
    } 
    
        
}
