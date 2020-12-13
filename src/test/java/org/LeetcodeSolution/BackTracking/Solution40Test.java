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
* Solution40 Tester. 
* @author cartoon.yu
* @date 12/11/2020
* @version 1.0 
*/ 
public class Solution40Test {

    private static final Logger log = LoggerFactory.getLogger(Solution40Test.class);

    private Solution40 solution;

    private int[] source1Param1;

    private int source1Param2;

    private int[] source2Param1;

    private int source2Param2;

    private List<List<Integer>> expect1;

    private List<List<Integer>> expect2;

    @Before
    public void before(){ 
        solution = new Solution40();
        source1Param1 = new int[]{10, 1, 2, 7, 6, 1, 5};
        source1Param2 = 8;
        source2Param1 = new int[]{2, 5, 2, 1, 2};
        source2Param2 = 5;
        expect1 = new LinkedList<>();
        expect1.add(Arrays.asList(1, 1, 6));
        expect1.add(Arrays.asList(1, 2, 5));
        expect1.add(Arrays.asList(1, 7));
        expect1.add(Arrays.asList(2, 6));
        expect2 = new LinkedList<>();
        expect2.add(Arrays.asList(1, 2, 2));
        expect2.add(Arrays.asList(5));
    }

        /** 
     * 
     * Method: combinationSum2(int[] candidates, int target) 
     * 
     */ 
    @Test
    public void testCombinationSum2(){
        List<List<Integer>> res1 = solution.combinationSum2(source1Param1, source1Param2);
        List<List<Integer>> res2 = solution.combinationSum2(source2Param1, source2Param2);
        log.info("solution 40 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data1: {}, expect result1: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    }

} 
