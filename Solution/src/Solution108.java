import DataStructure.BinaryTreeNode;

/**
 * Problem
 *      108.Convert Sorted Array to Binary Search Tree
 *      https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 *      https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      109.Convert Sorted List to Binary Search Tree
 * @author cartoon
 * @version 1.0
 */
public class Solution108 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个算法基于二分查找
     *     2.2 根据左右指针获取当前情况的中间索引
     *     2.3 前序递归建立左右子树
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗37.4MB内存
     *     3.2 leetcode中耗时0ms,消耗37MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
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
