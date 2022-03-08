package io.github.jeromejossant.ap4gsb.service;

import io.github.jeromejossant.ap4gsb.entity.Departement;
import io.github.jeromejossant.ap4gsb.entity.Medecin;
import io.github.jeromejossant.ap4gsb.repository.MedecinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedecinService {
    final MedecinRepository medecinRepository;

    @Autowired
    public MedecinService(MedecinRepository medecinRepository) {
        this.medecinRepository = medecinRepository;
    }

    public List<Medecin> findAll() {
        return this.medecinRepository.findAll();
    }

    public Optional<Medecin> findById(Long id) {
        return this.medecinRepository.findById(id);
    }

    public List<Medecin> findAllByNom(String nom) {
        return this.medecinRepository.findAllByNomContaining(nom);
    }
}
