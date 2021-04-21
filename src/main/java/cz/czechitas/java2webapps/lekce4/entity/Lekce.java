package cz.czechitas.java2webapps.lekce4.entity;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Informace o jedné lekci.
 */
public class Lekce {
    private String nazev;
    private LocalDate datum;
    private LocalTime casOd;
    private LocalTime casDo;
    private String misto;

    public Lekce(String nazev, LocalDate datum, LocalTime casOd, LocalTime casDo, String misto) {
        this.nazev = nazev;
        this.datum = datum;
        this.casOd = casOd;
        this.casDo = casDo;
        this.misto = misto;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public void setCasOd(LocalTime casOd) {
        this.casOd = casOd;
    }

    public void setCasDo(LocalTime casDo) {
        this.casDo = casDo;
    }

    public void setMisto(String misto) {
        this.misto = misto;
    }

    public String getNazev() {
        return nazev;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public LocalTime getCasOd() {
        return casOd;
    }

    public LocalTime getCasDo() {
        return casDo;
    }

    public String getMisto() {
        return misto;
    }


}
