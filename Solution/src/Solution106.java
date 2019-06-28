import DataStructure.BinaryTreeNode;

/**
 * Problem
 *     106.Construct Binary Tree from Inorder and Postorder Traversal
 *     https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
 * Grade of difficulty
 *     Medium
 * Related topics
 *     105.Construct Binary Tree from Preorder and Inorder Traversal
 * @author cartoon
 * @version 1.0
 */
public class Solution106 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on inOrder and solution 105
     *     2.2 get root val's from postOrder array,circulate get it from inOrder array(inIndex)
     *     2.3 calculate left tree border(postIndex),reverse to build left and right tree
     * 3.About submit record
     *     3.1 32ms and 37.6MB memory in LeetCode China
     *     3.2 4ms and 36.1MB memory in LeetCode
     * 4.Q&A
     * @param inorder
     * @param postorder
     * @return
     */
    public BinaryTreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
    }

    private BinaryTreeNode build(int[] inOrder,int[] postOrder,int inStart,int inEnd,int postStart,int postEnd){
        if(inStart>inEnd||postStart>postEnd){
            return null;
        }
        int rootVal=postOrder[postEnd];
        int inIndex=inStart;
        for(;inIndex<=inEnd;inIndex++){
            if(inOrder[inIndex]==rootVal){
                break;
            }
        }
        int postIndex=inIndex-inStart+postStart;
        BinaryTreeNode left=build(inOrder,postOrder,inStart,inIndex-1,postStart,postIndex-1);
        BinaryTreeNode root=new BinaryTreeNode(rootVal);
        root.left=left;
        root.right=build(inOrder,postOrder,inIndex+1,inEnd,postIndex,postEnd-1);
        return root;
    }
}
