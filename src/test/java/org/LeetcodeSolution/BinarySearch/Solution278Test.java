package org.LeetcodeSolution.BinarySearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cartoon
 * @date 2020/12/20
 */
public class Solution278Test{

    private static final Logger log = LoggerFactory.getLogger(Solution278Test.class);

    private Solution278 solution;

    private int source;

    private int expect;

    @Before
    public void before(){
        solution =new Solution278();
        source = 5;
        expect = 4;
    }

    @Test
    public void testFirstBadVersion() {
        int res = solution.firstBadVersion(source);
        log.info("solution 278 test, calculate data: {}, expect result: {}",
                res, expect);
        Assert.assertEquals(expect, res);
    }
}