package org.LeetcodeSolution.Array;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class Solution448Test {

    private static final Logger log = LoggerFactory.getLogger(Solution448Test.class);

    private Solution448 solution;

    private int[] source;

    private List<Integer> expect;

    @Before
    public void before(){
        solution = new Solution448();
        source = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        expect = Arrays.asList(5, 6);
    }

    @Test
    public void findDisappearedNumbers(){
        List<Integer> res = solution.findDisappearedNumbers(source);
        log.info("solution 448 test, calculate data: {}, expect result: {}", res, expect);
        Assert.assertEquals(expect, res);
    }
}