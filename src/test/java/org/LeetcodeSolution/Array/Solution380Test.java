package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

/** 
* Solution380 Tester. 
* @author cartoon
* @date 10/21/2020
* @version 1.0 
*/ 
public class Solution380Test {

    private static final Logger log = LoggerFactory.getLogger(Solution380Test.class);

    private Solution380 solution;

    private int param1;

    private int param2;

    private int param3;

    private int param5;

    private int param6;

    private boolean expect1;

    private boolean expect2;

    private boolean expect3;

    private List<Integer> expect4;

    private boolean expect5;

    private boolean expect6;

    private int expect7;

    @Before
    public void before(){ 
        solution = new Solution380();
        param1 = 1;
        param2 = 2;
        param3 = 2;
        param5 = 1;
        param6 = 2;
        expect1 = true;
        expect2 = false;
        expect3 = true;
        expect4 = Arrays.asList(1, 2);
        expect5 = true;
        expect6 = false;
        expect7 = 2;
    }

    @Test
    public void testByHashMap(){
        boolean res1 = solution.insertByHashMap(param1);
        boolean res2 = solution.removeByHashMap(param2);
        boolean res3 = solution.insertByHashMap(param3);
        int res4 = solution.getRandomByHashMap();
        boolean res5 = solution.removeByHashMap(param5);
        boolean res6 = solution.insertByHashMap(param6);
        int res7 = solution.getRandomByHashMap();
        log.info("solution 380 test, test function by hash map, " +
                        "calculate data 1: {}, expect result 1: {}, " +
                        "calculate data 2: {}, expect result 2: {}, " +
                        "calculate data 3: {}, expect result 3: {}, " +
                        "calculate data 4: {}, expect result 4: {}, " +
                        "calculate data 5: {}, expect result 5: {}, " +
                        "calculate data 6: {}, expect result 6: {}, " +
                        "calculate data 7: {}, expect result 7: {}",
                res1, expect1, res2, expect2, res3, expect3, res4, expect4,
                res5, expect5, res6, expect6, res7, expect7);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
        Assert.assertTrue(expect4.contains(res4));
        Assert.assertEquals(expect5, res5);
        Assert.assertEquals(expect6, res6);
        Assert.assertEquals(expect7, res7);
    }

    @Test
    public void test(){
        boolean res1 = solution.insert(param1);
        boolean res2 = solution.remove(param2);
        boolean res3 = solution.insert(param3);
        int res4 = solution.getRandom();
        boolean res5 = solution.remove(param5);
        boolean res6 = solution.insert(param6);
        int res7 = solution.getRandom();
        log.info("solution 380 test, test function" +
                        "calculate data 1: {}, expect result 1: {}, " +
                        "calculate data 2: {}, expect result 2: {}, " +
                        "calculate data 3: {}, expect result 3: {}, " +
                        "calculate data 4: {}, expect result 4: {}, " +
                        "calculate data 5: {}, expect result 5: {}, " +
                        "calculate data 6: {}, expect result 6: {}, " +
                        "calculate data 7: {}, expect result 7: {}",
                res1, expect1, res2, expect2, res3, expect3, res4, expect4,
                res5, expect5, res6, expect6, res7, expect7);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
        Assert.assertTrue(expect4.contains(res4));
        Assert.assertEquals(expect5, res5);
        Assert.assertEquals(expect6, res6);
        Assert.assertEquals(expect7, res7);
    }

}
