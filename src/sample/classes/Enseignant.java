package sample.classes;

import java.util.Date;
import java.util.List;

public class Enseignant {

    private String ens_nom;
    private String ens_prenom;

    private int age;
    private Date debut;
    private int salaire;
    private enum titre {
        ma,
        mc,
        pr
    }

    private Département dep;

    private List<Matiere> matiere;

    public Enseignant(String ens_nom, String ens_prenom, int age, Date debut, int salaire) {
        this.ens_nom = ens_nom;
        this.ens_prenom = ens_prenom;
        this.age = age;
        this.debut = debut;
        this.salaire = salaire;
    }

    public String getEns_prenom() {
        return ens_prenom;
    }

    public void setEns_prenom(String ens_prenom) {
        this.ens_prenom = ens_prenom;
    }

    public String getEns_nom() {
        return ens_nom;
    }

    public void setEns_nom(String ens_nom) {
        this.ens_nom = ens_nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
}
