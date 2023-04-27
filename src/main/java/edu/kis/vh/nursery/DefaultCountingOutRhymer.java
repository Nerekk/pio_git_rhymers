package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int MAX_NUMBERS = 12;
    private final int ERROR_NUMBER = -1;
    private final int EMPTY_RHYMER_INDICATOR = -1;
    private final int[] numbers = new int[MAX_NUMBERS];
    public int total = ERROR_NUMBER;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == MAX_NUMBERS - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_NUMBER;

        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_NUMBER;

        return numbers[total--];
    }

}
