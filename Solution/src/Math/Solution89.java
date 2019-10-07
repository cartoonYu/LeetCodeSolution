package Math;

import java.util.LinkedList;
import java.util.List;

/**
 * Problem
 *     89.Gray Code
 *     https://leetcode.com/problems/gray-code/
 *     https://leetcode-cn.com/problems/gray-code/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution89 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 这个解法基于一条公式：G(i)=i^i>>1
     *     2.2 定义循环计算格雷编码
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗34.3MB内存
     *     3.2 leetcode中耗时0ms,消耗34.2MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on one rule:G(i)=i^i>>1
     *     2.2 define a circulation to calculate gray code
     * 3.About submit record
     *     3.1 1ms and 34.3MB memory in LeetCode China
     *     3.2 0ms and 34.2MB memory in LeetCode
     * 4.Q&A
     * @param n
     * @return
     */
    public List<Integer> grayCode(int n) {
        List<Integer> list=new LinkedList<>();
        for(int i=0;i<1<<n;i++){
            list.add(i^i>>1);
        }
        return list;
    }
}
