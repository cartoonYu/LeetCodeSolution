package org.LeetcodeSolution.Array;

import java.util.Arrays;

/**
 * Problem
 *     274.H-Index
 *     https://leetcode.com/problems/h-index/submissions/
 *     https://leetcode-cn.com/problems/h-index/submissions/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution274 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为O(n log n)
     *   1.2 空间负责度为O(1)
     * 2.我的解题思路
     *   2.1 将数组进行排序
     *   2.2 根据题意，遍历数组，计算数组长度与当前索引的值，并将这个值用来跟当前值对比
     * 3.提交记录
     *   3.1 力扣中耗时1ms,消耗35.2MB内存
     *   3.2 leetcode中耗时1ms,消耗35.7MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 sort array first
     *     2.2 according to topic,calculate length subtract current index result and compare with current value
     * 3.About submit record
     *     3.1 1ms and 35.2MB memory in LeetCode China
     *     3.2 1ms and 35.7MB memory in LeetCode
     * 4.Q&A
     *
     * @param citations
     * @return
     */
    public int hIndexBySort(int[] citations) {
        if(citations==null||citations.length==0){
            return 0;
        }
        Arrays.sort(citations);
        int res;
        for(int i=0,length=citations.length;i<length;i++){
            res=length-i;
            if(res<=citations[i]){
                return res;
            }
        }
        return 0;
    }

}
