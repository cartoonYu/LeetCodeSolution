package org.LeetcodeSolution.Design;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cartoon
 * @date 2020/12/26
 */
public class Solution1357Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1357Test.class);

    private Solution1357 solution;

    private int n;

    private int discount;

    private int[] products;

    private int[] prices;

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

    private int[] source6Param1;

    private int[] source6Param2;

    private int[] source7Param1;

    private int[] source7Param2;

    private double expect1;

    private double expect2;

    private double expect3;

    private double expect4;

    private double expect5;

    private double expect6;

    private double expect7;

    @Before
    public void before(){
        n = 3;
        discount = 50;
        products = new int[]{1, 2, 3, 4, 5, 6, 7};
        prices = new int[]{100, 200, 300, 400, 300, 200, 100};
        solution = new Solution1357(n, discount, products, prices);
        source1Param1 = new int[]{1, 2};
        source1Param2 = new int[]{1, 2};
        source2Param1 = new int[]{3, 7};
        source2Param2 = new int[]{10, 10};
        source3Param1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        source3Param2 = new int[]{1, 1, 1, 1, 1, 1, 1};
        source4Param1 = new int[]{4};
        source4Param2 = new int[]{10};
        source5Param1 = new int[]{7, 3};
        source5Param2 = new int[]{10, 10};
        source6Param1 = new int[]{7, 5, 3, 1, 6, 4, 2};
        source6Param2 = new int[]{10, 10, 10, 9, 9, 9, 7};
        source7Param1 = new int[]{2, 3, 5};
        source7Param2 = new int[]{5, 3, 2};
        expect1 = 500.0;
        expect2 = 4000.0;
        expect3 = 800.0;
        expect4 = 4000.0;
        expect5 = 4000.0;
        expect6 = 7350.0;
        expect7 = 2500.0;
    }

    @Test
    public void testGetBill(){
        double res1 = solution.getBill(source1Param1, source1Param2);
        double res2 = solution.getBill(source2Param1, source2Param2);
        double res3 = solution.getBill(source3Param1, source3Param2);
        double res4 = solution.getBill(source4Param1, source4Param2);
        double res5 = solution.getBill(source5Param1, source5Param2);
        double res6 = solution.getBill(source6Param1, source6Param2);
        double res7 = solution.getBill(source7Param1, source7Param2);
        log.info("solution 1357 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}, " +
                        "calculate data4: {}, expect result4: {}, " +
                        "calculate data5: {}, expect result5: {},  " +
                        "calculate data6: {}, expect result6: {}, " +
                        "calculate data7: {}, expect result7: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1, 0);
        Assert.assertEquals(expect2, res2, 0);
        Assert.assertEquals(expect3, res3, 0);
        Assert.assertEquals(expect4, res4, 0);
        Assert.assertEquals(expect5, res5, 0);
        Assert.assertEquals(expect6, res6, 0);
        Assert.assertEquals(expect7, res7, 0);
    }
}
