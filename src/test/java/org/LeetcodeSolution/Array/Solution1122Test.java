package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution1122 Tester. 
* @author cartoon.yu
* @date 02/12/2021
* @version 1.0 
*/ 
public class Solution1122Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution1122Test.class);

    private Solution1122 solution;

    private int[] source1Param1;

    private int[] source1Param2;

    private int[] expect;

    @Before
    public void before(){ 
        solution = new Solution1122();
        source1Param1 = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        source1Param2 = new int[]{2, 1, 4, 3, 9, 6};
        expect = new int[]{2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
    }

        /** 
     * 
     * Method: relativeSortArray(int[] arr1, int[] arr2) 
     * 
     */ 
    @Test
    public void testRelativeSortArray(){ 
        int[] res = solution.relativeSortArray(source1Param1, source1Param2);
        log.info("solution 1122 test, calculate data: {}, expect result: {}", res, expect);
        Assert.assertArrayEquals(expect, res);
    } 
    
        
}
