package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class Solution442Test {

    private static final Logger log = LoggerFactory.getLogger(Solution442Test.class);

    private Solution442 solution;

    private int[] source;

    private List<Integer> expect;

    @Before
    public void before(){
        solution = new Solution442();
        source = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        expect = Arrays.asList(2, 3);
    }

    @Test
    public void findDuplicates() {
        List<Integer> res = solution.findDuplicates(source);
        log.info("solution 442 test, calculate data: {}, expect result: {}", res, expect);
        Assert.assertEquals(expect, res);
    }
}