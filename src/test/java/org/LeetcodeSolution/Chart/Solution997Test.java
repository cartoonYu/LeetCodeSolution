package org.LeetcodeSolution.Chart; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution997 Tester. 
* 
* @author cartoon 
* @since  01/06/2021
* @version 1.0 
*/ 
public class Solution997Test {
    
    private static Logger log = LoggerFactory.getLogger(Solution997.class);
    
    private Solution997 solution;

    private int source1Param1;

    private int[][] source1Param2;

    private int source2Param1;

    private int[][] source2Param2;

    private int source3Param1;

    private int[][] source3Param2;

    private int source4Param1;

    private int[][] source4Param2;

    private int source5Param1;

    private int[][] source5Param2;

    private int expect1;

    private int expect2;

    private int expect3;

    private int expect4;

    private int expect5;

    @Before
    public void before(){ 
        solution = new Solution997();
        source1Param1 = 2;
        source1Param2 = new int[][]{{1, 2}};
        source2Param1 = 3;
        source2Param2 = new int[][]{{1, 3}, {2, 3}};
        source3Param1 = 3;
        source3Param2 = new int[][]{{1, 3}, {2, 3}, {3, 1}};
        source4Param1 = 3;
        source4Param2 = new int[][]{{1, 2}, {2, 3}};
        source5Param1 = 4;
        source5Param2 = new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
        expect1 = 2;
        expect2 = 3;
        expect3 = -1;
        expect4 = -1;
        expect5 = 3;
    } 
    
    /**
    *
    * Method: findJudge(int N, int[][] trust)
    *
    */
    @Test
    public void testFindJudge(){
        int res1 = solution.findJudge(source1Param1, source1Param2);
        int res2 = solution.findJudge(source2Param1, source2Param2);
        int res3 = solution.findJudge(source3Param1, source3Param2);
        int res4 = solution.findJudge(source4Param1, source4Param2);
        int res5 = solution.findJudge(source5Param1, source5Param2);
        log.info("solution 997 test, calculate data1: {}, expect result1: {}, " +
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
