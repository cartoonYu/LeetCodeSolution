package BackTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem
 *     78.Subsets
 *     https://leetcode.com/problems/subsets/
 *     https://leetcode-cn.com/problems/subsets/
 * Grade of difficulty
 *     Medium
 * Related topics
 *     90.Subsets II
 * @author cartoon
 * @version 1.0
 */
public class Solution78 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为2*O(n-1)-1
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 这个解法基于回溯算法
     *     2.2 定义一个操作list以及结果list
     *     2.3 将操作list加入到结果list中
     *     2.4 循环遍历数组
     *         2.4.1 将当前遍历的元素加入操作list中
     *         2.4.2 递归遍历下一元素
     *         2.4.3 移除2.4.1加入的元素
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗36MB内存
     *     3.2 leetcode中耗时0ms,消耗37.5MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is 2*O(n-1)-1
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on backTracking
     *     2.2 define a operate list and result list
     *     2.3 add current operate list to result list
     *     2.4 circulate current position to nums.length
     *         2.4.1 add current element to operate list
     *         2.4.2 recurse and traverse next element
     *         2.4.3 remove 2.4.1 add element
     * 3.About submit record
     *     3.1 1ms and 36MB memory in LeetCode China
     *     3.2 0ms and 37.5MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets(int[] nums) {
        if(nums==null||nums.length==0){
            return Collections.emptyList();
        }
        res=new ArrayList<>();
        backTracking(nums,0,new ArrayList<>());
        return res;
    }

    private List<List<Integer>> res;

    private void backTracking(int[] nums,int position,List<Integer> list){
        res.add(new ArrayList<>(list));
        for(int i=position,size=nums.length;i<size;i++){
            list.add(nums[i]);
            backTracking(nums,i+1,list);
            list.remove(list.size()-1);
        }
    }
}
