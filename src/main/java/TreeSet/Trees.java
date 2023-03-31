package TreeSet;

import java.util.TreeSet;

public class Trees {

    /**
     * removing common values from TreeSet
     * @param first
     * @param second
     * @return
     */

    public TreeSet<Integer> containFirst(TreeSet<Integer> first, TreeSet<Integer> second){

        TreeSet<Integer> common = new TreeSet<>(first);
        common.removeAll(second);

        return common;

    }

    /**
     * returning unique words from TreeSet
     * @param words
     * @return
     */

    public TreeSet<String> uniqueWords(TreeSet<String> words){
        TreeSet<String> uniques = new TreeSet<>();
        for (String word: words){
            uniques.add(word.toLowerCase());
        }
        return uniques;

    }

}
