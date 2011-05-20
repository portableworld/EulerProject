/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eulerproject.Problems;

import eulerproject.Extensions.Euler_Integer;

/**
 *
 * @author Charlie
 */
public class Problem_4 {
    /**
     * Problem 4 ---
     * A palindromic number reads the same both ways. 
     * The largest palindrome made from the product of two 
     * 2-digit numbers is 9009 = 91  99.
     * Find the largest palindrome made from the product of two 3-digit numbers.
     */
    public String Solve() {
        int result = 0;
        int value1 = 100;
        int value2 = 100;
        
        while(value2 < 1000) {
            int product = value1 * value2;
            if (Euler_Integer.isPalindrome(product))
                if(product > result)
                    result = product;
            value1++;
            if (value1 == 1000) {
                value1 = 100;
                value2++;
            }
        }
        return "The solution is: " + result;
    }
}
