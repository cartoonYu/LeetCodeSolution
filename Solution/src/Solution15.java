import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Problem
 *     15.3Sum
 *     https://leetcode.com/problems/3sum/
 *     https://leetcode-cn.com/problems/3sum/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution15 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n^2)
     *     1.2 空间负责度为O(?)，很难表达，需要根据实际数据
     * 2.我的解题思路
     *     2.1 根据题意，当数组长度小于3，返回空list
     *     2.2 我的大概解题思想
     *         2.2.1 循环遍历所有小于0的元素
     *         2.2.2 双指针遍历当前索引右面的所有元素，所以本质上还是一个双指针遍历算法
     *     2.3 排序数组
     *     2.4 定义双指针当循环中时遍历右面元素
     *     2.5 遍历数组，总共有三个情况
     *         2.5.1 当前元素大于0，表示后面的遍历没有可能形成题目要求的结果
     *         2.5.2 当前元素等于上一元素，跳过该循环
     *         2.5.3 左指针从当前位置的右一个位置开始遍历，右指针从数组最右边开始遍历
     * 3.提交记录
     *     3.1 力扣中耗时61ms,消耗56.2MB内存
     *     3.2 leetcode中耗时27ms,消耗48.7MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(?),it is hard to judge
     * 2.how I solve
     *     2.1 according to topic,return empty list when array length is smaller than 3
     *     2.2 my solute mind
     *         2.2.1 traverse all element which are smaller than 0
     *         2.2.2 define two pointer to traverse right index behind current index,so it is a two-pointer solution in fact
     *     2.3 sort array for more easier to calculate
     *     2.4 define two pointer to traverse array when traverse array
     *     2.5 traverse array from head to tail,there have three condition
     *         2.5.1 when current element is bigger than 0,it means it hasn't possibility to form a zero result
     *         2.5.2 when current element is equals to last element,skip it
     *         2.5.3 one pointer is traverse from current +1 index,one pointer is traverse from rightmost in array
     * 3.About submit record
     *     3.1 61ms and 56.2MB memory in LeetCode China
     *     3.2 27ms and 48.7MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null||nums.length<3){
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        int left,right,temp;
        List<List<Integer>> list=new LinkedList<>();
        for(int cur=0,length=nums.length;cur<length;cur++){
            if(nums[cur]>0){
                break;
            }
            if(cur>0&&nums[cur]==nums[cur-1]){
                continue;
            }
            left=cur+1;
            right=length-1;
            while(left<right){
                temp=nums[cur]+nums[left]+nums[right];
                if(temp==0){
                    list.add(Arrays.asList(nums[cur],nums[left],nums[right]));
                    while(left<right&&nums[left]==nums[left+1]){
                        left++;
                    }
                    while(left<right&&nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }
                else if(temp>0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return list;
    }
}
