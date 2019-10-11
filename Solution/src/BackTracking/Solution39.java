package BackTracking;

import java.util.*;

/**
 * Problem
 *     39.Combination Sum
 *     https://leetcode.com/problems/combination-sum/
 *     https://leetcode-cn.com/problems/combination-sum/
 * Grade of difficulty
 *     Medium
 * Related topics
 *     40.Combination Sum II
 *     216.Combination Sum III
 * @author cartoon
 * @version 1.0
 */
public class Solution39 {

    /**
     * 1.关于复杂度
     *   1.1 我不肯定时间复杂度，复杂度依赖于具体数组以及target
     *   1.2 空间负责度为O(n)
     * 2.我的解题思路
     *   2.1 这个解法基于回溯算法
     *   2.2 排序数组
     *   2.3 递归中将当前循环的num加入缓存list以及更新当前n，如果n<=0,终止循环，如果n=0，加入当前list到目标list中，递归中数字可以一样
     * 3.提交记录
     *   3.1 力扣中耗时4ms,消耗36.3MB内存
     *   3.2 leetcode中耗时4ms,消耗36.6MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 I'm not sure time complexity,it depends on specific candidates and target
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on backTracking
     *     2.2 sort array first
     *     2.3 recurse to add current num to temp list and update current n util n<=0,when n=0,add temp list to result list,recurse num is allowed to same
     * 3.About submit record
     *     3.1 4ms and 36.3MB memory in LeetCode China
     *     3.2 4ms and 36.6MB memory in LeetCode
     * 4.Q&A
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates==null||candidates.length==0||target==0){
            return Collections.emptyList();
        }
        res=new LinkedList<>();
        Arrays.sort(candidates);
        backTracking(candidates,0,target,candidates.length,new ArrayList<>());
        return res;
    }

    private List<List<Integer>> res;

    private void backTracking(int[] nums,int cur,int n,int length,List<Integer> list){
        if(n<0){
            return;
        }
        if(n==0){
            res.add(new ArrayList<>(list));
        }
        for(int i=cur;i<length;i++){
            list.add(nums[i]);
            n-=nums[i];
            backTracking(nums,i,n,length,list);
            list.remove(list.size()-1);
            n+=nums[i];
        }
    }
}
