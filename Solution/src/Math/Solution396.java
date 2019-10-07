package Math;

/**
 * Problem
 *     396.Rotate Function
 *     https://leetcode.com/problems/rotate-function/
 *     https://leetcode-cn.com/problems/rotate-function/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution396 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 定义三个成员变量
     *         2.1.1 max，返回的结果
     *         2.1.2 sum，所有元素相加的结果
     *         2.1.3 temp，元素与索引相乘相加的结果
     *     2.2 倒序遍历
     *         2.2.1 利用temp对比更新max
     *         2.2.2 有一个规律，每一次循环都会减掉最后的元素与索引的乘值，加上除了最后的所有元素
     *         2.2.3 根据2.2.2的规律调整temp的值
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗39.4MB内存
     *     3.2 leetcode中耗时2ms,消耗37.9MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 define three variable to record
     *         2.1.1 max,result for return
     *         2.1.2 sum,array element plus result
     *         2.1.3 temp,array element and index plus result
     *     2.2 circulate form tail and head
     *         2.2.1 compare max with temp and update result
     *         2.2.2 there have a rule,every circulate will cut last element and its index plus result and add all element once except last element
     *         2.2.3 according to 2.2.2 rule,adjust temp
     * 3.About submit record
     *     3.1 1ms and 39.4MB memory in LeetCode China
     *     3.2 2ms and 37.9MB memory in LeetCode
     * 4.Q&A
     * @param A
     * @return
     */
    public int maxRotateFunction(int[] A) {
        if(A==null||A.length<2){
            return 0;
        }
        int length=A.length,max=Integer.MIN_VALUE,sum=0,temp=0;
        for(int i=0;i<length;i++){
            sum+=A[i];
            temp+=A[i]*i;
        }
        for(int i=length-1;i>=0;i--){
            max=Math.max(temp,max);
            temp=temp+sum-length*A[i];
        }
        return max;
    }

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n^2)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 定义一个数组以及用索引值初始化值
     *     2.2 正向遍历
     *         2.2.1 将2.1定义的数组与当前元素相乘，对比更新返回的result
     *         2.2.2 按照题目意思更新2.1的值
     * 3.提交记录
     *     3.1 力扣中耗时1139ms,消耗38.8MB内存
     *     3.2 leetcode中耗时826ms,消耗39MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define a array and mark init val by index
     *     2.2 circulate 1 to array.length
     *         2.2.1 plus every element and 2.1 array,and compare and set result
     *         2.2.2 circulate to change 2.1 array with topic mean
     * 3.About submit record
     *     3.1 1139ms and 38.8MB memory in LeetCode China
     *     3.2 826ms and 39MB memory in LeetCode
     * 4.Q&A
     * @param A
     * @return
     */
    public int maxRotateFunction1(int[] A) {
        if(A==null||A.length<2){
            return 0;
        }
        int[] nums=new int[A.length];
        int length=A.length,max=Integer.MIN_VALUE,temp;
        for(int i=0;i<length;i++){
            nums[i]=i;
        }
        for(int i=0;i<length;i++){
            temp=0;
            for(int j=0;j<length;j++){
                temp+=nums[j]*A[j];
            }
            max=Math.max(temp,max);
            for(int j=0;j<length;j++){
                if(nums[j]==length-1){
                    nums[j]=0;
                }
                else{
                    nums[j]++;
                }
            }
        }
        return max;
    }
}
