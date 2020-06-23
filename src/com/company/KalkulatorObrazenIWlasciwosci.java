package com.company;

import java.util.Scanner;

public class KalkulatorObrazenIWlasciwosci {

    Scanner scan = new Scanner(System.in);

    public int PunktyObrazenMiotaczaPlomieniPrzedEwolucja(){
        int obrazeniaPrzedEwolucja = scan.nextInt();
        System.out.println("Obrażenia Charmandera przed ewolucją: "+obrazeniaPrzedEwolucja);
        return obrazeniaPrzedEwolucja;
    }

    public int PunktyObrazenMiotaczaPlomieniPoEwolucji(){
        int obrazeniaPoEwolucji = scan.nextInt();
        System.out.println("Obrażenia Charmeleona: "+obrazeniaPoEwolucji);
        return obrazeniaPoEwolucji;
    }

    public boolean CzasTrwaniaParaliżuWroga(){
        int level = scan.nextInt();
        if (level <=18){
            System.out.println("30 sekund"); }
        else if (level >= 18){
            System.out.println("45 sekund"); }
        return true;
    }

    public int CharmanderEwoluowal(){
        return Integer.parseInt(null);
    }
}
