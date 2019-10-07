package Math;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Problem
 *     1018.Binary Prefix Divisible By 5
 *     https://leetcode.com/problems/binary-prefix-divisible-by-5/
 *     https://leetcode-cn.com/problems/binary-prefix-divisible-by-5/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1018 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 这个算法基于一个公式：num=num*2+current element，以下是我的推导过程
     *             2.1.1 最开始，num为0
     *             2.1.2 第一个元素为0，num等于0；第一个元素为1，num等于1
     *             2.1.3 下一个元素有四个情况
     *                    2.1.3.1 num为0，当前元素为0，num为0
     *                    2.1.3.2 num为0，当前元素为1，num为1
     *                    2.1.3.3 num为1，当前元素为0，num为2
     *                    2.1.3.4 num为1，当前元素为1，num为3
     *             2.1.4 当遍历到第三个元素时，有8种情况，你可以自己推导试试
     *     2.2 循环遍历第一个元素到最后一个元素，用2.1得出的公式计算当前的num
     * 3.提交记录
     *     3.1 力扣中耗时4ms,消耗41MB内存
     *     3.2 leetcode中耗时3ms,消耗39.9MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on one formula:num=num*2+current element,here is my infer
     *              2.1.1 at the beginning,num is 0
     *              2.1.2 first element is 0,num equals 0;first element is 1,num equals 1.
     *              2.1.3 there have four condition in next element
     *                     2.1.3.1 num is 0,current element is 0,num will be 0
     *                     2.1.3.2 num is 0,current element is 1,num will be 1
     *                     2.1.3.3 num is 1,current element is 0,num will be 2
     *                     2.1.3.4 num is 1,current element is 1,num will be 3
     *              2.1.4 when number of elements is 3,there have 8 condition,you can infer by yourself
     *     2.2 circulate 1 to A.length,use 2.1 formula to calculate current num and strives for the remainder
     * 3.About submit record
     *     3.1 4ms and 41MB memory in LeetCode China
     *     3.2 3ms and 39.9MB memory in LeetCode
     * 4.Q&A
     *     4.1 Q:why is so difference between this solution and another solution in leetcode china?
     *         A:I think is about the rule of computer calculation,computer is better at bit operation.
     * @param A
     * @return
     */
    public List<Boolean> prefixesDivBy52(int[] A) {
        if(A==null&&A.length==0){
            return Collections.emptyList();
        }
        int num=0;
        List<Boolean> list=new LinkedList<>();
        for(int i=0,length=A.length;i<length;i++){
            num=((num<<1)|A[i])%5;
            list.add(num==0);
        }
        return list;
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on one formula:num=num*2+current element,here is my infer
     *              2.1.1 at the beginning,num is 0
     *              2.1.2 first element is 0,num equals 0;first element is 1,num equals 1.
     *              2.1.3 there have four condition in next element
     *                     2.1.3.1 num is 0,current element is 0,num will be 0
     *                     2.1.3.2 num is 0,current element is 1,num will be 1
     *                     2.1.3.3 num is 1,current element is 0,num will be 2
     *                     2.1.3.4 num is 1,current element is 1,num will be 3
     *              2.1.4 when number of elements is 3,there have 8 condition,you can infer by yourself
     *     2.2 circulate 1 to A.length,use 2.1 formula to calculate current num and strives for the remainder
     * 3.About submit record
     *     3.1 8ms and 51.1MB memory in LeetCode China
     *     3.2 3ms and 39.8MB memory in LeetCode
     * 4.Q&A
     * @param A
     * @return
     */
    public List<Boolean> prefixesDivBy51(int[] A) {
        if(A==null&&A.length==0){
            return Collections.emptyList();
        }
        int num=0;
        List<Boolean> list=new LinkedList<>();
        for(int temp:A){
            num=(num*2+temp)%5;
            list.add(num==0);
        }
        return list;
    }
}
