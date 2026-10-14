package tn.esprit.autoloc.autoloc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.autoloc.autoloc.domain.Vehicule;
import tn.esprit.autoloc.autoloc.service.IVehiculeService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/vehicule")
public class VehiculeController {

    private final IVehiculeService vehiculeService;

    // 1. Récupérer tous les véhicules
    // GET http://localhost:8081/vehicule
    @GetMapping
    public List<Vehicule> getVehicules() {
        return vehiculeService.retrieveAllVehicules();
    }

    // 2. Récupérer un véhicule par son ID
    // GET http://localhost:8081/vehicule/1
    @GetMapping("/{vehiculeId}")
    public Vehicule retrieveVehicule(
            @PathVariable("vehiculeId") Long vehiculeId) {

        return vehiculeService.retrieveVehicule(vehiculeId);
    }

    // 3. Ajouter un véhicule
    // POST http://localhost:8081/vehicule
    @PostMapping
    public Vehicule addVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.addVehicule(vehicule);
    }

    // 4. Modifier un véhicule
    // PUT http://localhost:8081/vehicule
    @PutMapping
    public Vehicule modifyVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.modifyVehicule(vehicule);
    }

    // 5. Supprimer un véhicule
    // DELETE http://localhost:8081/vehicule/1
    @DeleteMapping("/{vehiculeId}")
    public void removeVehicule(
            @PathVariable("vehiculeId") Long vehiculeId) {

        vehiculeService.removeVehicule(vehiculeId);
    }
}