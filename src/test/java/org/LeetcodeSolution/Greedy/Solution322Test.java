package org.LeetcodeSolution.Greedy; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution322 Tester. 
* @author cartoon
* @date 02/26/2021
* @version 1.0 
*/ 
public class Solution322Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution322Test.class);

    private Solution322 solution;

    private int[] source1Param1;

    private int source1Param2;

    private int[] source2Param1;

    private int source2Param2;

    private int[] source3Param1;

    private int source3Param2;

    private int[] source4Param1;

    private int source4Param2;

    private int[] source5Param1;

    private int source5Param2;

    private int expect1;

    private int expect2;

    private int expect3;

    private int expect4;

    private int expect5;

    @Before
    public void before(){ 
        solution = new Solution322();
        source1Param1 = new int[]{1, 2, 5};
        source1Param2 = 11;
        source2Param1 = new int[]{2};
        source2Param2 = 3;
        source3Param1 = new int[]{1};
        source3Param2 = 0;
        source4Param1 = new int[]{1};
        source4Param2 = 1;
        source5Param1 = new int[]{1};
        source5Param2 = 2;
        expect1 = 3;
        expect2 = -1;
        expect3 = 0;
        expect4 = 1;
        expect5 = 2;
    }

    /**
     * 
     * Method: coinChange(int[] coins, int amount) 
     * 
     */ 
    @Test
    public void testCoinChange(){
        int res1 = solution.coinChange(source1Param1, source1Param2);
        int res2 = solution.coinChange(source2Param1, source2Param2);
        int res3 = solution.coinChange(source3Param1, source3Param2);
        int res4 = solution.coinChange(source4Param1, source4Param2);
        int res5 = solution.coinChange(source5Param1, source5Param2);
        log.info("solution 322 test, calculate data1: {}, expect result1: {}, " +
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
