package io.github.jeromejossant.ap4gsb.service;

import io.github.jeromejossant.ap4gsb.projection.DepartementCollectionnVIew;
import io.github.jeromejossant.ap4gsb.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartementService {
    final DepartementRepository departementRepository;

    @Autowired
    public DepartementService(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }

    public List<DepartementCollectionnVIew> findAll() {
        return this.departementRepository.findByOrderByNumAsc();
    }

    public Optional<DepartementCollectionnVIew> findById(Long id) {
        return this.departementRepository.findDepartementById(id);
    }
}
