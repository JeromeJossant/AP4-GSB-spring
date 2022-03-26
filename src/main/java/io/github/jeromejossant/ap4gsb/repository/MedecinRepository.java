package io.github.jeromejossant.ap4gsb.repository;

import io.github.jeromejossant.ap4gsb.entity.Medecin;
import io.github.jeromejossant.ap4gsb.projection.MedecinCollectionView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin, Long> {

    List<MedecinCollectionView> findAllByNomContaining(String nom);

    Optional<MedecinCollectionView> findMedecinById(Long id);

    List<MedecinCollectionView> findAllMedecinBy();
}

