package Array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Problem
 *      349. Intersection of Two Arrays
 *      https://leetcode.com/problems/intersection-of-two-arrays/
 *      https://leetcode-cn.com/problems/intersection-of-two-arrays/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      350. Intersection of Two Arrays II
 * @author cartoon
 * @version 1.0
 */
public class Solution349 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 对比两个数组，使用较大的数组作为被对比set，较小的数组作为对比set
     *     2.2 遍历对比数组，每个元素都需要跟被对比set对比，被对比数组中没有这个元素，将这个元素加入对比set中
     *     2.3 迭代输出对比set中所有元素
     * 3.提交记录
     *     3.1 力扣中耗时8ms,消耗38MB内存
     *     3.2 leetcode中耗时2ms,消耗35.4MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *      1.1 Time Complexity is O(n)
     *      1.2 Space Complexity is O(n)
     * 2.how I solve
     *      2.1 Compare two array,use the longer array as a compared set
     *      2.2 Use the shorter array as a compare array
     *      2.3 Traverse the compare array,use every element to contrast with the compared set,if it didn't,put the element to a new Set
     *      2.4 Use iteration traversal to put every element to array
     * 3.About submit record
     *      3.1 8ms and 38MB memory in LeetCode China
     *      3.2 2ms and 35.4MB memory in LeetCode
     * 4.Q&A
     *      4.1 Q:Why do you compare two array'length at first?
     *          A:Cause I want to cut down the time of traverse the compare array as far as possible
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        int[] tempNum=nums1.length>nums2.length?nums1:nums2;
        int[] tempNum2=nums1.length<nums2.length?nums1:nums2;
        for(int temp:tempNum){
            set.add(temp);
        }
        Set<Integer> tempSet=new HashSet<>();
        for(int temp:tempNum2){
            if(set.contains(temp)){
                tempSet.add(temp);
            }
        }
        int[] result=new int[tempSet.size()];
        int flag=0;
        Iterator<Integer> it=tempSet.iterator();
        while(it.hasNext()){
            result[flag++]=it.next();
        }
        return result;
    }
}
