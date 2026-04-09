package edu.kis.vh.nursery;

// Projekt jest poprawny. Dokonano walidacji testami jednostkowymi - nie stwierdzono potrzeby wprowadzania zmian.

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
