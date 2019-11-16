package sample.classes;

import java.util.Date;

public class Note {

    private Date date_note;
    private int valeur;

    public Date getDate_note() {
        return date_note;
    }

    public void setDate_note(Date date_note) {
        this.date_note = date_note;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public Note(Date date_note, int valeur) {
        this.date_note = date_note;
        this.valeur = valeur;
    }
}
