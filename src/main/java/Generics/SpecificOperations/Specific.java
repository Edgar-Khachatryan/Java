package Generics.SpecificOperations;

import java.util.Collection;
import java.util.List;

public class Specific {

    /**
     * counting odd integers from list
     *
     * @param arr
     * @param <N>
     * @return
     */

    public <N extends Number> int countOdd(Collection<N> arr) {

        int count = 0;

        for (N num : arr) {
            if (num.intValue() % 2 == 1) {
                count++;
            }
        }
        return count;

    }

    /**
     * counting prime strings from list
     * @param str
     * @return
     * @param <N>
     */


    public <N extends Number> int countPrime(List<String> str) {

        int count = 0;

        for (String word : str) {
            if (isPrime(String.valueOf(word))) {
                count++;
            }
        }
        return count;

    }

    /**
     * checking if string is prime
     * @param str
     * @return
     */

    public boolean isPrime(String str){
        String rev = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)){
            return true;
        }else {
            return false;
        }
    }


}
