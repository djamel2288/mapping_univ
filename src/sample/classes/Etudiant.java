package sample.classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Etudiant {
    private String etu_nom;
    private Date naissance;

    public Etudiant(String etu_nom, Date naissance) {
        this.etu_nom = etu_nom;
        this.naissance = naissance;
    }

    private Note note;
    private List<Matiere> matiere;

    public String getEtu_nom() {
        return etu_nom;
    }

    public void setEtu_nom(String etu_nom) {
        this.etu_nom = etu_nom;
    }

    public Date getNaissance() {
        return naissance;
    }

    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }


    public int age(){

        Date naissance = this.getNaissance();
        Date dt = new Date();

        long diffInMillies = Math.abs(dt.getTime() - naissance.getTime());
        long diff = (TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS))/365;

        return (int) diff;
    }
}
