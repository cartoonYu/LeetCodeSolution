package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Solution922 Tester.
 * @author cartoon
 * @date 11/15/2020
 * @version 1.0
 */
public class Solution922Test {

    private static final Logger log = LoggerFactory.getLogger(Solution922Test.class);

    private Solution922 solution;

    private int[] source;

    private int[] expect;

    @Before
    public void before(){
        solution = new Solution922();
        source = new int[]{4, 2, 5, 7};
        expect = new int[]{4, 5, 2, 7};
    }

    @Test
    public void testSortArrayByParityIIWithTwoPointer() {
        int[] res = solution.sortArrayByParityIIWithTwoPointer(source);
        log.info("solution 922 test, test sort array with two pointer, calculate data: {}, expect result1: {}", res, expect);
        Assert.assertArrayEquals(expect, res);
    }

    @Test
    public void testSortArrayByParityIIWithAuxiliaryArray() {
        int[] res = solution.sortArrayByParityIIWithAuxiliaryArray(source);
        log.info("solution 922 test, test sort array with auxiliary array, calculate data: {}, expect result1: {}", res, expect);
        Assert.assertArrayEquals(expect, res);
    }
}