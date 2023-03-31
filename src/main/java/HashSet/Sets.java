package HashSet;

import java.time.Period;
import java.util.*;

public class Sets {

    /**
     * finding common elements from 2 HashSets
     * @param firstHash
     * @param secondHash
     * @return
     */

    public HashSet<Integer> CommonElements(HashSet<Integer> firstHash, HashSet<Integer> secondHash){

        HashSet<Integer> common = new HashSet<>();

        for (Integer first: firstHash){
            if (secondHash.contains(first)){
                common.add(first);
            }
        }
        return common;

    }

    /**
     * returning unique words from 2 HashSet strings
     * @param uniques
     * @return
     */

    public HashSet<String> findUniques(HashSet<String> uniques){

        HashSet<String> uniqueWords = new HashSet<>();
        for (String uniq: uniques){
            if (!uniqueWords.contains(uniq.toLowerCase())){
                uniqueWords.add(uniq.toLowerCase());
            }
        }

        return uniqueWords;

    }

    /**
     * removing even numbers from LinkedHashSet
     * @param nums
     */

    public void removeEven(LinkedHashSet<Integer> nums){
        Iterator<Integer> iter = nums.iterator();
        while (iter.hasNext()){
            int even = iter.next();
            if (even%2 == 0){
                iter.remove();
            }
        }
        System.out.println(nums);

    }

    /**
     * removing duplicate names from LinkHashSet
     * @param people
     */

    public void removeDuplicates(LinkedHashSet<Human> people){

        HashSet<String> names = new HashSet<>();

        Iterator<Human> iter = people.iterator();
        while (iter.hasNext()){
            Human human = iter.next();
            if (!names.contains(human.getName())){
                names.add(human.getName());
            }else {
                iter.remove();
            }
        }

    }




}
