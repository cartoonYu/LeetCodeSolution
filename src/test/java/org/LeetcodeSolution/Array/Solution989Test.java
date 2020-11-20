package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Solution989 Tester.
 * @author cartoon
 * @date 11/15/2020
 * @version 1.0
 */
public class Solution989Test {

    private static final Logger log = LoggerFactory.getLogger(Solution989Test.class);

    private Solution989 solution;

    private int[] source1Param1;

    private int[] source2Param1;

    private int[] source3Param1;

    private int[] source4Param1;

    private int source1Param2;

    private int source2Param2;

    private int source3Param2;

    private int source4Param2;

    private List<Integer> expect1;

    private List<Integer> expect2;

    private List<Integer> expect3;

    private List<Integer> expect4;

    @Before
    public void before(){
        solution = new Solution989();
        source1Param1 = new int[]{1, 2, 0, 0};
        source2Param1 = new int[]{2, 7, 4};
        source3Param1 = new int[]{2, 1, 5};
        source4Param1 = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        source1Param2 = 34;
        source2Param2 = 181;
        source3Param2 = 806;
        source4Param2 = 1;
        expect1 = Arrays.asList(1, 2, 3, 4);
        expect2 = Arrays.asList(4, 5, 5);
        expect3 = Arrays.asList(1, 0, 2, 1);
        expect4 = Arrays.asList(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    @Test
    public void testAddToArrayForm() {
        List<Integer> res1 = solution.addToArrayForm(source1Param1, source1Param2);
        List<Integer> res2 = solution.addToArrayForm(source2Param1, source2Param2);
        List<Integer> res3 = solution.addToArrayForm(source3Param1, source3Param2);
        List<Integer> res4 = solution.addToArrayForm(source4Param1, source4Param2);
        log.info("solution 989 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}, " +
                        "calculate data4: {}, expect result4: {}",
                res1, expect1, res2, expect2, res3, expect3, res4, expect4);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
        Assert.assertEquals(expect4, res4);
    }
}