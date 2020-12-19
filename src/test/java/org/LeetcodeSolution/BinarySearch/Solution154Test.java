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
public class Solution154Test {

    private static final Logger log = LoggerFactory.getLogger(Solution154Test.class);

    private Solution154 solution;

    private int[] source1;

    private int[] source2;

    private int expect1;

    private int expect2;

    @Before
    public void before(){
        solution = new Solution154();
        source1 = new int[]{1, 3, 5};
        source2 = new int[]{2, 2, 2, 0, 1};
        expect1 = 1;
        expect2 = 0;
    }

    @Test
    public void testFindMin() {
        int res1 = solution.findMin(source1);
        int res2 = solution.findMin(source2);
        log.info("solution 154 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    }
}