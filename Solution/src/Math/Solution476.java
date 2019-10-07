package Math;

/**
 * Problem
 *      476. Number Complement
 *      https://leetcode.com/problems/number-complement/
 *      https://leetcode-cn.com/problems/number-complement/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution476 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 计算num的位数
     *     2.2 对num的位置以及num进行异或运算后返回
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗32.7MB内存
     *     3.2 leetcode中耗时0ms,消耗32.4MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 cal digit with num
     *     2.2 use xor operation with num and digit
     * 3.About submit record
     *     3.1 1ms and 32.7MB memory in LeetCode China
     *     3.2 0ms and 32.4MB memory in LeetCode
     * 4.Q&A
     * @param num
     * @return
     */
    public int findComplement(int num) {
        int temp=num,count=0;
        while(temp>0){
            temp=temp>>1;
            count=(count<<1)+1;
        }
        return num^count;
    }

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 将num转换成二进制字符串
     *     2.2 循环取反每个元素
     *     2.3 将2.2转换字符串转成int输出
     * 3.提交记录
     *     3.1 力扣中耗时3ms,消耗32.8MB内存
     *     3.2 leetcode中耗时1ms,消耗32.2MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 turn num to a binary string
     *     2.2 circulate the binary string to negate every character
     *     2.3 turn the negative string to a num
     * 3.About submit record
     *     3.1 3ms and 32.8MB memory in LeetCode China
     *     3.2 1ms and 32.2MB memory in LeetCode
     * 4.Q&A
     * @param num
     * @return
     */
    public int findComplementWithString(int num) {
        String s=Integer.toBinaryString(num);
        StringBuilder temp=new StringBuilder();
        for(int i=0,length=s.length();i<length;i++){
            char c=s.charAt(i);
            if(c=='0'){
                temp.append('1');
            }
            else{
                temp.append('0');
            }
        }
        return Integer.valueOf(temp.toString(),2);
    }
}
