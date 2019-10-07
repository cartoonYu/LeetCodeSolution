package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem
 *      46.Permutations
 *      https://leetcode.com/problems/permutations/
 * Grade of difficulty
 *      Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution46 {

    private List<List<Integer>> list;

    private int[] nums;

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n!)
     *     1.2 Space Complexity is O(n!)
     * 2.how I solve
     *     2.1 use recursion to get full permutation
     *     2.2 use a increase num as a end condition
     * 3.About submit record
     *     3.1 5ms and 41.5MB memory in LeetCode China
     *     3.2 1ms and 39.2MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length==0){
            return list;
        }
        this.nums=nums;
        perm(0,this.nums.length-1);
        return list;
    }

    private void perm(int k,int m){
        if(k==m){
            List<Integer> temp=new ArrayList<>();
            for(int i:nums){
                temp.add(i);
            }
            list.add(temp);
        }
        else{
            for(int i=k;i<=m;i++){
                swap(k,i);
                perm(k+1,m);
                swap(k,i);
            }
        }
    }

    private void swap(int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public Solution46(){
        list=new ArrayList<>();
    }
}
