package tn.esprit.autoloc.autoloc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import tn.esprit.autoloc.autoloc.domain.Vehicule;
import tn.esprit.autoloc.autoloc.repository.VehiculeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculeService implements IVehiculeService {

    private final VehiculeRepository vehiculeRepository;

    @Override
    public List<Vehicule> retrieveAllVehicules() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule retrieveVehicule(Long vehiculeId) {
        return vehiculeRepository.findById(vehiculeId)
                .orElseThrow(() ->
                        new IllegalArgumentException(
                                "Vehicule introuvable avec ID : " + vehiculeId
                        )
                );
    }

    @Override
    public Vehicule addVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void removeVehicule(Long vehiculeId) {
        vehiculeRepository.deleteById(vehiculeId);
    }

    @Override
    public Vehicule modifyVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }
}