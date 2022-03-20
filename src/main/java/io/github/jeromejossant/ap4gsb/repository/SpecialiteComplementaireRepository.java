package io.github.jeromejossant.ap4gsb.repository;

import io.github.jeromejossant.ap4gsb.entity.SpecialiteComplementaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpecialiteComplementaireRepository extends JpaRepository<SpecialiteComplementaire, Long> {
    List<SpecialiteComplementaire> findAllByLibelleContaining(String libelle);
}

