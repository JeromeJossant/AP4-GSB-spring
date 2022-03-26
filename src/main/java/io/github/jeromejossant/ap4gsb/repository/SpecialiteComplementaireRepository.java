package io.github.jeromejossant.ap4gsb.repository;

import io.github.jeromejossant.ap4gsb.entity.SpecialiteComplementaire;
import io.github.jeromejossant.ap4gsb.projection.SpecialiteComplementaireCollectionView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SpecialiteComplementaireRepository extends JpaRepository<SpecialiteComplementaire, Long> {

    List<SpecialiteComplementaireCollectionView> findAllSpecialiteComplementaireBy();

    Optional<SpecialiteComplementaireCollectionView> findSpecialiteComplementaireById(Long id);
}

