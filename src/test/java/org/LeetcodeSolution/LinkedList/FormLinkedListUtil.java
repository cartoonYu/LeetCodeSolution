package org.LeetcodeSolution.LinkedList;

import org.LeetcodeSolution.DataStructure.linkedlist.ListNode;

/**
 * @author cartoon
 * @date 2021/3/9 18:50
 */
public class FormLinkedListUtil {

    private static FormLinkedListUtil instance;

    public ListNode form(int[] values){
        ListNode firstNode = new ListNode(-1);
        ListNode indexNode = firstNode;
        for(int value : values){
            ListNode temp = new ListNode(value);
            indexNode.next = temp;
            indexNode = indexNode.next;
        }
        return firstNode.next;
    }

    public static synchronized FormLinkedListUtil getInstance(){
        if(null == instance){
            synchronized (FormLinkedListUtil.class){
                if(null == instance){
                    instance = new FormLinkedListUtil();
                }
            }
        }
        return instance;
    }

    private FormLinkedListUtil(){}
}
