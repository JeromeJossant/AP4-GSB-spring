package io.github.jeromejossant.ap4gsb.controller;


import io.github.jeromejossant.ap4gsb.entity.SpecialiteComplementaire;
import io.github.jeromejossant.ap4gsb.service.SpecialiteComplementaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/SpecialiteComplementaire")
public class SpecialiteComplementaireController {
    final SpecialiteComplementaireService specialiteComplementaireService;

    @Autowired
    public SpecialiteComplementaireController(SpecialiteComplementaireService specialiteComplementaireService) {
        this.specialiteComplementaireService = specialiteComplementaireService;
    }

    @GetMapping
    public List<SpecialiteComplementaire> getAll(@RequestParam(required = false, name = "libelle", defaultValue = "") String libelle) {
        return this.specialiteComplementaireService.findAllByLibelle(libelle);
    }

    @GetMapping("/{id}")
    public SpecialiteComplementaire getById(@PathVariable("id") Long id) {
        Optional<SpecialiteComplementaire> specialaiteComplementaireOptional = this.specialiteComplementaireService.findById(id);
        if (specialaiteComplementaireOptional.isPresent()) {
            return specialaiteComplementaireOptional.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
