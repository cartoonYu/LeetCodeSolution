package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

/**
 * Solution665 Tester.
 * @author cartoon
 * @date 11/10/2020
 * @version 1.0
 */
public class Solution665Test {

    private static final Logger log = LoggerFactory.getLogger(Solution665Test.class);

    private Solution665 solution;

    private int[] source1;

    private int[] source2;

    private boolean expect1;

    private boolean expect2;

    @Before
    public void before(){
        solution = new Solution665();
        source1 = new int[]{4, 2, 3};
        source2 = new int[]{4, 2, 1};
        expect1 = true;
        expect2 = false;
    }

    @Test
    public void testCheckPossibility() {
        boolean res1 = solution.checkPossibility(source1);
        boolean res2 = solution.checkPossibility(source2);
        log.info("solution 665 test, calculate data1: {}, expect result1: {}, " +
                "calculate data2: {}, expect result2: {}", res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    }
}