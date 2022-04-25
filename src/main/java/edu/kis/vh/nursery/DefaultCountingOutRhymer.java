package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MNUMBER = 12;
    public static final int MONE = -1;
    public static final int ELEV = 11;
    private final int[] numbers = new int[MNUMBER];

    public int total = MONE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == MONE;
    }

    public boolean isFull() {
        return total == ELEV;
    }

    protected int peekaboo() {
        if (callCheck())
            return MONE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return MONE;
        return numbers[total--];
    }

}
