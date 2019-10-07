package Math;

/**
 * Problem
 *      1009.Complement of Base 10 Integer
 *      https://leetcode.com/problems/complement-of-base-10-integer/
 *      https://leetcode-cn.com/problems/complement-of-base-10-integer/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1009 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(log n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 循环计算N的二进制表示
     *     2.2 返回N的前length-N-1的二进制表示
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗32.9MB内存
     *     3.2 leetcode中耗时0ms,消耗32.3MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on a equation:res=N'binary representation length-N-1
     *     2.2 use a circulation to calculate N'binary representation
     *     2.3 return N'binary representation length-N-1
     * 3.About submit record
     *     3.1 1ms and 32.9MB memory in LeetCode China
     *     3.2 0ms and 32.3MB memory in LeetCode
     * 4.Q&A
     * @param N
     * @return
     */
    public int bitwiseComplement(int N) {
        if(N==0){
            return 1;
        }
        int sum=1;
        int temp=N;
        while(N!=0){
            sum=sum<<1;
            N=N>>1;
        }
        return sum-temp-1;
    }

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(log n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 将N转换成二进制表示
     *     2.2 循环遍历二进制表示逐位取反
     *     2.3 转换2.2的字符串成int返回
     * 3.提交记录
     *     3.1 力扣中耗时2ms,消耗32.8MB内存
     *     3.2 leetcode中耗时1ms,消耗32.1MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 change N to binary String
     *     2.2 circulate the binary String and take the bit by bit
     *     2.3 change binary string to integer
     * 3.About submit record
     *     3.1 2ms and 32.8MB memory in LeetCode China
     *     3.2 1ms and 32.1MB memory in LeetCode
     * 4.Q&A
     * @param N
     * @return
     */
    public int anotherSolutionWithBitByBit(int N){
        String temp=Integer.toBinaryString(N);
        StringBuilder builder=new StringBuilder();
        for(int i=0,length=temp.length();i<length;i++){
            builder.append(reverse(temp.charAt(i)));
        }
        Integer result=Integer.valueOf(builder.toString(),2);
        return result;
    }

    private char reverse(char source){
        switch(source){
            case '0':{
                return '1';
            }
            case '1':{
                return '0';
            }
        }
        return '0';
    }
}
