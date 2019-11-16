package sample.classes;

import java.util.List;

public class Université {
    private int code;
    private String nom;

    List<Département> département;
    private Département dep;

    public Université(int code, String nom) {
        this.code = code;
        this.nom = nom;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}
