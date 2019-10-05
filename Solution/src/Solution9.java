/**
 * Problem
 *     9.Palindrome Number
 *     https://leetcode.com/problems/palindrome-number/
 *     https://leetcode-cn.com/problems/palindrome-number/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution9 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 排除能被10整除的数或者负数
     *     2.2 循环构建与传入数相反的数
     *     2.3 判断传入数与构建数是否相等
     * 3.提交记录
     *     3.1 力扣中耗时9ms,消耗36.3MB内存
     *     3.2 leetcode中耗时7ms,消耗35.8MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 exclude negative number and every element which can exact divide 10
     *     2.2 circulate to form a new number which is opposite with source number
     *     2.3 judge whether two number is the same or x==temp/10
     * 3.About submit record
     *     3.1 9ms and 36.3MB memory in LeetCode China
     *     3.2 7ms and 35.8MB memory in LeetCode
     * 4.Q&A
     *
     * @param x
     * @return
     */
    public boolean isPalindrome2(int x) {
        if(x<0||(x%10==0&&x!=0)){
            return false;
        }
        int temp=0;
        while(x>temp){
            temp=temp*10+x%10;
            x=x/10;
        }
        return x==temp||x==temp/10;
    }

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 将传入数字转换成字符串
     *     2.2 双指针遍历字符，若当前两个字符不相等返回false
     * 3.提交记录
     *     3.1 力扣中耗时10ms,消耗36.2MB内存
     *     3.2 leetcode中耗时8ms,消耗36.4MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 transfer source number to char array
     *     2.2 two pointer to go though with left and right,if current two char is not the same,return false
     * 3.About submit record
     *     3.1 10ms and 36.2MB memory in LeetCode China
     *     3.2 8ms and 36.4MB memory in LeetCode
     * 4.Q&A
     *
     * @param x
     * @return
     */
    public boolean isPalindrome1(int x) {
        char[] chars=Integer.toString(x).toCharArray();
        int i=0,j=chars.length-1;
        while(i<j){
            if(chars[i]==chars[j]){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
