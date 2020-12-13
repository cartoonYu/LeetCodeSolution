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
* Solution46 Tester. 
* @author cartoon.yu
* @date 12/11/2020
* @version 1.0 
*/ 
public class Solution46Test {

    private static final Logger log = LoggerFactory.getLogger(Solution46Test.class);

    private Solution46 solution;

    private int[] source;

    private List<List<Integer>> expect;

    @Before
    public void before(){
        solution = new Solution46();
        source = new int[]{1, 2, 3};
        expect = new LinkedList<>();
        expect.add(Arrays.asList(1, 2, 3));
        expect.add(Arrays.asList(1, 3, 2));
        expect.add(Arrays.asList(2, 1, 3));
        expect.add(Arrays.asList(2, 3, 1));
        expect.add(Arrays.asList(3, 2, 1));
        expect.add(Arrays.asList(3, 1, 2));
    }

        /** 
     * 
     * Method: permute(int[] nums) 
     * 
     */ 
    @Test
    public void testPermute(){ 
        List<List<Integer>> res = solution.permute(source);
        log.info("solution 46 test, calculate data: {}, expect result: {}",
                res, expect);
        Assert.assertEquals(expect, res);
    } 

} 
