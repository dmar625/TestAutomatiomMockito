package com.company;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class KalkulatorObrazenIWlasciwosciTest {

    @Test
    public void sprawdzCzyWykonanoObliczeniaObrazenPrawidlowo(){
        KalkulatorObrazenIWlasciwosci calc = mock(KalkulatorObrazenIWlasciwosci.class);
        verify(calc).PunktyObrazenMiotaczaPlomieniPrzedEwolucja();
    }

    @Test
    public void sprawdzCzyWykonanoObliczeniaObrazenPrawidlowoPoEwolucji(){
        KalkulatorObrazenIWlasciwosci calc = mock(KalkulatorObrazenIWlasciwosci.class);
        verify(calc).PunktyObrazenMiotaczaPlomieniPoEwolucji();
    }

    @Test
    public void sprawdzCzasTrwaniaParalizuWroga(){
        KalkulatorObrazenIWlasciwosci calc = mock(KalkulatorObrazenIWlasciwosci.class);
        verify(calc).CzasTrwaniaParaliżuWroga();
    }

    @Test
    public void sprawdzCzyPokemonEwoluowal(){
        KalkulatorObrazenIWlasciwosci calc = mock(KalkulatorObrazenIWlasciwosci.class);
        verify(calc).CharmanderEwoluowal();
    }
}
