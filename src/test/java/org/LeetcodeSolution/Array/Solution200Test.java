package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Solution200Test {

    private static final Logger log = LoggerFactory.getLogger(Solution200Test.class);

    private Solution200 solution;

    private char[][] source1;

    private char[][] source2;

    private int expect1;

    private int expect2;

    @Before
    public void before(){
        solution = new Solution200();
        source1 = new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        source2 = new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};
        expect1 = 1;
        expect2 = 3;
    }

    @Test
    public void numIslands() {
        int res1 = solution.numIslands(source1);
        int res2 = solution.numIslands(source2);
        log.info("solution 200 test, calculate data 1: {}, expect result 1: {}, calculate data 2: {}, expect result 2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    }
}