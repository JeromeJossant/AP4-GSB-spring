package io.github.jeromejossant.ap4gsb.service;

import io.github.jeromejossant.ap4gsb.entity.SpecialiteComplementaire;
import io.github.jeromejossant.ap4gsb.projection.SpecialiteComplementaireCollectionView;
import io.github.jeromejossant.ap4gsb.repository.SpecialiteComplementaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecialiteComplementaireService {
    final SpecialiteComplementaireRepository specialiteComplementaireRepository;


    @Autowired
    public SpecialiteComplementaireService(SpecialiteComplementaireRepository specialiteComplementaireRepository) {
        this.specialiteComplementaireRepository = specialiteComplementaireRepository;
    }

    public List<SpecialiteComplementaireCollectionView> findAll() {
        return this.specialiteComplementaireRepository.findAllSpecialiteComplementaireBy();
    }

    public Optional<SpecialiteComplementaireCollectionView> findById(Long id) {
        return this.specialiteComplementaireRepository.findSpecialiteComplementaireById(id);
    }

}
