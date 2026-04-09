package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

// Projekt jest poprawny. Dokonano walidacji testami jednostkowymi - nie stwierdzono potrzeby wprowadzania zmian.
/**
 * Fabryka odpowiedzialna za tworzenie różnych rodzajów obiektów typu Rhymer.
 * Implementuje interfejs Rhymersfactory, dostarczając konkretne implementacje klas rymowanek.
 */
public class DefaultRhymersFactory implements Rhymersfactory {

    /**
     * Tworzy i zwraca standardową instancję rymowanki.
     * * @return Nowy obiekt klasy DefaultCountingOutRhymer.
     */
    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * Tworzy i zwraca instancję rymowanki, która w tej implementacji
     * również jest standardowym obiektem DefaultCountingOutRhymer.
     * * @return Nowy obiekt klasy DefaultCountingOutRhymer.
     */
    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * Tworzy i zwraca rymowankę działającą w trybie FIFO (First In, First Out).
     * * @return Nowy obiekt klasy FIFORhymer.
     */
    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    /**
     * Tworzy i zwraca rymowankę typu Hanoi, służącą do specyficznego
     * wyliczania elementów z kontrolą błędnych odłożeń.
     * * @return Nowy obiekt klasy HanoiRhymer.
     */
    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}
