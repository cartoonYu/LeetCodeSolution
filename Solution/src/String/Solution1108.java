package String;

/**
 * Problem
 *     1108.Defanging an IP Address
 *     https://leetcode.com/problems/defanging-an-ip-address/
 *     https://leetcode-cn.com/problems/defanging-an-ip-address/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1108 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 简单的循环替换字符
     * 3.提交记录
     *   3.1 力扣中耗时 0ms,消耗 37.6MB 内存
     *   3.2 leetcode 中耗时 0ms,消耗 37.5MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 simple circulate and replace character
     * 3.About submit record
     *     3.1 0ms and 37.6MB memory in LeetCode China
     *     3.2 0ms and 37.5MB memory in LeetCode
     * 4.Q&A
     * @param address
     * @return
     */
    public String defangIPaddr(String address) {
        if(address == null || address.length() == 0){
            return address;
        }
        StringBuilder res = new StringBuilder();
        char[] chars = address.toCharArray();
        for(char ch : chars){
            res.append(ch == '.' ? "[.]" : ch);
        }
        return res.toString();
    }

}
