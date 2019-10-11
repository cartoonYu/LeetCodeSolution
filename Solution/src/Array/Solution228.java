package Array;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Problem
 *     228.Summary Ranges
 *     https://leetcode.com/problems/summary-ranges/
 *     https://leetcode-cn.com/problems/summary-ranges/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution228 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个解法基于滑动窗口实现
     *     2.2 定义两个指针分别表示左右边界
     *     2.3 从第一个元素开始遍历数组，存在两个情况
     *         2.3.1 当前元素等于右边界加1，更新右边界
     *         2.3.2 其余情况，根据左右边界的情况组合字符串加入结果list中
     * 3.提交记录
     *     3.1 力扣中耗时0ms,消耗34.8MB内存
     *     3.2 leetcode中耗时0ms,消耗34.8MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on slide window
     *     2.2 define two pointer which is represent left border and right border
     *     2.3 circulate 1 to n,there have two condition
     *         2.3.1 current element is equals right border plus 1,update right border and keep going
     *         2.3.2 other condition,form a string and add to result list depends on left and right border
     * 3.About submit record
     *     3.1 0ms and 34.8MB memory in LeetCode China
     *     3.2 0ms and 34.8MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public List<String> summaryRanges(int[] nums) {
        if(nums==null||nums.length==0){
            return Collections.emptyList();
        }
        int start=nums[0],end=nums[0];
        List<String> res=new LinkedList<>();
        for(int i=1,length=nums.length;i<length;i++){
            if(nums[i]==end+1){
                end=nums[i];
            }
            else{
                if(start==end){
                    res.add(Integer.toString(start));
                }
                else{
                    res.add(start+"->"+end);
                }
                start=nums[i];
                end=nums[i];
            }
        }
        if(start==end){
            res.add(Integer.toString(start));
        }
        else{
            res.add(start+"->"+end);
        }
        return res;
    }
}
