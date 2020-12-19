package org.LeetcodeSolution.BinarySearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Solution162Test{

    private static final Logger log = LoggerFactory.getLogger(Solution162Test.class);

    private Solution162 solution;

    private int[] source1;

    private int[] source2;

    private int expect1;

    private int expect2;

    @Before
    public void before(){
        solution = new Solution162();
        source1 = new int[]{1, 2, 3, 1};
        source2 = new int[]{1, 2, 1, 3, 5, 6, 4};
        expect1 = 2;
        expect2 = 5;
    }

    @Test
    public void testFindPeakElement() {
        int res1 = solution.findPeakElement(source1);
        int res2 = solution.findPeakElement(source2);
        log.info("solution 162 test, find peak element, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    }

    @Test
    public void testFindPeakElementByTraditionalSearch() {
        int res1 = solution.findPeakElementByTraditionalSearch(source1);
        int res2 = solution.findPeakElementByTraditionalSearch(source2);
        log.info("solution 162 test, find peak element by traditional search, " +
                        "calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    }
}