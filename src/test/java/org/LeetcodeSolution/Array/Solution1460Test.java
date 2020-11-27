package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class Solution1460Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1460Test.class);

    private Solution1460 solution;

    private int[] source1Param1;

    private int[] source1Param2;

    private int[] source2Param1;

    private int[] source2Param2;

    private int[] source3Param1;

    private int[] source3Param2;

    private int[] source4Param1;

    private int[] source4Param2;

    private int[] source5Param1;

    private int[] source5Param2;

    private Boolean expect1;

    private Boolean expect2;

    private Boolean expect3;

    private Boolean expect4;

    private Boolean expect5;

    @Before
    public void before(){
        solution = new Solution1460();
        source1Param1 = new int[]{1, 2, 3, 4};
        source1Param2 = new int[]{2, 4, 1, 3};
        source2Param1 = new int[]{7};
        source2Param2 = new int[]{7};
        source3Param1 = new int[]{1, 12};
        source3Param2 = new int[]{12, 1};
        source4Param1 = new int[]{3, 7, 9};
        source4Param2 = new int[]{3, 7, 11};
        source5Param1 = new int[]{1, 1, 1, 1, 1};
        source5Param2 = new int[]{1, 1, 1, 1, 1};
        expect1 = true;
        expect2 = true;
        expect3 = true;
        expect4 = false;
        expect5 = true;
    }

    @Test
    public void canBeEqual() {
        boolean res1 = solution.canBeEqual(source1Param1, source1Param2);
        boolean res2 = solution.canBeEqual(source2Param1, source2Param2);
        boolean res3 = solution.canBeEqual(source3Param1, source3Param2);
        boolean res4 = solution.canBeEqual(source4Param1, source4Param2);
        boolean res5 = solution.canBeEqual(source5Param1, source5Param2);
        log.info("solution 1460 test, calculate data1: {}, expect result1: {}, " +
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