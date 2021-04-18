package org.LeetcodeSolution.String; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution748 Tester. 
* @author cartoon
* @date 11/27/2020
* @version 1.0 
*/ 
public class Solution748Test {

    private static final Logger log = LoggerFactory.getLogger(Solution748Test.class);

    private Solution748 solution;

    private String source1Param1;

    private String[] source1Param2;

    private String source2Param1;

    private String[] source2Param2;

    private String source3Param1;

    private String[] source3Param2;

    private String source4Param1;

    private String[] source4Param2;

    private String source5Param1;

    private String[] source5Param2;

    private String expect1;

    private String expect2;

    private String expect3;

    private String expect4;

    private String expect5;

    @Before
    public void before(){ 
        solution = new Solution748();
        source1Param1 = "1s3 PSt";
        source1Param2 = new String[]{"step", "steps", "stripe", "stepple"};
        source2Param1 = "1s3 456";
        source2Param2 = new String[]{"looks", "pest", "stew", "show"};
        source3Param1 = "Ah71752";
        source3Param2 = new String[]{"suggest","letter","of","husband","easy","education","drug","prevent","writer","old"};
        source4Param1 = "OgEu755";
        source4Param2 = new String[]{"enough","these","play","wide","wonder","box","arrive","money","tax","thus"};
        source5Param1 = "iMSlpe4";
        source5Param2 = new String[]{"claim","consumer","student","camera","public","never","wonder","simple","thought","use"};
        expect1 = "steps";
        expect2 = "pest";
        expect3 = "husband";
        expect4 = "enough";
        expect5 = "simple";
    }

    @Test
    public void testShortestCompletingWord(){
        String res1 = solution.shortestCompletingWord(source1Param1, source1Param2);
        String res2 = solution.shortestCompletingWord(source2Param1, source2Param2);
        String res3 = solution.shortestCompletingWord(source3Param1, source3Param2);
        String res4 = solution.shortestCompletingWord(source4Param1, source4Param2);
        String res5 = solution.shortestCompletingWord(source5Param1, source5Param2);
        log.info("solution 748 test, calculate data1: {}, expect result1: {}, " +
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
