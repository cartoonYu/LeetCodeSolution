package Greedy;

import java.util.Arrays;

/**
 * Problem
 *     881.Boats to Save People
 *     https://leetcode.com/problems/boats-to-save-people/
 *     https://leetcode-cn.com/problems/boats-to-save-people/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution881 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n log n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个算法基于贪心算法
     *     2.2 将数组排序
     *     2.3 双指针遍历数组，记录船数，有两个情况
     *         2.3.1 array[left]+array[right]<=limit，移动双指针
     *         2.3.2 其他情况，移动右指针
     * 3.提交记录
     *     3.1 力扣中耗时49ms,消耗54.6MB内存
     *     3.2 leetcode中耗时20ms,消耗51.1MB内存
     * 4. Q&A
     * 1.About Complexity
     *     1.1 Time Complexity is O(n log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on greedy
     *     2.2 sort array first
     *     2.3 use two pointer traversal array,there have two condition
     *         2.3.1 array[left]+array[right]<=limit,this can take two people,move both two pointer
     *         2.3.2 other condition,move right pointer
     * 3.About submit record
     *     3.1 49ms and 54.6MB memory in LeetCode China
     *     3.2 20ms and 51.1MB memory in LeetCode
     * 4.Q&A
     *
     * @param people
     * @param limit
     * @return
     */
    public int numRescueBoats(int[] people, int limit) {
        if(people==null||people.length==0){
            return 0;
        }
        Arrays.sort(people);
        int res=0,i=0,j=people.length-1;
        while(i<j){
            if(people[i]+people[j]<=limit){
                i++;
            }
            res++;
            j--;
        }
        return i==j?res+1:res;
    }
}
