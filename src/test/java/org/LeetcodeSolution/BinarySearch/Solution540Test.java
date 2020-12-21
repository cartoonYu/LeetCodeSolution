package org.LeetcodeSolution.BinarySearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cartoon
 * @date 2020/12/21
 */
public class Solution540Test {

    private static final Logger log = LoggerFactory.getLogger(Solution540Test.class);

    private Solution540 solution;

    private int[] source1;

    private int[] source2;

    private int expect1;

    private int expect2;

    @Before
    public void before(){
        solution = new Solution540();
        source1 = new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8};
        source2 = new int[]{3, 3, 7, 7, 10, 11, 11};
        expect1 = 2;
        expect2 = 10;
    }

    @Test
    public void testSingleNonDuplicate(){
        int res1 = solution.singleNonDuplicate(source1);
        int res2 = solution.singleNonDuplicate(source2);
        log.info("solution 540 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    }
}
