package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class Solution1450Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1450Test.class);

    private Solution1450 solution;

    private int[] source1Param1;

    private int[] source1Param2;

    private int source1Param3;

    private int[] source2Param1;

    private int[] source2Param2;

    private int source2Param3;

    private int[] source3Param1;

    private int[] source3Param2;

    private int source3Param3;

    private int[] source4Param1;

    private int[] source4Param2;

    private int source4Param3;

    private int[] source5Param1;

    private int[] source5Param2;

    private int source5Param3;

    private int expect1;

    private int expect2;

    private int expect3;

    private int expect4;

    private int expect5;

    @Before
    public void before(){
        solution = new Solution1450();
        source1Param1 = new int[]{1, 2, 3};
        source1Param2 = new int[]{3, 2, 7};
        source1Param3 = 4;
        source2Param1 = new int[]{4};
        source2Param2 = new int[]{4};
        source2Param3 = 4;
        source3Param1 = new int[]{4};
        source3Param2 = new int[]{4};
        source3Param3 = 5;
        source4Param1 = new int[]{1, 1, 1, 1};
        source4Param2 = new int[]{1, 3, 2, 4};
        source4Param3 = 7;
        source5Param1 = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        source5Param2 = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10};
        source5Param3 = 5;
        expect1 = 1;
        expect2 = 1;
        expect3 = 0;
        expect4 = 0;
        expect5 = 5;
    }


    @Test
    public void busyStudent() {
        int res1 = solution.busyStudent(source1Param1, source1Param2, source1Param3);
        int res2 = solution.busyStudent(source2Param1, source2Param2, source2Param3);
        int res3 = solution.busyStudent(source3Param1, source3Param2, source3Param3);
        int res4 = solution.busyStudent(source4Param1, source4Param2, source4Param3);
        int res5 = solution.busyStudent(source5Param1, source5Param2, source5Param3);
        log.info("solution 1450 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}, " +
                        "calculate data4: {}, expect result4: {}, " +
                        "calculate data5: {}, expect result5: {}",
                res1, expect1, res2, expect2, res3, expect3, res4, expect4, res5, expect5);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
        Assert.assertEquals(expect4, res4);
        Assert.assertEquals(expect5, res5);
    }
}