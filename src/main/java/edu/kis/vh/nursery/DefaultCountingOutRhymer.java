package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int mnumber = 12;
    public static final int mone = -1;
    public static final int elev = 11;
    private final int[] numbers = new int[mnumber];

    public int total = mone;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == mone;
    }

    public boolean isFull() {
        return total == elev;
    }

    protected int peekaboo() {
        if (callCheck())
            return mone;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return mone;
        return numbers[total--];
    }

}
