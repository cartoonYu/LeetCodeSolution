package String;

import java.util.LinkedList;
import java.util.List;

/**
 * Problem
 *     1592. Rearrange Spaces Between Words
 *     https://leetcode.com/problems/rearrange-spaces-between-words/
 *     https://leetcode-cn.com/problems/rearrange-spaces-between-words/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1592 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 循环遍历源字符串，计算空格数量以及形成词列表
     *   2.2 将空格插入到词列表中
     *       2.2.1 源字符串只含有一个词，将所有空格拼接到末尾
     *       2.2.2 源字符串含有多个词，计算两个词之间的空格数，循环词列表以及插入空格形成新字符串
     * 3.提交记录
     *   3.1 力扣中耗时 1ms,消耗 37MB 内存
     *   3.2 leetcode 中耗时 1ms,消耗 37.4MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 circulate source string to calculate space count and put each word to a list
     *     2.2 put space between word with two condition
     *         2.2.1 source string have only one word, put all space to this word end
     *         2.2.2 source string have multipart word, calculate each two word space count, circulate word list and put space
     * 3.About submit record
     *     3.1 1ms and 37MB memory in LeetCode China
     *     3.2 1ms and 37.4MB memory in LeetCode
     * 4.Q&A
     * @param text
     * @return
     */
    public String reorderSpaces(String text) {
        int spaceCnt = 0;
        List<String> wordList = new LinkedList<>();
        StringBuilder builder = new StringBuilder();
        for(char ch : text.toCharArray()){
            if(ch == ' '){
                spaceCnt += 1;
                if(builder.length() != 0){
                    wordList.add(builder.toString());
                    builder = new StringBuilder();
                }
            } else{
                builder.append(ch);
            }
        }
        if(builder.length() != 0){
            wordList.add(builder.toString());
        }
        if(spaceCnt == 0){
            return text;
        }
        builder = new StringBuilder();
        if(wordList.size() == 1){
            builder.append(wordList.get(0));
            for(int i = 0; i < spaceCnt; i++){
                builder.append(' ');
            }
        } else{
            int perSpaceCnt = spaceCnt / (wordList.size() - 1);
            for(String word : wordList){
                builder.append(word);
                if(spaceCnt < perSpaceCnt){
                    for(int i = 0; i < spaceCnt; i++){
                        builder.append(' ');
                    }
                    spaceCnt = 0;
                } else{
                    for(int i = 0; i < perSpaceCnt; i++){
                        builder.append(' ');
                    }
                    spaceCnt -= perSpaceCnt;
                }
            }
            if(spaceCnt != 0){
                for(int i = 0; i < spaceCnt; i++){
                    builder.append(' ');
                }
            }
        }
        return builder.toString();
    }
}
