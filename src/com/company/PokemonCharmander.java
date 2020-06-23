package com.company;

public class PokemonCharmander {

    private int hp;
    private int energy;
    private int kosztAtaku;
    private int level;

    public PokemonCharmander(int hp, int energy, int kosztAtaku, int level) {
        this.hp = hp;
        this.energy = energy;
        this.kosztAtaku = kosztAtaku;
        this.level = level;
    }

    public String atakuj(){
        System.out.println("Charmander użył miotacza płomieni!");
        int pozostalaEnergia = energy - kosztAtaku;
        return "Charmander ma jeszcze "+ pozostalaEnergia +" energii.";
    }

    public String paraliż(){
        return "Wróg znieruchomiał ale nie otrzymał obrażeń!";
    }

    public String wykonaj_unik(){
        return "Charmander wykonał unik!";
    }

    public boolean czy_ewoluował(){
        if (level < 18) {
            System.out.println("Charmander jeszcze się nie przekształcił.");
        }
        else if (level >= 18){
            System.out.println("Charmander przekształcił się w Charmeleona!");
        }
        return true;
    }
}
