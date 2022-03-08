package io.github.jeromejossant.ap4gsb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class SpecialiteComplementaire {

    @Id
    private Long id;
    private String libelle;

    public SpecialiteComplementaire(Long id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public SpecialiteComplementaire() {
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

    @Override
    public String toString() {
        return "SpecialiteComplementaire{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}
