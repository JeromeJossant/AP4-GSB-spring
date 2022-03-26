package io.github.jeromejossant.ap4gsb.repository;

import io.github.jeromejossant.ap4gsb.entity.Pays;
import io.github.jeromejossant.ap4gsb.projection.PaysCollectionView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PaysRepository extends JpaRepository<Pays, Long> {

    List<PaysCollectionView> findAllPaysBy();

    Optional<PaysCollectionView> findPaysById(Long id);
}
