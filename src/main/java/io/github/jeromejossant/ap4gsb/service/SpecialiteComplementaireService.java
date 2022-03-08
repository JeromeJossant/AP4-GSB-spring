package io.github.jeromejossant.ap4gsb.service;

import io.github.jeromejossant.ap4gsb.entity.Medecin;
import io.github.jeromejossant.ap4gsb.entity.SpecialiteComplementaire;
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

    public List<SpecialiteComplementaire> findAll() {
        return this.specialiteComplementaireRepository.findAll();
    }

    public Optional<SpecialiteComplementaire> findById(Long id) {
        return this.specialiteComplementaireRepository.findById(id);
    }

    public List<SpecialiteComplementaire> findAllByLibelle(String libelle) {
        return this.specialiteComplementaireRepository.findAllByLibelleContaining(libelle);
    }


}
