package org.LeetcodeSolution.String; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/** 
* Solution1436 Tester. 
* 
* @author cartoon
* @since 04/18/2021
* @version 1.0 
*/ 
public class Solution1436Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1436Test.class);

    private Solution1436 solution;

    private List<List<String>> source1;

    private List<List<String>> source2;

    private List<List<String>> source3;

    private String expect1;

    private String expect2;

    private String expect3;

    @Before
    public void before(){
        solution = new Solution1436();
        source1 = new LinkedList<>();
        source1.add(Arrays.asList("London", "New York"));
        source1.add(Arrays.asList("New York", "Lima"));
        source1.add(Arrays.asList("Lima", "Sao Paulo"));
        source2 = new LinkedList<>();
        source2.add(Arrays.asList("B", "C"));
        source2.add(Arrays.asList("D", "B"));
        source2.add(Arrays.asList("C", "A"));
        source3 = new LinkedList<>();
        source3.add(Arrays.asList("A", "Z"));
        expect1 = "Sao Paulo";
        expect2 = "A";
        expect3 = "Z";
    } 
    
    /**
    * 
    * Method: destCity(List<List<String>> paths) 
    * 
    */ 
    @Test
    public void testDestCity(){ 
        String res1 = solution.destCity(source1);
        String res2 = solution.destCity(source2);
        String res3 = solution.destCity(source3);
        log.info("solution 1436 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 
    
    
}
