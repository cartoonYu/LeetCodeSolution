package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

/**
 * Solution1046 Tester.
 * @author cartoon
 * @date 11/15/2020
 * @version 1.0
 */
public class Solution1046Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1046Test.class);

    private Solution1046 solution;

    private int[] source;

    private int expect;

    @Before
    public void before(){
        solution = new Solution1046();
        source = new int[]{2, 7, 4, 1, 8, 1};
        expect = 1;
    }

    @Test
    public void testLastStoneWeight() {
        int res = solution.lastStoneWeight(source);
        log.info("solution 1046 test, calculate data: {}, expect result: {}", res, expect);
        Assert.assertEquals(expect, res);
    }
}