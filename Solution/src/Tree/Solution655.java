package Tree;

import DataStructure.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem
 *     655.Print Binary Tree
 *     https://leetcode.com/problems/print-binary-tree/
 *     https://leetcode-cn.com/problems/print-binary-tree/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution655 {

    private List<List<String>> res;

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 根据示例的结果，我们应该求出树的最大宽度
     *     2.2 因为我们需要求出最大宽度，满二叉树的宽度是最大的，所以我们可以通过求出树的最大深度进而求出最大宽度
     *     2.3 调用getDepth求出树的最大深度
     *     2.4 根据树的高度初始化结果list
     *     2.5 根据示例的表示，我们可以推断出结果应该是一个二分查找的形式
     *     2.6 对树使用前序遍历，记录层数并使用二分查找决定元素最终位置
     * 3.提交记录
     *     3.1 力扣中耗时3ms,消耗37.6MB内存
     *     3.2 leetcode中耗时1ms,消耗36.4MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 according to result of test case,we should calculate max width of tree
     *     2.2 cause our target is to cal max width,so we can use a full binary tree rule:width=2^(height-1)
     *     2.3 cal getDepth to get tree height
     *     2.4 use height to init result list
     *     2.5 with test case presentation,we can get the finally result is a binary search presentation
     *     2.6 usr preOrder traversal and binary search related to level to form final list
     * 3.About submit record
     *     3.1 3ms and 37.6MB memory in LeetCode China
     *     3.2 1ms and 36.4MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public List<List<String>> printTree(BinaryTreeNode root) {
        if(root==null){
            return Collections.emptyList();
        }
        res=new ArrayList<>();
        int level=getLevel(root);
        init(level);
        preOrder(root,0,res.get(0).size(),0);
        return res;
    }

    private void preOrder(BinaryTreeNode root,int left,int right,int depth){
        if(root==null||left>right){
            return;
        }
        int mid=left+((right-left)>>1);
        res.get(depth).set(mid,Integer.toString(root.val));
        preOrder(root.left,left,mid-1,depth+1);
        preOrder(root.right,mid+1,right,depth+1);
    }

    private void init(int level){
        int width=(int)Math.pow(2,level)-1;
        for(int i=0;i<level;i++){
            List<String> list=new ArrayList<>(width);
            for(int j=0,size=width;j<size;j++){
                list.add("");
            }
            res.add(new ArrayList<>(list));
        }
    }

    private int getLevel(BinaryTreeNode root){
        if (root == null) return 0;
        return Math.max(getLevel(root.left), getLevel(root.right)) + 1;
    }
}
