package org.LeetcodeSolution.BackTracking; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/** 
* Solution39 Tester. 
* @author cartoon
* @date 12/07/2020
* @version 1.0 
*/ 
public class Solution39Test {

    private static final Logger log = LoggerFactory.getLogger(Solution39Test.class);

    private Solution39 solution;

    private int[] source1Param1;

    private int source1Param2;

    private int[] source2Param1;

    private int source2Param2;

    private List<List<Integer>> expect1;

    private List<List<Integer>> expect2;

    @Before
    public void before(){ 
        solution = new Solution39();
        source1Param1 = new int[]{2, 3, 6, 7};
        source1Param2 = 7;
        source2Param1 = new int[]{2, 3, 5};
        source2Param2 = 8;
        expect1 = new LinkedList<>();
        expect1.add(Arrays.asList(2, 2, 3));
        expect1.add(Arrays.asList(7));
        expect2 = new LinkedList<>();
        expect2.add(Arrays.asList(2, 2, 2, 2));
        expect2.add(Arrays.asList(2, 3, 3));
        expect2.add(Arrays.asList(3, 5));
    }

        /** 
     * 
     * Method: combinationSum(int[] candidates, int target) 
     * 
     */ 
    @Test
    public void testCombinationSum(){ 
        List<List<Integer>> res1 = solution.combinationSum(source1Param1, source1Param2);
        List<List<Integer>> res2 = solution.combinationSum(source2Param1, source2Param2);
        log.info("solution 39 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data1: {}, expect result1: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    }

} 
