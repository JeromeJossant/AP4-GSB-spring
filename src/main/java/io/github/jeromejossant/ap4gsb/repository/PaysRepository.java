package io.github.jeromejossant.ap4gsb.repository;

import io.github.jeromejossant.ap4gsb.entity.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaysRepository extends JpaRepository<Pays, Long> {

}
