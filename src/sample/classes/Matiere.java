package sample.classes;

import java.util.List;

public class Matiere {
    private int heures;
    private String module;

    private List<Etudiant> etudiant;
    private Note note;

    private List<Enseignant> enseignant;

    public Matiere(int heures, String module) {
        this.heures = heures;
        this.module = module;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}
