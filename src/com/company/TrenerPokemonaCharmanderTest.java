package com.company;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TrenerPokemonaCharmanderTest {

    @Test
    public void sprawdzCzyWykonanoPolecenieAtaku(){
        PokemonCharmander pokemon_ognisty = mock(PokemonCharmander.class);

        TrenerPokemonaCharmander trener = new TrenerPokemonaCharmander();
        trener.wykonajKomendeAtaku(pokemon_ognisty);

        verify(pokemon_ognisty).atakuj();
    }

    @Test
    public void sprawdzCzyWykonanoPolecenieUniku(){
        PokemonCharmander pokemon_ognisty = mock(PokemonCharmander.class);

        TrenerPokemonaCharmander trener = new TrenerPokemonaCharmander();
        trener.wykonajKomendeUniku(pokemon_ognisty);

        verify(pokemon_ognisty).wykonaj_unik();
    }

    @Test
    public void sprawdzCzyPokemonEwoluowal(){
        PokemonCharmander pokemon_ognisty = mock(PokemonCharmander.class);

        TrenerPokemonaCharmander trener = new TrenerPokemonaCharmander();
        trener.trenujPokemona(pokemon_ognisty);

        verify(pokemon_ognisty).czy_ewoluował();
    }
}
