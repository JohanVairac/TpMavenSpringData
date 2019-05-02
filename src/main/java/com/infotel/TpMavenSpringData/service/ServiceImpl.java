package com.infotel.TpMavenSpringData.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TpMavenSpringData.dao.AdresseRepository;
import com.infotel.TpMavenSpringData.dao.PersonneRepository;
import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;




@Service ("service")
public class ServiceImpl implements Iservice {
	
	@Autowired
	private PersonneRepository personnerepository;

	public Personne ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		return personnerepository.save(p);
	}

	public Personne getPersonne(int idPersonne) {
		// TODO Auto-generated method stub
		return personnerepository.getOne(idPersonne);
	}

	public Optional<Personne> affichagePersonne(int idPersonne) {
		// TODO Auto-generated method stub
		return personnerepository.findById(idPersonne);
	}

	public int modifierPersonne(String nom, int idPersonne) {
		// TODO Auto-generated method stub
		personnerepository.modifierPersonne(nom, idPersonne);
		return idPersonne; 
	}

	public void supprimerPersonne(Personne p) {
		// TODO Auto-generated method stub
		personnerepository.delete(p);
	}

	public Iterable<Personne> FindALLPersonne() {
		// TODO Auto-generated method stub
		return personnerepository.findAll();
	}
	
	public List<Personne> chercherParPrenom(String prenom) {
		// TODO Auto-generated method stub
		return personnerepository.findByPrenom(prenom);
	}
	
	public List<Personne> rechercherParMC(String nom) {
		// TODO Auto-generated method stub
		return personnerepository.rechercherParMC("%"+nom+"%");
	}
	
	@Autowired
	private AdresseRepository adresserepository;

	public Adresse ajouterAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return adresserepository.save(a);
	}

	public Adresse getAdresse(int IdAdresse) {
		// TODO Auto-generated method stub
		return adresserepository.getOne(IdAdresse);
	}

	public Optional<Adresse> affichageAdresse(int idAdresse) {
		// TODO Auto-generated method stub
		return adresserepository.findById(idAdresse);
	}

	public int modifierAdresse(String nomRue, int idAdresse) {
		// TODO Auto-generated method stub
		adresserepository.modifierAdresse(nomRue, idAdresse);
		return idAdresse;
	}

	public void supprimerAdresse(Adresse a) {
		// TODO Auto-generated method stub
		adresserepository.delete(a);
	}

	public Iterable<Adresse> FindALLAdresse() {
		// TODO Auto-generated method stub
		return adresserepository.findAll();
	}

	

	public int attribuerPersonneAdresse(Adresse adresse, int id) {
		// TODO Auto-generated method stub
		return personnerepository.attribuerPersonneAdresse(adresse, id);
	}

	

	
	

	

	

}
