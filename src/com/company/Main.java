package com.company;

import java.util.Scanner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj punkty zdrowia dla pokemona: ");
        int hp = scan.nextInt();
        System.out.println("Podaj punkty energii: ");
        int energy = scan.nextInt();
        System.out.println("Podaj koszt ataku przy zużyciu energii: ");
        int kosztAtaku = scan.nextInt();
        System.out.println("Podaj level pokemona: ");
        int level = scan.nextInt();

        PokemonCharmander ognisty = new PokemonCharmander(hp, energy, kosztAtaku, level);

        System.out.println(ognisty.paraliż());
        System.out.println(ognisty.atakuj());
        System.out.println(ognisty.wykonaj_unik());
        ognisty.czy_ewoluował();

        System.out.println("_____________________________________________");
        System.out.println("KALKULATOR OBRAŻEŃ I WŁAŚCIWOŚCI:");

        KalkulatorObrazenIWlasciwosci ko = mock(KalkulatorObrazenIWlasciwosci.class);
        when(ko.CzasTrwaniaParaliżuWroga()).thenReturn(Boolean.valueOf(true));
        when(ko.PunktyObrazenMiotaczaPlomieniPrzedEwolucja()).thenReturn(45);
        when(ko.PunktyObrazenMiotaczaPlomieniPoEwolucji()).thenReturn(90);
        when(ko.CharmanderEwoluowal()).thenReturn(150);

        System.out.println("Czas paraliżu wroga przez Charmeleona: "+ko.CzasTrwaniaParaliżuWroga());
        System.out.println("Obrażenia zadawane przez Charmandera: "+ko.PunktyObrazenMiotaczaPlomieniPrzedEwolucja());
        System.out.println("Obrażania zadawane przez Charmeleona: "+ko.PunktyObrazenMiotaczaPlomieniPoEwolucji());
        System.out.println("Ilość HP Charmeleona: "+ko.CharmanderEwoluowal());
    }
}
