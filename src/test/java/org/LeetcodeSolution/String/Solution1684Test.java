package org.LeetcodeSolution.String;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cartoon
 * @date 2020/12/27
 */
public class Solution1684Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1684Test.class);

    private Solution1684 solution;

    private String source1Param1;

    private String[] source1Param2;

    private String source2Param1;

    private String[] source2Param2;

    private String source3Param1;

    private String[] source3Param2;

    private int expect1;

    private int expect2;

    private int expect3;

    @Before
    public void before(){
        solution = new Solution1684();
        source1Param1 = "ab";
        source1Param2 = new String[]{"ad", "bd", "aaab", "baa", "badab"};
        source2Param1 = "abc";
        source2Param2 = new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"};
        source3Param1 = "cad";
        source3Param2 = new String[]{"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"};
        expect1 = 2;
        expect2 = 7;
        expect3 = 4;
    }

    @Test
    public void testCountConsistentStrings(){
        int res1 = solution.countConsistentStrings(source1Param1, source1Param2);
        int res2 = solution.countConsistentStrings(source2Param1, source2Param2);
        int res3 = solution.countConsistentStrings(source3Param1, source3Param2);
        log.info("solution 1684 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    }
}
