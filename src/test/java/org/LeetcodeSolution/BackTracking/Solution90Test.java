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
* Solution90 Tester. 
* @author cartoon
* @date 12/15/2020
* @version 1.0 
*/ 
public class Solution90Test {

    private static final Logger log = LoggerFactory.getLogger(Solution90Test.class);

    private Solution90 solution;

    private int[] source;

    private List<List<Integer>> expect;

    @Before
    public void before(){
        solution = new Solution90();
        source = new int[]{1, 2, 2};
        expect = new LinkedList<>();
        expect.add(new LinkedList<>());
        expect.add(Arrays.asList(1));
        expect.add(Arrays.asList(1, 2));
        expect.add(Arrays.asList(1, 2, 2));
        expect.add(Arrays.asList(2));
        expect.add(Arrays.asList(2, 2));
    }

        /** 
     * 
     * Method: subsetsWithDup(int[] nums) 
     * 
     */ 
    @Test
    public void testSubsetsWithDup(){ 
        List<List<Integer>> res = solution.subsetsWithDup(source);
        log.info("solution 90 test, calculate data: {}, expect result: {}",
                res, expect);
        Assert.assertEquals(expect, res);
    }

} 
