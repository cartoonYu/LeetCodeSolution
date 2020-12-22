package org.LeetcodeSolution.BinarySearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cartoon
 * @date 2020/12/22
 */
public class Solution744Test {

    private static final Logger log = LoggerFactory.getLogger(Solution744Test.class);

    private Solution744 solution;

    private char[] source1Param1;

    private char[] source2Param1;

    private char[] source3Param1;

    private char[] source4Param1;

    private char[] source5Param1;

    private char[] source6Param1;

    private char source1Param2;

    private char source2Param2;

    private char source3Param2;

    private char source4Param2;

    private char source5Param2;

    private char source6Param2;

    private char expect1;

    private char expect2;

    private char expect3;

    private char expect4;

    private char expect5;

    private char expect6;

    @Before
    public void before(){
        solution = new Solution744();
        source1Param1 = new char[]{'c', 'f', 'j'};
        source1Param2 = 'a';
        source2Param1 = new char[]{'c', 'f', 'j'};
        source2Param2 = 'c';
        source3Param1 = new char[]{'c', 'f', 'j'};
        source3Param2 = 'd';
        source4Param1 = new char[]{'c', 'f', 'j'};
        source4Param2 = 'g';
        source5Param1 = new char[]{'c', 'f', 'j'};
        source5Param2 = 'j';
        source6Param1 = new char[]{'c', 'f', 'j'};
        source6Param2 = 'k';
        expect1 = 'c';
        expect2 = 'f';
        expect3 = 'f';
        expect4 = 'j';
        expect5 = 'c';
        expect6 = 'c';
    }

    @Test
    public void testNextGreatestLetterByBinarySearch(){
        char res1 = solution.nextGreatestLetterByBinarySearch(source1Param1, source1Param2);
        char res2 = solution.nextGreatestLetterByBinarySearch(source2Param1, source2Param2);
        char res3 = solution.nextGreatestLetterByBinarySearch(source3Param1, source3Param2);
        char res4 = solution.nextGreatestLetterByBinarySearch(source4Param1, source4Param2);
        char res5 = solution.nextGreatestLetterByBinarySearch(source5Param1, source5Param2);
        char res6 = solution.nextGreatestLetterByBinarySearch(source6Param1, source6Param2);
        log.info("solution 744 test, get by binary search, " +
                        "calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}, " +
                        "calculate data4: {}, expect result4: {}, " +
                        "calculate data5: {}, expect result5: {}, " +
                        "calculate data6: {}, expect result6: {}",
                res1, expect1, res2, expect2, res3, expect3, res4, expect4, res5, expect5, res6, expect6);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
        Assert.assertEquals(expect4, res4);
        Assert.assertEquals(expect5, res5);
        Assert.assertEquals(expect6, res6);
    }

    @Test
    public void testNextGreatestLetterByCirculate(){
        char res1 = solution.nextGreatestLetterByCirculate(source1Param1, source1Param2);
        char res2 = solution.nextGreatestLetterByCirculate(source2Param1, source2Param2);
        char res3 = solution.nextGreatestLetterByCirculate(source3Param1, source3Param2);
        char res4 = solution.nextGreatestLetterByCirculate(source4Param1, source4Param2);
        char res5 = solution.nextGreatestLetterByCirculate(source5Param1, source5Param2);
        char res6 = solution.nextGreatestLetterByCirculate(source6Param1, source6Param2);
        log.info("solution 744 test, get by circulation, " +
                        "calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}, " +
                        "calculate data4: {}, expect result4: {}, " +
                        "calculate data5: {}, expect result5: {}, " +
                        "calculate data6: {}, expect result6: {}",
                res1, expect1, res2, expect2, res3, expect3, res4, expect4, res5, expect5, res6, expect6);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
        Assert.assertEquals(expect4, res4);
        Assert.assertEquals(expect5, res5);
        Assert.assertEquals(expect6, res6);
    }
}
