package sk.tmconsulting.model;

import java.util.ArrayList;

// Popis nákladu (čo) OK, cena, dátum (aktuálny dátum).
public class NakladyStruktura {
    private String popis;
    private double cena;
    private String mesiac;

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getMesiac() {
        return mesiac;
    }

    public void setMesiac(String mesiac) {
        this.mesiac = mesiac;
    }

    public static ArrayList<NakladyStruktura> naplnTestovacimiUdajmi() {

        ArrayList<NakladyStruktura> zoznamTestovacichNakladov = new ArrayList<NakladyStruktura>();

        // vytvorenie prvej nakladovej polozky
        NakladyStruktura nakladyStruktura1 = new NakladyStruktura();
        nakladyStruktura1.setPopis("Hypo");
        nakladyStruktura1.setCena(20);
        nakladyStruktura1.setMesiac("jan");

        NakladyStruktura nakladyStruktura2 = new NakladyStruktura();
        nakladyStruktura2.setPopis("PHM");
        nakladyStruktura2.setCena(80);
        nakladyStruktura2.setMesiac("jan");

        zoznamTestovacichNakladov.add(nakladyStruktura1);
        zoznamTestovacichNakladov.add(nakladyStruktura2);

        return zoznamTestovacichNakladov;
    }
}