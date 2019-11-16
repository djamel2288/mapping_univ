package sample.classes;

import java.util.List;

public class Département {
    private String dep;

    private Enseignant ens;
    private List<Enseignant> enseignant;


    public Département(String dep) {
        this.dep = dep;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
}
