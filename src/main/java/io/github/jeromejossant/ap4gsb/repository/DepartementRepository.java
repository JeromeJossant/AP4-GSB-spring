package io.github.jeromejossant.ap4gsb.repository;

import io.github.jeromejossant.ap4gsb.entity.Departement;
import io.github.jeromejossant.ap4gsb.projection.DepartementCollectionnVIew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface DepartementRepository extends JpaRepository<Departement, Long> {

    List<DepartementCollectionnVIew> findAllDepartementBy();

    Optional<DepartementCollectionnVIew> findDepartementById(Long id);
}
