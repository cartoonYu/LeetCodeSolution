/**
 * Problem
 *      167.Two Sum II - Input array is sorted
 *      https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 *      https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      153.Find Minimum in Rotated Sorted Array
 *      367.Valid Perfect Square
 *      374.Guess Number Higher or Lower
 * @author cartoon
 * @version 1.0
 */
public class Solution167 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 解法的主要思想：双指针遍历数组
     *     2.2 定义左右指针分别从开头及结尾遍历
     *     2.3 循环直到左指针>右指针找到array[i]+array[j]=target
     *     2.4 如果相加值大于target，右指针向左移；相加值小于target，左指针右移
     *     2.5 返回目标数组
     * 3.提交记录
     *     3.1 力扣中耗时2ms,消耗37.7MB内存
     *     3.2 leetcode中耗时1ms,消耗37.3MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 main solution:two pointer to circulate the array
     *     2.2 define a integer i whose val is zero and a integer j whose val is array's length-1
     *     2.3 circulate when i<j to sound out if array[i]+array[j]=target
     *     2.4 if array[i]+array[j]<target,i++;if array[i]+array[j]>target,j--;
     *     2.5 return result array
     * 3.About submit record
     *     3.1 2ms and 37.7MB memory in LeetCode China
     *     3.2 1ms and 37.3MB memory in LeetCode
     * 4.Q&A
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        int i=0,j=numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                result[0]=i+1;
                result[1]=j+1;
                break;
            }
            else{
                if(numbers[i]+numbers[j]<target){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        return result;
    }
}
