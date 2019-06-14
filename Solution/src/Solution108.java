import DataStructure.BinaryTreeNode;

/**
 * Problem
 *      108.Convert Sorted Array to Binary Search Tree
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution108 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on binary search
     *     2.2 build a root node whose val is array[mid]
     *     2.3 divide array into two part,recurse two part apart
     *     2.4 return root node
     * 3.About submit record
     *     3.1 1ms and 37.4MB memory in LeetCode China
     *     3.2 0ms and 37MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public BinaryTreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        return build(nums,0,nums.length-1);
    }

    private BinaryTreeNode build(int[] nums,int start,int end){
        if(start>end){
            return null;
        }
        int mid=start+((end-start)>>1);
        BinaryTreeNode root=new BinaryTreeNode(nums[mid]);
        root.left=build(nums,start,mid-1);
        root.right=build(nums,mid+1,end);
        return root;
    }
}
