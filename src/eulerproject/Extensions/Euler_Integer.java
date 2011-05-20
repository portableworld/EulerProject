/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eulerproject.Extensions;

/**
 *
 * @author Charlie
 */
public class Euler_Integer {
    
    public static boolean isPrime(long num) {
        if (num < 2) return false;
        if (num == 2) return true;
        
        for (long i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    public static boolean isPalindrome(int num) {
        String num_string = Integer.toString(num);
        String[] num_array = num_string.split("");
        for (int i = 1; i < (num_array.length); i++) {
            if (!num_array[i].equals(num_array[num_array.length-i]))
                return false;
        }
        return true;
    }
}
