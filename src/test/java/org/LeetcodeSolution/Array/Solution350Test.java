package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Solution350 Tester.
 * @author cartoon
 * @date 10/20/2020
 * @version 1.0
 */
public class Solution350Test {

    private static final Logger log = LoggerFactory.getLogger(Solution350Test.class);

    private Solution350 solution;

    private int[] source1Param1;

    private int[] source1Param2;

    private int[] source2Param1;

    private int[] source2Param2;

    private int[] expect1;

    private int[] expect2;

    @Before
    public void before(){
        solution = new Solution350();
        source1Param1 = new int[]{1, 2, 2, 1};
        source1Param2 = new int[]{2, 2};
        source2Param1 = new int[]{4, 9, 5};
        source2Param2 = new int[]{9, 4, 9, 8, 4};
        expect1 = new int[]{2, 2};
        expect2 = new int[]{4, 9};
    }

    /**
     *
     * Method: intersect(int[] nums1, int[] nums2)
     *
     */
    @Test
    public void testIntersect(){
        int[] res1 = solution.intersect(source1Param1, source1Param2);
        int[] res2 = solution.intersect(source2Param1, source2Param2);
        log.info("solution 350 test, test intersect, calculate data 1: {}, expect result 1: {}, calculate data 2: {}, expect result 2: {}",
                res1, expect1, res2, expect2);
        Assert.assertArrayEquals(expect1, res1);
        Assert.assertArrayEquals(expect2, res2);
    }

    /**
     *
     * Method: preIntersect(int[] nums1, int[] nums2)
     *
     */
    @Test
    public void testPreIntersect(){
        int[] res1 = solution.preIntersect(source1Param1, source1Param2);
        int[] res2 = solution.preIntersect(source2Param1, source2Param2);
        log.info("solution 350 test, test pre intersect, calculate data 1: {}, expect result 1: {}, calculate data 2: {}, expect result 2: {}",
                res1, expect1, res2, expect2);
        Assert.assertArrayEquals(expect1, res1);
        Assert.assertArrayEquals(expect2, res2);
    }


}
