package org.LeetcodeSolution.Tree;

import org.LeetcodeSolution.DataStructure.tree.BinaryTreeNode;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Problem
 *     513.Find Bottom Left Tree Value
 *     https://leetcode.com/problems/find-bottom-left-tree-value/
 *     https://leetcode-cn.com/problems/find-bottom-left-tree-value/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution513 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个解法基于记录当前层数的DFS
     *     2.2 传统的先序遍历，当当前遍历结点没有孩子（叶结点），对比当前层数以及最大已遍历层数，设置结果val
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗38.8MB内存
     *     3.2 leetcode中耗时0ms,消耗39MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on record level DFS
     *     2.2 traditional preOrder,when current node hasn't children,compare current level and maximum level,set result val
     * 3.About submit record
     *     3.1 1ms and 38.8MB memory in LeetCode China
     *     3.2 0ms and 39MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public int findBottomLeftValueByDFS(BinaryTreeNode root) {
        max=0;
        res=0;
        preOrder(root,1);
        return res;
    }

    private int max;

    private int res;

    private void preOrder(BinaryTreeNode root,int curLevel){
        if(root.left==null&&root.right==null){
            if(curLevel>max){
                max=curLevel;
                res=root.val;
            }
        }
        if(root.left!=null){
            preOrder(root.left,curLevel+1);
        }
        if(root.right!=null){
            preOrder(root.right,curLevel+1);
        }
    }

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 这个解法基于BFS
     *     2.2 传统的BFS，但是在元素入队时右孩子先入队，左孩子后入队
     * 3.提交记录
     *     3.1 力扣中耗时4ms,消耗38.9MB内存
     *     3.2 leetcode中耗时1ms,消耗39.5MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on BFS
     *     2.2 define a queue and from right to left enqueue treeNode
     * 3.About submit record
     *     3.1 4ms and 38.9MB memory in LeetCode China
     *     3.2 1ms and 39.5MB memory in LeetCode
     * 4.Q&A
     *
     * @param root
     * @return
     */
    public int findBottomLeftValueByBFS(BinaryTreeNode root) {
        Deque<BinaryTreeNode> queue=new LinkedList<>();
        queue.addLast(root);
        while(queue.size()!=0){
            root=queue.pollFirst();
            if(root.right!=null){
                queue.addLast(root.right);
            }
            if(root.left!=null){
                queue.addLast(root.left);
            }
        }
        return root.val;
    }

}
