package io.github.jeromejossant.ap4gsb.repository;

import io.github.jeromejossant.ap4gsb.entity.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DepartementRepository extends JpaRepository<Departement, Long> {


}
