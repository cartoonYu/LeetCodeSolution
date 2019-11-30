package Array;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem
 *      961.N-Repeated Element in Size 2N Array
 *      https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 *      https://leetcode-cn.com/problems/n-repeated-element-in-size-2n-array/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution961 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 因为题目表明数组中含有2N个元素，并且N个元素是相同的，所以只有一个元素重复
     *   2.2 使用 HashSet 缓存独特的元素，如果 HashSet 含有当前元素，返回当前元素
     * 3.提交记录
     *   3.1 力扣中耗时2ms,消耗48.8MB内存
     *   3.2 leetcode中耗时1ms,消耗37.5MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 cause topic's mean is a array has 2N element and N element are the same,so there only have a one element repetitive appearance
     *     2.2 use a hashSet to cache unique element,if it have repetitive element,return it
     * 3.About submit record
     *     3.1 2ms and 48.8MB memory in LeetCode China
     *     3.2 1ms and 37.5MB memory in LeetCode
     * 4.Q&A
     * @param A
     * @return
     */
    public int repeatedNTimes(int[] A) {
        Set<Integer> set=new HashSet<>();
        for(int temp:A){
            if(set.contains(temp)){
                return temp;
            }
            else{
                set.add(temp);
            }
        }
        return 0;
    }
}
