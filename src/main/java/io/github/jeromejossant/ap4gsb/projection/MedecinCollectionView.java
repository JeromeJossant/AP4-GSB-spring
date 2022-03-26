package io.github.jeromejossant.ap4gsb.projection;

public interface MedecinCollectionView {

    Long getId();

    String getNom();

    String getPrenom();

    String getAdresse();

    String getTel();

    SpecialiteComplementaireView getSpecialiteComplementaire();

    DepartementView getDepartement();
}
