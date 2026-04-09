package edu.kis.vh.nursery;

// Projekt jest poprawny. Dokonano walidacji testami jednostkowymi - nie stwierdzono potrzeby wprowadzania zmian.
/**
 * Klasa HanoiRhymer rozszerza DefaultCountingOutRhymer o mechanizm weryfikacji wartości.
 * Zapobiega dodawaniu liczb większych niż aktualnie znajdująca się na szczycie (peekaboo).
 * Zlicza również liczbę odrzuconych prób dodania elementu.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /** Licznik elementów, które nie zostały dodane ze względu na zbyt wysoką wartość. */
    private int totalRejected = 0;

    /**
     * Zwraca całkowitą liczbę elementów odrzuconych przez metodę countIn.
     * * @return liczba odrzuconych elementów.
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Dodaje nową liczbę do rymowanki tylko wtedy, gdy jest ona mniejsza lub równa
     * ostatnio dodanej wartości, lub gdy rymowanka jest pusta.
     * W przypadku podania wartości większej niż ostatnia, inkrementuje licznik odrzuceń.
     * * @param in liczba całkowita do dodania.
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
