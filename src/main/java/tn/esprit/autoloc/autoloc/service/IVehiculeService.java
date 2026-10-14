package tn.esprit.autoloc.autoloc.service;

import tn.esprit.autoloc.autoloc.domain.Vehicule;
import java.util.List;

public interface IVehiculeService {

    List<Vehicule> retrieveAllVehicules();

    Vehicule retrieveVehicule(Long vehiculeId);

    Vehicule addVehicule(Vehicule vehicule);

    void removeVehicule(Long vehiculeId);

    Vehicule modifyVehicule(Vehicule vehicule);
}