package org.LeetcodeSolution.Design;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem
 *     1357.Apply Discount Every n Orders
 *     https://leetcode.com/problems/apply-discount-every-n-orders/
 *     https://leetcode-cn.com/problems/apply-discount-every-n-orders/
 * Grade of difficulty
 *     Easy/Medium/Hard
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1357 {

    private int cnt;

    private int n;

    private double discount;

    private Map<Integer, Integer> map;

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 定义哈希存储商品以及对应的价钱
     *   2.2 当 getBill 被调用，循环传入的商品列表，通过哈希取出价钱并与数量相乘得到总额
     *   2.3 维持一个计数器，并用其与 n 取余的结果判断时候应该给折扣
     * 3.提交记录
     *   3.1 力扣中耗时 143ms,消耗 63.2MB 内存
     *   3.2 leetcode 中耗时 108ms,消耗 62.5MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define a hash to cache product and its price
     *     2.2 when getBill is called, circulate income product list, get price and multipart amount to get amount
     *     2.3 use current remind n to judge whether give a discount
     * 3.About submit record
     *     3.1 143ms and 63.2MB memory in LeetCode China
     *     3.2 108ms and 62.5MB memory in LeetCode
     * 4.Q&A
     *
     * @param n
     * @param discount
     * @param products
     * @param prices
     */
    public Solution1357(int n, int discount, int[] products, int[] prices) {
        this.n = n;
        cnt = 0;
        this.discount = 1 - (discount * 1.00000 / 100);
        map = new HashMap<>();
        for(int i = 0, length = products.length; i < length; i++){
            map.put(products[i], prices[i]);
        }
    }

    public double getBill(int[] product, int[] amount) {
        cnt++;
        int res = 0;
        for(int i = 0, length = product.length; i < length; i++){
            res += map.get(product[i]) * amount[i];
        }
        if(cnt % n == 0){
            return res * discount;
        } else{
            return res * 1.0;
        }
    }
}
