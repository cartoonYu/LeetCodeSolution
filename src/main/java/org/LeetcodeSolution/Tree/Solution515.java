package org.LeetcodeSolution.Tree;

import org.LeetcodeSolution.DataStructure.tree.BinaryTreeNode;

import java.util.*;

/**
 * Problem
 *     515.Find Largest Value in Each Tree Row
 *     https://leetcode.com/problems/find-largest-value-in-each-tree-row/
 *     https://leetcode-cn.com/problems/find-largest-value-in-each-tree-row/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution515 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个解法基于深度优先遍历
     *     2.2 定义一个变量记录当前遍历的层数
     *         2.2.1 list的大小等于当前层数，将当前遍历结点的值加入list中
     *         2.2.2 list的大小不等于当前层数，对比并替换list中相应位置的值
     * 3.提交记录
     *     3.1 力扣中耗时4ms,消耗40.6MB内存
     *     3.2 leetcode中耗时1ms,消耗38.7MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on depth traversal
     *     2.2 set a increase integer to record floor
     *         2.2.1 when cache integer is equals to list's size,it means current node is in a floor which haven't traverse,add root's val to list
     *         2.2.2 when cache integer isn't equals to list's size,compare and set corresponding index of list's val
     * 3.About submit record
     *     3.1 4ms and 40.6MB memory in LeetCode China
     *     3.2 1ms and 38.7MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public List<Integer> largestValuesByDepthTraversal(BinaryTreeNode root) {
        list=new ArrayList<>();
        preOrder(root,0);
        return list;
    }

    private List<Integer> list;

    private void preOrder(BinaryTreeNode root,int level){
        if(root==null){
            return;
        }
        if(list.size()==level){
            list.add(root.val);
        }
        else if(root.val>list.get(level)){
            list.set(level,root.val);
        }
        preOrder(root.left,level+1);
        preOrder(root.right,level+1);
    }

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个解法基于广度优先遍历，定义需要使用的四个变量
     *         2.1.1 list，用于记录返回的结果
     *         2.1.2 queue，用于缓存待遍历的结点
     *         2.1.3 size，记录当前层数的结点数
     *         2.1.4 temp,记录当前层的最大值
     *     2.2 简单的层次遍历，分别遍历每一层的结点，对比加入当前层的最大值到结果list中
     * 3.提交记录
     *     3.1 力扣中耗时5ms,消耗39.2MB内存
     *     3.2 leetcode中耗时2ms,消耗39.8MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on sequence traversal,it needs four temp variable
     *         2.1.1 List,to return result
     *         2.1.2 Queue,cache traverse node
     *         2.1.3 size,record queue length every floor
     *         2.1.4 temp,record max value every floor
     *     2.2 simple sequence traversal,go though every floor of tree,add their left and right children tree to queue
     *     2.3 compare each node to temp,add temp to result list
     * 3.About submit record
     *     3.1 5ms and 39.2MB memory in LeetCode China
     *     3.2 2ms and 39.8MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public List<Integer> largestValuesBySequenceTraversal(BinaryTreeNode root) {
        if(root==null){
            return Collections.emptyList();
        }
        List<Integer> list=new LinkedList<>();
        Deque<BinaryTreeNode> queue=new LinkedList<>();
        queue.addLast(root);
        int size=0,temp=Integer.MIN_VALUE;
        while(queue.size()!=0){
            size=queue.size();
            for(int i=0;i<size;i++){
                BinaryTreeNode node=queue.pollFirst();
                temp=temp>node.val?temp:node.val;
                if(node.left!=null){
                    queue.addLast(node.left);
                }
                if(node.right!=null){
                    queue.addLast(node.right);
                }
            }
            list.add(temp);
            temp=Integer.MIN_VALUE;
        }
        return list;
    }
}
