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
public class Problem_3 {
    /**
     * Problem 3 ---
     * 
     */
    
    // I did this in Ruby... how can I do it in Java??
    // Without checking every other number between 3 and num?
    public String Solve() {
        long result = 0;
        long num = 600851475143L;
        for (long i = 3; i < num; i+=2) {
            if (Euler_Integer.isPrime(num) && num % i == 0)
                result = i;
            System.out.println(i);
        }
        
        return "The solution is: " + result;
    }
}
