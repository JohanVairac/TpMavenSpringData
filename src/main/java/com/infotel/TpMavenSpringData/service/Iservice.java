package com.infotel.TpMavenSpringData.service;

import java.util.List;
import java.util.Optional;

import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;

public interface Iservice {

	public Personne ajouterPersonne (Personne p);
	public Personne getPersonne (int idPersonne);
	public Optional<Personne> affichagePersonne (int idPersonne);
	public int modifierPersonne (String nom, int idPersonne);
	public void supprimerPersonne(Personne p);
	public Iterable<Personne> FindALLPersonne();
	public List<Personne> chercherParPrenom(String prenom);
	public List<Personne> rechercherParMC (String nom);
	public  int attribuerPersonneAdresse (Adresse adresse, int id);
	
	public Adresse ajouterAdresse(Adresse a);
	public Adresse getAdresse(int idAdresse);
	public Optional <Adresse> affichageAdresse (int idAdresse);
	public int modifierAdresse (String nomRue, int idAdresse);
	public void supprimerAdresse(Adresse a);
	public Iterable<Adresse> FindALLAdresse();
	
}
