package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution1491 Tester. 
* @author cartoon
* @date 12/01/2020
* @version 1.0 
*/ 
public class Solution1491Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1480Test.class);

    private Solution1491 solution;

    private int[] source1;

    private int[] source2;

    private int[] source3;

    private int[] source4;

    private double expect1;

    private double expect2;

    private double expect3;

    private double expect4;


    @Before
    public void before(){ 
        solution = new Solution1491();
        source1 = new int[]{4000, 3000, 1000, 2000};
        source2 = new int[]{1000, 2000, 3000};
        source3 = new int[]{6000, 5000, 4000, 3000, 2000, 1000};
        source4 = new int[]{8000, 9000, 2000, 3000, 6000, 1000};
        expect1 = 2500.00000;
        expect2 = 2000.00000;
        expect3 = 3500.00000;
        expect4 = 4750.00000;
    }

    /**
     * 
     * Method: average(int[] salary) 
     * 
     */ 
    @Test
    public void testAverage(){ 
        double res1 = solution.average(source1);
        double res2 = solution.average(source2);
        double res3 = solution.average(source3);
        double res4 = solution.average(source4);
        log.info("solution 1480 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}, " +
                        "calculate data4: {}, expect result4: {}",
                res1, expect1, res2, expect2, res3, expect3, res4, expect4);
        Assert.assertEquals(expect1, res1, 0);
        Assert.assertEquals(expect2, res2, 0);
        Assert.assertEquals(expect3, res3, 0);
        Assert.assertEquals(expect4, res4, 0);
    } 
    
        
}
