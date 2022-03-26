package io.github.jeromejossant.ap4gsb.service;

import io.github.jeromejossant.ap4gsb.entity.Pays;
import io.github.jeromejossant.ap4gsb.projection.PaysCollectionView;
import io.github.jeromejossant.ap4gsb.repository.PaysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaysService {
    final PaysRepository paysRepository;

    @Autowired
    public PaysService(PaysRepository paysRepository) {
        this.paysRepository = paysRepository;
    }

    public List<PaysCollectionView> findAll() {
        return this.paysRepository.findAllPaysBy();
    }

    public Optional<PaysCollectionView> findById(Long id) {
        return this.paysRepository.findPaysById(id);
    }
}
