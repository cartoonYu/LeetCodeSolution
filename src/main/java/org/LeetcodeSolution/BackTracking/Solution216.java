package org.LeetcodeSolution.BackTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Problem
 *     216.Combination Sum III
 *     https://leetcode.com/problems/combination-sum-iii/
 *     https://leetcode-cn.com/problems/combination-sum-iii/
 * Grade of difficulty
 *     Medium
 * Related topics
 *     39.Combination Sum
 *     40.Combination Sum II
 * @author cartoon
 * @version 1.0
 */
public class Solution216 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n*k)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个解法基于回溯算法
     *     2.2 递归中将当前循环的num加入缓存list以及更新当前n，如果n<=0,终止循环，如果n=0而且缓存list的大小等于k，加入当前list到目标list中
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗33.7MB内存
     *     3.2 leetcode中耗时1ms,消耗33.7MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n*k)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on backTracking
     *     2.2 recurse to add current num to temp list and update current n util n<=0,if n=0 and list.size()=k,add current list to result list
     * 3.About submit record
     *     3.1 1ms and 33.7MB memory in LeetCode China
     *     3.2 1ms and 33.7MB memory in LeetCode
     * 4.Q&A
     *
     * @param k
     * @param n
     * @return
     */
    public List<List<Integer>> combinationSum3(int k, int n) {
        if(k==0||n==0){
            return Collections.emptyList();
        }
        res=new LinkedList<>();
        backTracking(1,k,n,new ArrayList<>());
        return res;
    }

    private List<List<Integer>> res;

    private void backTracking(int cur,int k,int n,List<Integer> list){
        if(n<0){
            return;
        }
        if(n==0){
            if(list.size()==k){
                res.add(new LinkedList<>(list));
            }
            return;
        }
        for(int i=cur;i<10;i++){
            list.add(i);
            n-=i;
            backTracking(i+1,k,n,list);
            list.remove(list.size()-1);
            n+=i;
        }
    }
}
