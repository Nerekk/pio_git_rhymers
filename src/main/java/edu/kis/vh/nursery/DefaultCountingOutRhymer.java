package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int SIZE_OF_NUMBERS = 12;
    private int ERROR_NUMBER = -1;
    private int[] numbers = new int[SIZE_OF_NUMBERS];
    public int total = ERROR_NUMBER;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR_NUMBER;
    }

    public boolean isFull() {
        return total == SIZE_OF_NUMBERS-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
