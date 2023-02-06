package sk.tmconsulting;

import sk.tmconsulting.model.NakladyStruktura;

import java.util.ArrayList;
import java.util.Scanner;

public class EvidenciaNakladov {
    public static void main(String[] args) {

        NakladyStruktura nakladyStrukturaObjekt = new NakladyStruktura();
        ArrayList<NakladyStruktura> zoznamNakladov = nakladyStrukturaObjekt.naplnTestovacimiUdajmi(); //vytvorili sme PRAZDNE dynamicke pole

       /* NakladyStruktura nakladyStruktura1 = new NakladyStruktura();
        nakladyStruktura1.setPopis("Hypo");
        nakladyStruktura1.setCena(200);
        nakladyStruktura1.setMesiac("jan");

        NakladyStruktura nakladyStruktura2 = new NakladyStruktura();
        nakladyStruktura2.setPopis("PHM");
        nakladyStruktura2.setCena(100);
        nakladyStruktura2.setMesiac("jan");

        zoznamNakladov.add (nakladyStruktura1);
        zoznamNakladov.add (nakladyStruktura2);*/

        while (true) {
            System.out.println("Vyber si možnosť:");
            System.out.println("(1) Zadaj novú nákladovú položku");
            System.out.println("(2) Zobraz všetky nákladové položky");
            System.out.println("(3) Spočítaj sumu nákladov");
            System.out.println("(4) Koniec aplikácie");

            Scanner scn = new Scanner(System.in);
            int cisloMenu = scn.nextInt(); //priamy vstup od používatela,vyzaduje cisla,t.j.prikaz nextInt()

            //ak používame prikaz if, tak je to obycajne 3-kombinacia else if,else
            if (cisloMenu == 1) {
                //Logika,resp. algoritmus pre zadavanie nakladovej polozky
                //Ak zadame 1,tak aplikacia zobrazi otazky ohladom zadania konkretnych udajov: popis,cena,mesiac
                Scanner scn2 = new Scanner(System.in); // inicializacia konzoly pre menu cislo 1

                System.out.println("Zadaj popis nákladu");
                String popis = scn2.nextLine();


                System.out.println("Zadaj cenu");
                double cena = scn2.nextDouble(); //toto sposobi v dalsom prikaze nextXXX,ze nebude ocakavat vstup od pouzivatela
                scn2.nextLine(); // opravuje chyby pre dalsi vstup,ktory uz nebude prazdny,resp.funkcny ako ma byt,cize ocakava od pouzivatela vstupne

                System.out.println("Zadaj pre ktorý mesiac");
                String mesiac = scn2.nextLine();

                NakladyStruktura nakladyStruktura = new NakladyStruktura(); //vytvorili sme prazdny objekt,teda instanciu triedy NakladyStruktura
                nakladyStruktura.setPopis(popis);
                nakladyStruktura.setCena(cena);
                nakladyStruktura.setMesiac(mesiac);
                // v tomto momente je naplneny objekt nakladyStruktura

                zoznamNakladov.add(nakladyStruktura); //priadnie premennej nakladyStruktura do ArrayListu,resp. do dynamickeho pola

            } else if (cisloMenu == 2) {
                //logika pre cislo menu 2
                for (NakladyStruktura vystup : zoznamNakladov) {
                    System.out.println("Popis nákladu:" + " " + vystup.getPopis());
                    System.out.println("Cena nákladu:" + " " + vystup.getCena());
                    System.out.println("Mesiac:" + " " + vystup.getMesiac());
                }
            } else if (cisloMenu == 3) {
                // logika pre cislo menu 3
                double sum = 0;
                for (NakladyStruktura vystup : zoznamNakladov) {
                    //System.out.println(vystup.getCena());
                    sum = sum + vystup.getCena();
                }
                System.out.println("Výseldný súčet všetkých nákladov je:" + sum);
            } else if (cisloMenu == 9) {
                // logika pre cislo menu 9
            } else {
                //logika ak nezvolime ziadnu moznost z menu

            }
        }
    }

}
