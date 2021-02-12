package org.LeetcodeSolution.Multithreading; 

import org.junit.Test; 
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution1114 Tester. 
* @author cartoon.yu
* @date 02/12/2021
* @version 1.0 
*/ 
public class Solution1114Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution1114Test.class);

    private Solution1114.Foo solution;

    private Runnable[] source;

    @Before
    public void before(){ 
        solution = new Solution1114.Foo();
        source = new Runnable[]{new FirstRunnable(), new SecondRunnable(), new ThirdRunnable()};
    }

    @Test
    public void testRun() throws InterruptedException {
        solution.first(source[0]);
        solution.second(source[1]);
        solution.third(source[2]);
    }
}
