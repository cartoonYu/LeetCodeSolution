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
* Solution216 Tester. 
* @author cartoon
* @date 12/15/2020
* @version 1.0 
*/ 
public class Solution216Test {

    private static final Logger log = LoggerFactory.getLogger(Solution216Test.class);

    private Solution216 solution;

    private int source1Param1;

    private int source1Param2;

    private int source2Param1;

    private int source2Param2;

    private List<List<Integer>> expect1;

    private List<List<Integer>> expect2;

    @Before
    public void before(){ 
        solution = new Solution216();
        source1Param1 = 3;
        source1Param2 = 7;
        source2Param1 = 3;
        source2Param2 = 9;
        expect1 = new LinkedList<>();
        expect1.add(Arrays.asList(1, 2, 4));
        expect2 = new LinkedList<>();
        expect2.add(Arrays.asList(1, 2, 6));
        expect2.add(Arrays.asList(1, 3, 5));
        expect2.add(Arrays.asList(2, 3, 4));
    }

    /**
     * 
     * Method: combinationSum3(int k, int n) 
     * 
     */ 
    @Test
    public void testCombinationSum3(){ 
        List<List<Integer>> res1 = solution.combinationSum3(source1Param1, source1Param2);
        List<List<Integer>> res2 = solution.combinationSum3(source2Param1, source2Param2);
        log.info("solution 216 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    }
} 
