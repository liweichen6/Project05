package project05;

import list.ListInterface;
/**
 * This is the linkedList implementation class. This will store data
 * using the implementation.
 * @author Jacob Delisle jacobd96
 * @version 2016.11.05
 * @param <T>
 */
public class LinkedList<T> implements ListInterface<T>
{
    private Node<T> firstNode;
    private int size;
    /**
     * This is the constructor. Sets the firstNode as null
     * and size as 0
     */
    public LinkedList()
    {
        firstNode = null;
        size = 0;
    }
    /**
     * Returns a node at a given position.
     * @param position what node to return
     * @return Node<T> returns the node at position
     */
    private Node<T> getNodeAt(int position)
    {
        Node<T> currentNode = firstNode;
        int loopCounter = 1;
        while (loopCounter < position)
        {
            currentNode = currentNode.getNextNode();
            loopCounter++;
        }
        return currentNode;
    }
    /**
     * Adds a node to the end of the list. 
     * @param anEntry what is being added
     */
    @Override
    public void add(T anEntry)
    {
        Node<T> newNode = new Node<T>(anEntry);
        if (isEmpty())
        {
            firstNode = newNode;
        }
        else
        {
            Node<T> previousNode = getNodeAt(this.getLength());
            previousNode.setNextNode(newNode);
        }
        size++;
    }
    /**
     * Adds an entry to a specific entry in the list.
     * @param position what position to add anEntry to
     * @param anEntry what is being added to the list.
     * @throws IndexOutOfBoundsException if invalid position
     */
    @Override
    public void add(int position, T anEntry)
    {
        if (position < 1 || position > this.getLength() + 1)
        {
            throw new IndexOutOfBoundsException();
        }
        else
        {
           Node<T> newNode = new Node<T>(anEntry);
           if (position == 1)
           {
               newNode.setNextNode(firstNode);
               firstNode = newNode;
           }
           else if (position == this.getLength() + 1)
           {
               Node<T> lastNode = getNodeAt(position - 1);
               lastNode.setNextNode(newNode);
           }
           else
           {
               Node<T> previousNode = getNodeAt(position - 1);
               Node<T> afterNode = previousNode.getNextNode();
               newNode.setNextNode(afterNode);
               previousNode.setNextNode(newNode);
           }
           size++;
        }
    }
    /**
     * This will clear the list by setting the firstNode field
     * to null and size to 0
     */
    @Override
    public void clear()
    {
        firstNode = null;
        size = 0;
    }
    /**
     * This method will determine whether or not anEntry T
     * is in the list.
     * @param anEntry to be found
     * @return boolean for true or false.
     */
    @Override
    public boolean contains(T anEntry)
    {
        if (isEmpty() || anEntry == null)
        {
            return false;
        }
        int loopCounter = 0;
        boolean isFound = false;
        Node<T> currentNode = firstNode;
        while (loopCounter < this.getLength() && !isFound)
        {
            if (anEntry.equals(currentNode.getData()))
            {
                isFound = true;
            }
            else
            {
                currentNode = currentNode.getNextNode();
            }
            loopCounter++;
        }
        return isFound;
    }
    /**
     * Returns the data at a certain position.
     * @param position place to find data.
     * @return T the data
     */
    @Override
    public T getEntry(int position)
    {
        if (isEmpty())
        {
            throw new IllegalArgumentException();
        }
        if (position == 0 || position > this.getLength())
        {
            throw new IndexOutOfBoundsException();
        }
        return getNodeAt(position).getData();
    }
    /**
     * Returns the size of the list
     * @return int for size of list.
     */
    @Override
    public int getLength()
    {
        return size;
    }
    /**
     * Determines whether the list is empty or not, i.e.
     * size is zero
     * @return boolean for true or false.
     */
    @Override
    public boolean isEmpty()
    {
        return (this.getLength() == 0);
    }
    /**
     * Removes a node at a certain position and returns
     * the data
     * @param position what is to be removed.
     * @return T for data
     * @throws IndexOutOfBoundsException when position is invalid
     */
    @Override
    public T remove(int position)
    {
        T toBeRemoved = null;
        if (position < 1 || position > this.getLength())
        {
            throw new IndexOutOfBoundsException();
        }
        else
        {
            if (position == 1)
            {
                toBeRemoved = firstNode.getData();
                firstNode = firstNode.getNextNode();
            }
            else if (position == this.getLength())
            {
                Node<T> previousNode = getNodeAt(position - 1);
                Node<T> removedNode = previousNode.getNextNode();
                previousNode.setNextNode(null);
                toBeRemoved = removedNode.getData();
            }
            else
            {
               Node<T> previousNode = getNodeAt(position - 1);
               Node<T> removedNode = previousNode.getNextNode();
               Node<T> afterNode = removedNode.getNextNode();
               previousNode.setNextNode(afterNode);
               toBeRemoved = removedNode.getData();
            }
            size--;
            return toBeRemoved;
        }
            
    }
    /**
     * Replaces a node at a certain position.
     * @throws IndexOutOfBoundsException if position is invalid
     * @param position what node is being replaced
     * @param replacement what the node is being replaced with
     * @return T data that was replaced
     */
    @Override
    public T replace(int position, T replacement)
    {
        if (position < 1 || position > this.getLength())
        {
            throw new IndexOutOfBoundsException();
        }
        else
        {
            Node<T> node = getNodeAt(position);
            T toBeReplaced = node.getData();
            node.setData(replacement);
            return toBeReplaced;
        }
    }
    /**
     * Returns an array representation of the data.
     * @return T[] the array to be returned
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object[] toArray()
    {
        T[] array = (T[])new Object[this.getLength()];
        for (int i = 0; i < this.getLength(); i++)
        {
            array[i] = getNodeAt(i + 1).getData();
        }
        return array;
    }
    /**
     * Determines whether two linked list are equal
     * @param obj to be compared with
     * @return boolean true or false
     */
    @SuppressWarnings("unchecked")
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (obj == this)
        {
            return true;
        }
        if (obj.getClass() == this.getClass())
        {
            LinkedList<T> toCompare = (LinkedList<T>) obj;
            if (toCompare.getLength() != this.getLength())
            {
                return false;
            }
            else
            {
                int loopCounter = 1;
                boolean equals = true;
                while (loopCounter <= this.getLength() && equals)
                {
                    if (!this.getEntry(loopCounter).
                        equals(toCompare.getEntry(loopCounter)))
                    {
                        equals = false;
                    }
                    loopCounter++;
                }
                return equals;
            }
        }
        else
        {
            return false;
        }
    }
    /**
     * Returns a string representation of the data
     * @return String for string representation
     */
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append('[');
        boolean isFirst = true;
        for (int i = 1; i <= this.getLength(); i++)
        {
            if (!isFirst)
            {
                builder.append(", ");
            }
            else
            {
                isFirst = false;
            }
            builder.append(this.getEntry(i).toString());
        }
        builder.append(']');
        return builder.toString();
    }
    /**
     * This is the private inner node class
     * @param <E> 
     */
    private static class Node<E>
    {
        private E data;
        private Node<E> next;
        /**
         * This constructor initializes the fields
         * @param dataNew to initialize data
         */
        public Node(E dataNew)
        {
            data = dataNew;
            next = null;
        }
        /**
         * Set the data in the node.
         * @param dataNew to be set
         */
        public void setData(E dataNew)
        {
            data = dataNew;
        }
        /**
         * Returns the next node.
         * @return Node<E> next node
         */
        public Node<E> getNextNode()
        {
            return next;
        }
        /**
         * returns the data in a specific node.
         * @return E for data
         */
        public E getData()
        {
            return data;
        }
        /**
         * sets the next node for the list
         * @param newNode to be added
         */
        public void setNextNode(Node<E> newNode)
        {
            next = newNode;
        }
    }
}
