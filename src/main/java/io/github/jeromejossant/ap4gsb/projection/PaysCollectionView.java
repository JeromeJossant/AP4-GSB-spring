package io.github.jeromejossant.ap4gsb.projection;

import java.util.Set;

public interface PaysCollectionView {

    Long getId();

    String getNom();

    Set<DepartementCollectionnVIew> getDepartements();
}
