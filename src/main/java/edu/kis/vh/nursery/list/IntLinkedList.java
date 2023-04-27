package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private final int ERROR_NUMBER = -1;
    private Node last;
    int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }



    public int top() {
        if (isEmpty())
            return ERROR_NUMBER;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return ERROR_NUMBER;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
