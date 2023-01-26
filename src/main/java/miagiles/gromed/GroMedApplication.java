package miagiles.gromed;

import miagiles.gromed.model.EtablissementSante;
import miagiles.gromed.model.Utilisateur;
import miagiles.gromed.repository.EtablissementSanteRepository;
import miagiles.gromed.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class GroMedApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroMedApplication.class, args);

	}

}
