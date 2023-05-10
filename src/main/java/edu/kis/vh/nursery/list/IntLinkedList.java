package edu.kis.vh.nursery.list;

public class IntLinkedList {
    /**
     * Creates linked list that stores nodes with int values
     */

    private final int ERROR_NUMBER = -1;
    private Node last;
    int i;

    /**
     * Pushes element to beginning of the stack (list)
     * @param i Value which will be stored to element of list
     */
    public void push(int i)  {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Checks if list is empty
     * @return Return true if the list is empty and false when is not
     */
    public boolean isEmpty() {
        return last == null;
    }


    /**
     * Returns value of the top element
     */
    public int top() {
        if (isEmpty())
            return ERROR_NUMBER;
        return last.getValue();
    }

    /**
     * Deletes the top element of the list
     * @return Returns value of the deleted element
     */
    public int pop() {
        if (isEmpty())
            return ERROR_NUMBER;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
