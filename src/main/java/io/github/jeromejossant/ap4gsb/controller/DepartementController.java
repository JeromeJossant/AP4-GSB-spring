package io.github.jeromejossant.ap4gsb.controller;

import io.github.jeromejossant.ap4gsb.entity.Departement;
import io.github.jeromejossant.ap4gsb.projection.DepartementCollectionnVIew;
import io.github.jeromejossant.ap4gsb.service.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/departements")
public class DepartementController {

    final DepartementService departementService;

    @Autowired
    public DepartementController(DepartementService departementService) {
        this.departementService = departementService;
    }

    @GetMapping
    public List<DepartementCollectionnVIew> getAll() {
        return this.departementService.findAll();
    }


    @GetMapping("/{id}")
    public DepartementCollectionnVIew getById(@PathVariable("id") Long id) {
        Optional<DepartementCollectionnVIew> departementOptional = this.departementService.findById(id);
        if (departementOptional.isPresent()) {
            return departementOptional.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
