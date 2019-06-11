/**
 * Problem
 *      197.Rising Temperature
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution197 {

    /**
     * 1.how I solve
     *     2.1 use function DATEDIFF to compare recordDate
     *     2.2 compare temperate between two date and return id
     * 2.About submit record
     *     2.1 529ms in LeetCode China
     *     2.2 355ms in LeetCode
     * 4.Q&A
     */
    public void solution(){
        /**
         * select b.Id from Weather a,Weather b where b.Temperature>a.Temperature and DATEDIFF(b.RecordDate,a.RecordDate)=1;
         */
    }
}
