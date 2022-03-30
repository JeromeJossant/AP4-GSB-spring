package io.github.jeromejossant.ap4gsb.controller;


import io.github.jeromejossant.ap4gsb.entity.SpecialiteComplementaire;
import io.github.jeromejossant.ap4gsb.projection.SpecialiteComplementaireCollectionView;
import io.github.jeromejossant.ap4gsb.service.SpecialiteComplementaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/specialiteComplementaire")
public class SpecialiteComplementaireController {
    final SpecialiteComplementaireService specialiteComplementaireService;

    @Autowired
    public SpecialiteComplementaireController(SpecialiteComplementaireService specialiteComplementaireService) {
        this.specialiteComplementaireService = specialiteComplementaireService;
    }

    @GetMapping
    public List<SpecialiteComplementaireCollectionView> getAll() {
        return this.specialiteComplementaireService.findAll();
    }

    @GetMapping("/{id}")
    public SpecialiteComplementaireCollectionView getById(@PathVariable("id") Long id) {
        Optional<SpecialiteComplementaireCollectionView> specialaiteComplementaireOptional = this.specialiteComplementaireService.findById(id);
        if (specialaiteComplementaireOptional.isPresent()) {
            return specialaiteComplementaireOptional.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
