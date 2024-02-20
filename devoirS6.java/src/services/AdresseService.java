package services;

import java.util.List;

import entities.Adresse;
import entities.Client;

public class AdresseService {

    public void addAdresse(Adresse adresse) {
        adresseRepository.insert(adresse);
    }

    public List<Adresse> listerAdesses() {
        return adresseRepository.selectAll();
    }
    
}
