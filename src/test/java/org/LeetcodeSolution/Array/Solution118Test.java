package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution118Test {

    private static final Logger log = LoggerFactory.getLogger(Solution118Test.class);

    private Solution118 solution;

    private int source;

    private List<List<Integer>> expect;

    @Before
    public void before(){
        solution = new Solution118();
        source = 5;
        expect = new ArrayList<>();
        expect.add(Arrays.asList(1));
        expect.add(Arrays.asList(1, 1));
        expect.add(Arrays.asList(1, 2, 1));
        expect.add(Arrays.asList(1, 3, 3, 1));
        expect.add(Arrays.asList(1, 4, 6, 4, 1));
    }

    @Test
    public void testGenerate() {
        List<List<Integer>> res = solution.generate(source);
        log.info("solution 118 test, calculate: {}, expect: {}", res, expect);
        Assert.assertEquals(expect, res);
    }
}