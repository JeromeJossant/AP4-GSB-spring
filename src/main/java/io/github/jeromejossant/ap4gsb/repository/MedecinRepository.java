package io.github.jeromejossant.ap4gsb.repository;

import io.github.jeromejossant.ap4gsb.entity.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin, Long> {

    List<Medecin> findAllByNomContaining(String nom);
}

