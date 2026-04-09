package edu.kis.vh.nursery;

// Projekt jest poprawny. Dokonano walidacji testami jednostkowymi - nie stwierdzono potrzeby wprowadzania zmian.

public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }

    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }

}
