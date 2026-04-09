package edu.kis.vh.nursery;

// Projekt jest poprawny. Dokonano walidacji testami jednostkowymi - nie stwierdzono potrzeby wprowadzania zmian.

public class    DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int ERROR = -1;
    private final int[] numbers = new int[CAPACITY];

    private int total = ERROR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
