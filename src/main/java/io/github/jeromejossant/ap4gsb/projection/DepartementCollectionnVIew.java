package io.github.jeromejossant.ap4gsb.projection;

import java.util.Set;

public interface DepartementCollectionnVIew {

    Long getId();

    String getNom();

    String getNum();

    PaysView getPays();

    Set<MedecinView> getMedecins();
}
