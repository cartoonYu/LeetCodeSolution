package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Solution189Test {

    private static final Logger log = LoggerFactory.getLogger(Solution189Test.class);

    private Solution189 solution;

    private int[] source1;

    private int[] source2;

    private int[] expect1;

    private int[] expect2;

    private int k1;

    private int k2;

    @Before
    public void before(){
        solution = new Solution189();
        source1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        source2 = new int[]{-1, -100, 3, 99};
        expect1 = new int[]{5, 6, 7, 1, 2, 3, 4};
        expect2 = new int[]{3, 99, -1, -100};
        k1 = 3;
        k2 = 2;
    }

    @Test
    public void rotateByRecurse() {
        int[] recurseSource1 = new int[7];
        int[] recurseSource2 = new int[4];
        for(int i = 0, length = recurseSource1.length; i < length; i++){
            recurseSource1[i] = source1[i];
        }
        for(int i = 0, length = recurseSource2.length; i < length; i++){
            recurseSource2[i] = source2[i];
        }
        solution.rotateByRecurse(recurseSource1, k1);
        solution.rotateByRecurse(recurseSource2, k2);
        log.info("solution 189 test, rotate by recurse calculate data 1: {}, expect result 1: {}, calculate data 2: {}, expect result 2: {}",
                recurseSource1, expect1, recurseSource2, expect2);
        Assert.assertArrayEquals(expect1, recurseSource1);
        Assert.assertArrayEquals(expect2, recurseSource2);
    }

    @Test
    public void rotateByList() {
        int[] listSource1 = new int[7];
        int[] listSource2 = new int[4];
        for(int i = 0, length = listSource1.length; i < length; i++){
            listSource1[i] = source1[i];
        }
        for(int i = 0, length = listSource2.length; i < length; i++){
            listSource2[i] = source2[i];
        }
        solution.rotateByList(listSource1, k1);
        solution.rotateByList(listSource2, k2);
        log.info("solution 189 test, rotate by list calculate data 1: {}, expect result 1: {}, calculate data 2: {}, expect result 2: {}",
                listSource1, expect1, listSource2, expect2);
        Assert.assertArrayEquals(expect1, listSource1);
        Assert.assertArrayEquals(expect2, listSource2);
    }
}