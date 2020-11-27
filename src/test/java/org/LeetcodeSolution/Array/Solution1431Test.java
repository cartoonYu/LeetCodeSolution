package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;
import java.util.List;

public class Solution1431Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1431Test.class);

    private Solution1431 solution;

    private int[] source1Param1;

    private int[] source2Param1;

    private int[] source3Param1;

    private int source1Param2;

    private int source2Param2;

    private int source3Param2;

    private List<Boolean> expect1;

    private List<Boolean> expect2;

    private List<Boolean> expect3;

    @Before
    public void before(){
        solution = new Solution1431();
        source1Param1 = new int[]{2, 3, 5, 1, 3};
        source2Param1 = new int[]{4, 2, 1, 1, 2};
        source3Param1 = new int[]{12, 1, 12};
        source1Param2 = 3;
        source2Param2 = 1;
        source3Param2 = 10;
        expect1 = Arrays.asList(true, true, true, false, true);
        expect2 = Arrays.asList(true, false, false, false, false);
        expect3 = Arrays.asList(true, false, true);
    }

    @Test
    public void kidsWithCandies() {
        List<Boolean> res1 = solution.kidsWithCandies(source1Param1, source1Param2);
        List<Boolean> res2 = solution.kidsWithCandies(source2Param1, source2Param2);
        List<Boolean> res3 = solution.kidsWithCandies(source3Param1, source3Param2);
        log.info("solution 1431 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    }
}