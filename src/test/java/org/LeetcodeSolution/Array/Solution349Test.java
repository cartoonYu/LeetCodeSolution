package org.LeetcodeSolution.Array; 

import org.junit.Test; 
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution349 Tester. 
* @author cartoon
* @date 10/19/2020
* @version 1.0 
*/ 
public class Solution349Test {

    private static final Logger log = LoggerFactory.getLogger(Solution349Test.class);

    private Solution349 solution;

    private int[] source1Param1;

    private int[] source1Param2;

    private int[] source2Param1;

    private int[] source2Param2;

    private int[] expect1;

    private int[] expect2;

    @Before
    public void before(){ 
        solution = new Solution349();
        source1Param1 = new int[]{1, 2, 2, 1};
        source1Param2 = new int[]{2, 2};
        source2Param1 = new int[]{4, 9, 5};
        source2Param2 = new int[]{9, 4, 9, 8, 4};
        expect1 = new int[]{2};
        expect2 = new int[]{9, 4};
    }

    /**
     * 
     * Method: intersection(int[] nums1, int[] nums2) 
     * 
     */ 
    @Test
    public void testIntersection(){ 
        int[] res1 = solution.intersection(source1Param1, source1Param2);
        int[] res2 = solution.intersection(source2Param1, source2Param2);
        log.info("solution 349 test, calculate data 1: {}, expect result 1: {}, calculate data 2: {}, expect result 2: {}",
                res1, expect1, res2, expect2);
    } 
    
        
}
