package miagiles.gromed.service;

import jakarta.servlet.http.HttpServletResponse;
import miagiles.gromed.entity.Commande;
import miagiles.gromed.entity.Utilisateur;
import miagiles.gromed.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service

public class UtilisateurService {
    @Autowired
    UtilisateurRepository utilisateurRepository;


    public Iterable<Utilisateur> getUtilisateursListe(){
        return utilisateurRepository.findAll();
    }

    public Utilisateur getUtilisateur(String adresseMail ) {
        return utilisateurRepository.findByAdresseMail(adresseMail);
    }

    public boolean getIfExisteUtilisateur(String adresseMail , String mdp) {
        return utilisateurRepository.findByAdresseMailAndMotDePasse(adresseMail,mdp)!=null;
    }

}
