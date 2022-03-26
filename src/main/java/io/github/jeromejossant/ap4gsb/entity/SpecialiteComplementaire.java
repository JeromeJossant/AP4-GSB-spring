package io.github.jeromejossant.ap4gsb.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table

public class SpecialiteComplementaire {

    @Id
    private Long id;
    private String libelle;
    @OneToMany(mappedBy = "specialiteComplementaire")
    private List<Medecin> medecins;

    public SpecialiteComplementaire() {
    }

    public SpecialiteComplementaire(Long id, String libelle, List<Medecin> medecins) {
        this.id = id;
        this.libelle = libelle;
        this.medecins = medecins;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<Medecin> getMedecins() {
        return medecins;
    }

    public void setMedecins(List<Medecin> medecins) {
        this.medecins = medecins;
    }

    @Override
    public String toString() {
        return "SpecialiteComplementaire{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", medecins=" + medecins +
                '}';
    }
}
