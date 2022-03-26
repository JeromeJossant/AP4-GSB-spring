package io.github.jeromejossant.ap4gsb.projection;

import java.util.Set;

public interface SpecialiteComplementaireCollectionView {

    Long getId();

    String getLibelle();

    Set<MedecinView> getMedecins();
}