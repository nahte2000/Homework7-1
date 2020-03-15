import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayDictionaryTest {
    @Test
    public void demo() {
        int testSize = 5;
        ArrayDictionary dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(2, 82));
        assertTrue(dict.add(4, 84));
        assertTrue(dict.add(7, 87));
        System.out.println(dict);
        remove();
        contains();
    }

    @Test
    public void remove() {
        int testSize = 5;
        ArrayDictionary dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(2, 82));
        assertTrue(dict.add(4, 84));
        assertTrue(dict.add(7, 87));
        assertTrue(dict.add(3,83));
        assertFalse(dict.remove());
        assertFalse(dict.remove(-1));
        assertFalse(dict.remove(0));
        assertTrue(dict.remove(4));  // place holder
        System.out.println(dict);
    }

    @Test
    public void contains() {
        int testSize = 0;
        ArrayDictionary dict = new ArrayDictionary();
        assertFalse(dict.contains(-1));
        assertFalse(dict.contains(0));
        assertFalse(dict.contains(1));
        System.out.println(dict);

        int testSize2 = 1;
        ArrayDictionary dict2 = new ArrayDictionary(testSize2);
        assertTrue(dict2.add(0, 103));
        assertFalse(dict2.contains(2));
        assertTrue(dict2.contains(0));
        System.out.println(dict2);

        int testSize3 = 2;
        ArrayDictionary dict3 = new ArrayDictionary(testSize3);
        assertTrue(dict3.add(0, 103));
        assertTrue(dict3.add(1, 105));
        assertTrue(dict3.contains(0));
        assertTrue(dict3.contains(1));
        assertFalse(dict3.contains(2));
        assertFalse(dict3.contains(3));
        System.out.println(dict3);

        int testSize4 = 3;
        ArrayDictionary dict4 = new ArrayDictionary(testSize4);
        assertTrue(dict4.add(0, 103));
        assertTrue(dict4.add(1, 105));
        assertTrue(dict4.add(2,206));
        assertFalse(dict4.contains(1));
        assertTrue(dict4.contains(3));
        System.out.println(dict4);

        int testSize5 = 3;
        ArrayDictionary dict5 = new ArrayDictionary(testSize5);
        assertTrue(dict5.add(0, 103));
        assertTrue(dict5.add(1, 105));
        assertTrue(dict5.add(2,206));
        assertTrue(dict5.add(4,407));
        assertTrue(dict5.contains(1));
        assertTrue(dict5.contains(4));
        assertFalse(dict5.contains(7));
        assertFalse(dict5.contains(8));
        System.out.println(dict5);
    }
}