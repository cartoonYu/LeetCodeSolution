package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem
 *      989.Add to Array-Form of Integer
 *      https://leetcode.com/problems/add-to-array-form-of-integer/
 *      https://leetcode-cn.com/problems/add-to-array-form-of-integer/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution989 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 将k转换成数组
     *   2.2 定义结果数组，长度为两个数组长度较大值加1
     *   2.3 循环两个原始数组相加他们的值
     *   2.4 翻转结果数组转换成 list 返回
     * 3.提交记录
     *   3.1 力扣中耗时 13ms,消耗 53MB 内存
     *   3.2 leetcode 中耗时 4ms,消耗 40.7MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 turn K to a digit array
     *     2.2 set a array whose length is the bigger of two original array's length plus 1
     *     2.3 circulate two original array to plus value
     *     2.4 reverse the be set array to a list to return
     * 3.About submit record
     *     3.1 13ms and 53MB memory in LeetCode China
     *     3.2 4ms and MB 40.7memory in LeetCode
     * 4.Q&A
     * @param A
     * @param K
     * @return
     */
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> list=new ArrayList<>();
        int power=1;
        while(K!=0){
            int temp=K%(int)(Math.pow(10,power));
            K-=temp;
            temp=temp/(int)(Math.pow(10,power-1));
            list.add(temp);
            power++;
        }
        int[] nums=new int[A.length>list.size()?A.length+1:list.size()+1];
        int i=A.length-1,j=0,k=0;
        int sum=0;
        while(i>=0||j<list.size()){
            if(i>=0){
                sum+=A[i--];
            }
            if(j<list.size()){
                sum+=list.get(j++);
            }
            if(sum>9){
                nums[k]+=sum%10;
                nums[k+1]+=1;
            }
            else{
                nums[k]+=sum;
            }
            if(nums[k]>9){
                nums[k]=nums[k]%10;
                nums[k+1]+=1;
            }
            k++;
            sum=0;
        }
        List<Integer> res=new ArrayList<>();
        if(nums[nums.length-1]!=0){
            res.add(nums[nums.length-1]);
        }
        for(int l=nums.length-2;l>=0;l--){
            res.add(nums[l]);
        }
        return res;
    }
}
