package teststrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Strings {

    /**
     * testing string in reverse
     */

    @Test
    public void testReverse() {
        javastrings.Strings str = new javastrings.Strings();
        str.reverseString("hello");
        assertEquals("olleh", str.reverseString("hello"));

    }


    /**
     * testing String UpperCase
     */

    @Test
    public void testUpper() {
        javastrings.Strings str = new javastrings.Strings();
        str.makeUpper("hello");
        assertEquals("HELLO", str.makeUpper("hello"));
    }


    /**
     * testing to delete a
     */

    @Test
    public void testDeleteA(){
        javastrings.Strings str = new javastrings.Strings();
        str.deletingA("Hallo");
        assertEquals("hllo", "hallo");
    }

}


