package project05;
/**
 * This will test the LinkedList class.
 * 
 * @author Jacob Delisle jacobd96
 * @version 2016.11.05
 */
public class LinkedListTest extends student.TestCase
{
    private LinkedList<String> test;
    
    /**
     * This initializes the field for testing.
     */
    public void setUp()
    {
        test = new LinkedList<String>();
    }
    
    /**
     * Test the add method when something is being
     * added to the end of the list
     */
    public void testAdd()
    {
        test.add("a");
        assertEquals(1, test.getLength());
        test.add("b");
        assertEquals(2, test.getLength());
        assertEquals("b", test.getEntry(2));
    }
    
    /**
     * Test the add method when something is being
     * added to a specific position of the list.
     */
    public void testAdd2()
    {
        //When adding to the list at an invalid position
        //position less than one
        Exception exc = null;
        try
        {
            test.add(0, "b");
        }
        catch (Exception e)
        {
            exc = e;
        }
        assertNotNull(exc);
        //When adding to the list at an invalid position
        //position greater the size + 1
        exc = null;
        try
        {
            test.add(0, "b");
        }
        catch (Exception e2)
        {
            exc = e2;
        }
        assertNotNull(exc);
        //When using this method to add to the front of the list
        test.add("a");
        test.add(1, "b");
        assertEquals(2, test.getLength());
        assertEquals("b",test.getEntry(1));
        //When using this method to add to the back of the list
        test.clear();
        test.add("a");
        test.add("b");
        test.add(3, "c");
        assertEquals(3, test.getLength());
        assertEquals("c", test.getEntry(3));
        //Adding anywhere in the list
        test.add(2, "d");
        assertEquals(4, test.getLength());
        assertEquals("d", test.getEntry(2));
        assertEquals("b", test.getEntry(3));
    }
    
    /**
     * Tests the clear method.
     */
    public void testClear()
    {
        test.add("b");
        assertEquals(1, test.getLength());
        test.clear();
        assertEquals(0, test.getLength());
    }
    
    /**
     * This will test the contains method, which should return
     * false if the entry is not in the list and true
     * if it is
     */
    public void testContains()
    {
        assertFalse(test.contains("b"));
        String nullOne = null;
        assertFalse(test.contains(nullOne));
        test.add("a");
        test.add("bacon");
        test.add("C");
        assertTrue(test.contains("bacon"));
        assertFalse(test.contains("b"));
        assertFalse(test.contains(nullOne));
    }
    
    /**
     * This will test the getEntry method, which
     * should return a specified entry in the list.
     */
    public void testGetEntry()
    {
        Exception exc = null;
        try
        {
            test.getEntry(1);
        }
        catch (Exception e)
        {
            exc = e;
        }
        assertNotNull(exc);
        test.add("b");
        test.add("c");
        exc = null;
        try
        {
            test.getEntry(0);
        }
        catch (Exception e2)
        {
            exc = e2;
        }
        assertNotNull(exc);
        exc = null;
        try 
        {
            test.getEntry(100);
        }
        catch (Exception e3)
        {
            exc = e3;
        }
        assertNotNull(exc);
        assertEquals("b", test.getEntry(1));
        assertEquals("c", test.getEntry(2));
    }
    
    /**
     * tests the getLength method. The test will make sure
     * the size field increments properly
     */
    public void testGetLength()
    {
        assertEquals(0, test.getLength());
        test.add("b");
        assertEquals(1, test.getLength());
        test.add(1, "c");
        assertEquals(2, test.getLength());
        test.remove(1);
        assertEquals(1, test.getLength());
    }
    
    /**
     * Tests the isEmpty() method
     */
    public void testIsEmpty()
    {
        assertTrue(test.isEmpty());
        test.add("b");
        assertFalse(test.isEmpty());
        test.remove(1);
        assertTrue(test.isEmpty());
    }
    
    /**
     * This will test the remove method. The list should
     * remove the data at the specified point without problems,
     * unless the index is out of bounds.
     */
    public void testRemove()
    {
        Exception exc = null;
        try
        {
            test.remove(0);
        }
        catch (Exception e)
        {
            exc = e;
        }
        assertNotNull(exc);
        exc = null;
        try
        {
            test.remove(10000);
        }
        catch (Exception e2)
        {
            exc = e2;
        }
        assertNotNull(exc);
        test.add("b");
        test.add("C");
        test.add("d");
        test.add("back");
        assertEquals("b", test.remove(1));
        assertEquals("back", test.remove(3));
        assertEquals(2, test.getLength());
        test.add("c");
        assertEquals("d", test.remove(2));
    }
    
    /**
     * Tests the replace method. The list should be able
     * to replace the data unless the index is out of bounds
     */
    public void testReplace()
    {
        Exception exc = null;
        try
        {
            test.replace(0, "a");
        }
        catch (Exception e)
        {
            exc = e;
        }
        assertNotNull(exc);
        exc = null;
        try 
        {
            test.replace(100, "b");
        }
        catch (Exception e2)
        {
            exc = e2;
        }
        assertNotNull(exc);
        test.add("a");
        test.add("b");
        test.add("c");
        test.replace(2, "bacon");
        assertEquals("bacon", test.getEntry(2));
    }
    
    /**
     * Tests the toArray() method
     */
    public void testToArray()
    {
        test.add("bacon");
        test.add("is");
        test.add("good");
        String[] toCompare = new String[3];
        toCompare[0] = "bacon";
        toCompare[1] = "is";
        toCompare[2] = "good";
        String toCompareAsWell = (String)test.toArray()[0];
        assertEquals(toCompareAsWell, toCompare[0]);
    }
    
    /**
     * tests the equals method, which will return true when
     * the lists have the same entries in the same order
     */
    public void testEquals()
    {
        int x = 5;
        Object nullObj = null;
        LinkedList<String> falseOne = new LinkedList<String>();
        LinkedList<String> trueOne = new LinkedList<String>();
        assertTrue(test.equals(test));
        assertFalse(test.equals(nullObj));
        assertFalse(test.equals(x));
        test.add("b");
        assertFalse(test.equals(falseOne));
        falseOne.add("c");
        assertFalse(test.equals(falseOne));
        test.add("c");
        trueOne.add("b");
        trueOne.add("c");
        assertTrue(test.equals(trueOne));
    }
    
    /**
     * This will test the toString method
     */
    public void testToString()
    {
        test.add("a");
        test.add("b");
        String equalString = "[a, b]";
        assertTrue(equalString.equals(test.toString()));
    }
}
