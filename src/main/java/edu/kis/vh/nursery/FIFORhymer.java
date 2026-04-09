package edu.kis.vh.nursery;

// Projekt jest poprawny. Dokonano walidacji testami jednostkowymi - nie stwierdzono potrzeby wprowadzania zmian.
/**
 * Klasa FIFORhymer rozszerza DefaultCountingOutRhymer, zmieniając mechanizm
 * wydobywania elementów na model FIFO (First In, First Out).
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    /** * Pomocniczy obiekt rymowanki używany do tymczasowego
     * przechowywania elementów podczas operacji countOut.
     */
    private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Zwraca pierwszy element dodany do rymowanki (zgodnie z zasadą kolejki).
     * Mechanizm polega na przepisaniu wszystkich elementów do obiektu tymczasowego,
     * pobraniu ostatniego z nich, a następnie przywróceniu pozostałych do głównego stosu.
     * * @return wartość pierwszego dodanego elementu lub -1 (ERROR), jeśli rymowanka jest pusta.
     */
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }

    /**
     * Zwraca obiekt pomocniczy wykorzystywany w tej klasie.
     * * @return instancja DefaultCountingOutRhymer służąca za bufor tymczasowy.
     */
    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }

}
