/**
 * Problem
 *     482.License Key Formatting
 *     https://leetcode.com/problems/license-key-formatting/
 *     https://leetcode-cn.com/problems/license-key-formatting/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution482 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 从尾到头遍历字符串，有4种情况
     *         2.1.1 当前元素为-，跳过
     *         2.1.2 当前元素为数字，直接append
     *         2.1.3 当前元素为字母，append它的大写字母
     *         2.1.4 当前分段已满，重置计数器以及append一个-
     *     2.2 反转整个StringBuilder以及当首字母为-时去掉
     * 3.提交记录
     *     3.1 力扣中耗时26ms,消耗42.2MB内存
     *     3.2 leetcode中耗时12ms,消耗36.9MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 circulate from tail to head,there have four condition
     *         2.1.1 current element is -,skip it
     *         2.1.2 current element is digit,append it directly
     *         2.1.3 current element is letter,append its uppercase
     *         2.1.4 current subsection is full,reset counter and append -
     *     2.2 reverse whole StringBuilder and divide first element when it is a -
     * 3.About submit record
     *     3.1 26ms and 42.2MB memory in LeetCode China
     *     3.2 12ms and 36.9MB memory in LeetCode
     * 4.Q&A
     *
     * @param S
     * @param K
     * @return
     */
    public String licenseKeyFormatting(String S, int K) {
        if(S==null||S.length()==0){
            return S;
        }
        int cnt=0;
        StringBuilder builder=new StringBuilder();
        for(int i=S.length()-1;i>=0;i--){
            char temp=S.charAt(i);
            if(temp=='-'){
                continue;
            }
            else{
                if(Character.isDigit(temp)){
                    builder.append(temp);
                }
                else{
                    builder.append(Character.toUpperCase(temp));
                }
                cnt++;
                if(cnt==K){
                    builder.append('-');
                    cnt=0;
                }
            }
        }
        if(builder.length()>1&&builder.charAt(builder.length()-1)=='-'){
            builder=builder.reverse();
            return builder.substring(1);
        }
        return builder.reverse().toString();
    }
}
