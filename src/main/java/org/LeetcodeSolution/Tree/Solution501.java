package org.LeetcodeSolution.Tree;


import org.LeetcodeSolution.DataStructure.tree.BinaryTreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Problem
 *     501.Find Mode in Binary Search Tree
 *     https://leetcode.com/problems/find-mode-in-binary-search-tree/
 *     https://leetcode-cn.com/problems/find-mode-in-binary-search-tree/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution501 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 我觉得这道题的关键是在BST上，中序遍历BST可以得到升序的数组，而这个意味着我们可以利用升序数组的特性进行解题
     *     2.2 定义四个变量
     *         2.2.1 list，用来存储最终结果
     *         2.2.2 pre，上一个遍历的元素
     *         2.2.3 cnt，当前元素重复的次数
     *         2.2.4 max，当前最大的元素重复次数
     *     2.3 传统中序遍历，只是遍历当前节点的值进行我们的众数的求解，分为两个情况
     *         2.3.1 pre等于当前节点的值，cnt加1
     *         2.3.2 pre不等于当前节点的值，cnt置1，pre置为当前节点的值
     *     2.4 对比cnt以及max的值，有两种情况
     *         2.4.1 cnt=max，将pre加入到结果list中
     *         2.4.2 cnt>max，新的众数诞生，清空当前list，将pre加入到list中
     * 3.提交记录
     *     3.1 力扣中耗时2ms,消耗41.4MB内存
     *     3.2 leetcode中耗时1ms,消耗37.8MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 I think the key of this topic is BST,inOrder traverse will get the ASC array,it means we can cal mode with this sequence
     *     2.2 define four variable
     *         2.2.1 list,record final result
     *         2.2.2 pre,record last traverse node's val
     *         2.2.3 cnt,current mode count
     *         2.2.4 max,maximum count of mode
     *     2.3 traditional inOrder traversal,only operate with current node'val,there have two condition
     *         2.3.1 pre is equals current val,set cnt to cnt+1
     *         2.3.2 pre isn't equals current val,set cnt to 1,pre to current val
     *     2.4 compare cnt to max,there have two condition to operate
     *         2.4.1 cnt==max,add pre to result list
     *         2.4.2 cnt>max,clear list and add pre to result list
     * 3.About submit record
     *     3.1 2ms and 41.4MB memory in LeetCode China
     *     3.2 1ms and 37.8MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public int[] findMode(BinaryTreeNode root) {
        if(root==null){
            return new int[0];
        }
        list=new LinkedList<>();
        inOrder(root);
        int[] res=new int[list.size()];
        for(int i=0,size=list.size();i<size;i++){
            res[i]=list.get(i);
        }
        return res;
    }

    private List<Integer> list;

    private int pre;

    private int cnt;

    private int max;

    private void inOrder(BinaryTreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        if(pre==root.val){
            cnt++;
        }
        else{
            cnt=1;
            pre=root.val;
        }
        if(cnt==max){
            list.add(root.val);
        }
        else if(cnt>max){
            list.clear();
            list.add(root.val);
            max=cnt;
        }
        inOrder(root.right);
    }
}
