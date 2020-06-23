package com.company;

public class TrenerPokemonaCharmander {

    public void wykonajKomendeAtaku(PokemonCharmander atakowanie){
        atakowanie.paraliż();
    }

    public void wykonajKomendeUniku(PokemonCharmander unikanie){
        unikanie.wykonaj_unik();
    }

    public void trenujPokemona(PokemonCharmander trening){
        trening.czy_ewoluował();
    }
}
