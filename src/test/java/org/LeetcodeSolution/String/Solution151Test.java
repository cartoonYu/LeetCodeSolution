package org.LeetcodeSolution.String; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution151 Tester. 
* @author cartoon
* @date 03/29/2021
* @version 1.0 
*/ 
public class Solution151Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution151Test.class);

    private Solution151 solution;

    private String source1;

    private String source2;

    private String source3;

    private String source4;

    private String source5;

    private String expect1;

    private String expect2;

    private String expect3;

    private String expect4;

    private String expect5;

    @Before
    public void before(){ 
        solution = new Solution151();
        source1 = "the sky is blue";
        source2 = "  hello world!  ";
        source3 = "a good   example";
        source4 = "  Bob    Loves  Alice   ";
        source5 = "Alice does not even like bob";
        expect1 = "blue is sky the";
        expect2 = "world! hello";
        expect3 = "example good a";
        expect4 = "Alice Loves Bob";
        expect5 = "bob like even not does Alice";
    }

        /** 
     * 
     * Method: reverseWordsBySplit(String s) 
     * 
     */ 
    @Test
    public void testReverseWordsBySplit(){ 
        String res1 = solution.reverseWordsBySplit(source1);
        String res2 = solution.reverseWordsBySplit(source2);
        String res3 = solution.reverseWordsBySplit(source3);
        String res4 = solution.reverseWordsBySplit(source4);
        String res5 = solution.reverseWordsBySplit(source5);
        log.info("solution 151 test by split, calculate data1: {}, expect result1: {}, " +
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
    
        /** 
     * 
     * Method: reverseWordsByChars(String s) 
     * 
     */ 
    @Test
    public void testReverseWordsByChars(){
        String res1 = solution.reverseWordsByChars(source1);
        String res2 = solution.reverseWordsByChars(source2);
        String res3 = solution.reverseWordsByChars(source3);
        String res4 = solution.reverseWordsByChars(source4);
        String res5 = solution.reverseWordsByChars(source5);
        log.info("solution 151 test by chars, calculate data1: {}, expect result1: {}, " +
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
