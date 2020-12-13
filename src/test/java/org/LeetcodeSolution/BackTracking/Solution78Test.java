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
* Solution78 Tester. 
* @author cartoon.yu
* @date 12/11/2020
* @version 1.0 
*/ 
public class Solution78Test {

    private static final Logger log = LoggerFactory.getLogger(Solution78Test.class);

    private Solution78 solution;

    private int[] source;

    private List<List<Integer>> expect;

    @Before
    public void before(){
        solution = new Solution78();
        source = new int[]{1, 2, 3};
        expect = new LinkedList<>();
        expect.add(new LinkedList<>());
        expect.add(Arrays.asList(1));
        expect.add(Arrays.asList(1, 2));
        expect.add(Arrays.asList(1, 2, 3));
        expect.add(Arrays.asList(1, 3));
        expect.add(Arrays.asList(2));
        expect.add(Arrays.asList(2, 3));
        expect.add(Arrays.asList(3));
    }

        /** 
     * 
     * Method: subsets(int[] nums) 
     * 
     */ 
    @Test
    public void testSubsets(){ 
        List<List<Integer>> res = solution.subsets(source);
        log.info("solution 78 test, calculate data: {}, expect result: {}",
                res, expect);
        Assert.assertEquals(expect, res);
    } 

} 
