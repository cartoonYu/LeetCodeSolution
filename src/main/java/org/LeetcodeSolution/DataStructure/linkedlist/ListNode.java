package org.LeetcodeSolution.DataStructure.linkedlist;

public class ListNode {

    public int val;

    public ListNode next;

    public ListNode(int val){
        this.val=val;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(ListNode.class.isAssignableFrom(obj.getClass())){
            return ((ListNode) obj).val == val;
        }
        return (this == obj);
    }

    @Override
    public String toString() {
        return Integer.toString(val);
    }
}
