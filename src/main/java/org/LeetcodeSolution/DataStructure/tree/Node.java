package org.LeetcodeSolution.DataStructure.tree;

/**
 * @author cartoon
 * @description
 * @date 2020/10/3 10:46
 */
public class Node {

    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }

}
