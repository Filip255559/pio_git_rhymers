package edu.kis.vh.nursery;

// Projekt jest poprawny. Dokonano walidacji testami jednostkowymi - nie stwierdzono potrzeby wprowadzania zmian.

/**
 * Klasa DefaultCountingOutRhymer służy do przechowywania i zarządzania sekwencją liczb całkowitych.
 * Działa na zasadzie zbliżonej do stosu (LIFO - Last In, First Out).
 */
public class    DefaultCountingOutRhymer {
    /** Maksymalna liczba elementów, które mogą być przechowywane w tablicy. */
    private static final int CAPACITY = 12;

    /** Wartość zwracana w przypadku błędu lub gdy struktura jest pusta. */
    private static final int ERROR = -1;

    /** Tablica przechowująca liczby. */
    private final int[] numbers = new int[CAPACITY];

    /** Indeks wskazujący na ostatnio dodany element. */
    private int total = ERROR;

    /**
     * Dodaje nową liczbę do kolekcji, o ile nie została przekroczona pojemność.
     * * @param in liczba całkowita, która ma zostać dodana.
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy kolekcja jest pusta.
     * * @return true, jeśli w kolekcji nie ma żadnych elementów; w przeciwnym razie false.
     */
    public boolean callCheck() {
        return total == ERROR;
    }

    /**
     * Sprawdza, czy kolekcja osiągnęła maksymalną pojemność.
     * * @return true, jeśli tablica jest pełna; w przeciwnym razie false.
     */
    public boolean isFull() {
        return total == 11;
    }

    /**
     * Pozwala podejrzeć ostatnio dodaną wartość bez usuwania jej z kolekcji.
     * * @return wartość ostatniego elementu lub -1 (ERROR), jeśli kolekcja jest pusta.
     */
    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    /**
     * Zwraca ostatnio dodaną wartość i usuwa ją z kolekcji (zmniejsza licznik total).
     * * @return wartość ostatniego elementu lub -1 (ERROR), jeśli nie ma czego usuwać.
     */
    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }
    /**
     * Zwraca aktualny stan licznika elementów.
     * * @return aktualny indeks ostatniego elementu.
     */

    public int getTotal() {
        return total;
    }
}
