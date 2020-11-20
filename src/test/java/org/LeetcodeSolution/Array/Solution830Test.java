package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Solution830 Tester.
 * @author cartoon
 * @date 11/15/2020
 * @version 1.0
 */
public class Solution830Test {

    private static final Logger log = LoggerFactory.getLogger(Solution830Test.class);

    private Solution830 solution;

    private String source1;

    private String source2;

    private String source3;

    private List<List<Integer>> expect1;

    private List<List<Integer>> expect2;

    private List<List<Integer>> expect3;

    @Before
    public void before(){
        solution = new Solution830();
        source1 = "abbxxxxzzy";
        source2 = "abc";
        source3 = "abcdddeeeeaabbbcd";
        expect1 = new ArrayList<>();
        expect2 = new ArrayList<>();
        expect3 = new ArrayList<>();
        expect1.add(Arrays.asList(3, 6));
        expect3.add(Arrays.asList(3, 5));
        expect3.add(Arrays.asList(6, 9));
        expect3.add(Arrays.asList(12, 14));
    }

    @Test
    public void testLargeGroupPositions() {
        List<List<Integer>> res1 = solution.largeGroupPositions(source1);
        List<List<Integer>> res2 = solution.largeGroupPositions(source2);
        List<List<Integer>> res3 = solution.largeGroupPositions(source3);
        log.info("solution 830 test, test large group position, calculate data1: {}, expect result1: {}, " +
                "calculate data2: {}, expect result2: {}, " +
                "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    }

    @Test
    public void testLargeGroupPositions2() {
        List<List<Integer>> res1 = solution.largeGroupPositions2(source1);
        List<List<Integer>> res2 = solution.largeGroupPositions2(source2);
        List<List<Integer>> res3 = solution.largeGroupPositions2(source3);
        log.info("solution 830 test, test large group position 2, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    }
}