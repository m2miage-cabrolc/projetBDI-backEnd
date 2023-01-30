package miagiles.gromed.service;

import miagiles.gromed.entity.Utilisateur;
import miagiles.gromed.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service

public class UtilisateurService {
    // @Autowired
    // UtilisateurRepository utilisateurRepository;


    // public Iterable<Utilisateur> getUtilisateursListe(){
    //     return utilisateurRepository.findAll();
    // }

    public Utilisateur getUtilisateur(String adresseMail ) {
        return utilisateurRepository.findByAdresseMail(adresseMail);
    }

    public boolean getIfExisteUtilisateur(String adresseMail , String mdp) {
        return utilisateurRepository.findByAdresseMailAndMotDePasse(adresseMail,mdp)!=null;


}
