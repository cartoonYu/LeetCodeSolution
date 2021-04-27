package org.LeetcodeSolution.Design; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution1603 Tester. 
* 
* @author cartoon
* @since 04/27/2021
* @version 1.0 
*/ 
public class Solution1603Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1603Test.class);

    private Solution1603 solution;

    private int source1;

    private int source2;

    private int source3;

    private int source4;

    private boolean expect1;

    private boolean expect2;

    private boolean expect3;

    private boolean expect4;

    @Before
    public void before(){
        solution = new Solution1603(1, 1, 0);
        source1 = 1;
        source2 = 2;
        source3 = 3;
        source4 = 1;
        expect1 = true;
        expect2 = true;
        expect3 = false;
        expect4 = false;
    } 
    
    /**
    * 
    * Method: addCar(int carType) 
    * 
    */ 
    @Test
    public void testAddCar(){
        boolean res1 = solution.addCar(source1);
        boolean res2 = solution.addCar(source2);
        boolean res3 = solution.addCar(source3);
        boolean res4 = solution.addCar(source4);
        log.info("solution 1603 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}, " +
                        "calculate data4: {}, expect result4: {}",
                res1, expect1, res2, expect2, res3, expect3, res4, expect4);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
        Assert.assertEquals(expect4, res4);
    }

}
