package org.LeetcodeSolution.Array; 

import org.junit.Test; 
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution643 Tester. 
* @author cartoon
* @date 11/10/2020
* @version 1.0 
*/ 
public class Solution643Test {

    private static final Logger log = LoggerFactory.getLogger(Solution643Test.class);

    private Solution643 solution;

    private int[] sourceParam1;

    private int sourceParam2;

    private double expect;

    @Before
    public void before(){ 
        solution = new Solution643();
        sourceParam1 = new int[]{1, 12, -5, -6, 50, 3};
        sourceParam2 = 4;
        expect = 12.75;
    }

    /**
     * 
     * Method: findMaxAverage(int[] nums, int k) 
     * 
     */ 
    @Test
    public void testFindMaxAverage(){ 
        double res = solution.findMaxAverage(sourceParam1, sourceParam2);
        log.info("solution 643 test, calculate data: {}, expect result: {}", res, expect);
    } 
    
}
