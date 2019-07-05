import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Problem
 *     116.Populating Next Right Pointers in Each Node
 *     https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution116 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on preOrder
     *     2.2 set a end condition:root==null||root.left==null
     *     2.3 set root.left.next to root right
     *     2.4 judge whether root.next is null,if not null,set root.right.next=root.next.left
     *     2.5 recurse left tree and right tree and return root
     * 3.About submit record
     *     3.1 0ms and 35.3MB memory in LeetCode China
     *     3.2 0ms and 35.9MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public Node connectByPreOrder(Node root) {
        if(root==null||root.left==null){
            return root;
        }
        root.left.next=root.right;
        if(root.next!=null){
            root.right.next=root.next.left;
        }
        connectByPreOrder(root.left);
        connectByPreOrder(root.right);
        return root;
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on level order
     *     2.2 define a queue(cache all node),a list(cache node from each floor),a integer(cache current queue size),a node(cache last circulation node)
     *     2.3 get all node from queue and put them to list
     *     2.4 circulate to get list's element
     *          2.4.1 add children(right children first,left children last) to queue
     *          2.4.2 judge whether i is 0
     *                  2.4.2.1 i=0,set lastNode to current node
     *                  2.4.2.2 i!=0,set current node.next to lastNode and lastNode to temp
     *     2.5 clear list and make lastNode to null
     * 3.About submit record
     *     3.1 1ms and 35.4MB memory in LeetCode China
     *     3.2 1ms and 36.1MB memory in LeetCode
     * 4.Q&A
     * @param root
     * @return
     */
    public Node connectByLevelOrder(Node root) {
        if(root==null){
            return root;
        }
        Deque<Node> queue=new LinkedList<>();
        List<Node> list=new ArrayList<>();
        Node lastNode=null;
        int size;
        queue.offerLast(root);
        while(queue.size()!=0){
            size=queue.size();
            for(int i=0;i<size;i++){
                list.add(queue.pollFirst());
            }
            for(int i=0;i<list.size();i++){
                Node temp=list.get(i);
                if(temp.right!=null){
                    queue.offerLast(temp.right);
                }
                if(temp.left!=null){
                    queue.offerLast(temp.left);
                }
                if(i==0){
                    lastNode=temp;
                }
                else{
                    temp.next=lastNode;
                    lastNode=temp;
                }
            }
            lastNode=null;
            list.clear();
        }
        return root;
    }
}

class Node{
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
