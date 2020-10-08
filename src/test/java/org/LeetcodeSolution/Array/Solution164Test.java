package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Solution164Test {

    private static final Logger log = LoggerFactory.getLogger(Solution164Test.class);

    private Solution164 solution;

    private int[] source1;

    private int[] source2;

    private int expect1;

    private int expect2;

    @Before
    public void before(){
        solution = new Solution164();
        source1 = new int[]{3,6,9,1};
        source2 = new int[]{10};
        expect1 = 3;
        expect2 = 0;
    }

    @Test
    public void maximumGap() {
        int res1 = solution.maximumGap(source1);
        int res2 = solution.maximumGap(source2);
        log.info("solution 164 test, calculate data 1: {}, expect result 1: {}, calculate data 2: {}, expect result 2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    }
}