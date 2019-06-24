
import DataStructure.BinaryTreeNode;

import java.util.*;

/**
 * Problem
 *      257.Binary Tree Paths
 *      https://leetcode.com/problems/binary-tree-paths/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution257 {

    private List<String> list;

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on preOrder of binary tree
     *     2.2 if current node isn't leaf,continuous accumulate its val
     *     2.3 if current node is null,add the string to a return list
     * 3.About submit record
     *     3.1 18ms and 43MB memory in LeetCode China
     *     3.2 6ms and 38.7MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public List<String> binaryTreePaths(BinaryTreeNode root) {
        if(root==null){
            return Collections.emptyList();
        }
        preOrder(root, "");
        return list;
    }

    private void preOrder(BinaryTreeNode root,String builder){
        if(root.left==null&&root.right==null){
            list.add(builder+root.val);
            return;
        }
        if(root.left!=null){
            preOrder(root.left,builder+root.val+"->");
        }
        if(root.right!=null){
            preOrder(root.right,builder+root.val+"->");
        }
    }

    public Solution257(){
        list=new ArrayList<>();
    }
}
