package com.infotel.TpMavenSpringData.metier;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.infotel.TpMavenSpringData.metier.Personne;

@Component
@Entity
@Scope(value = "prototype")
public class Adresse {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private int IdAdresse;
	private String NumRue;
	private String NomRue;
	private String cp;
	private String ville;
	
	@OneToMany (mappedBy = "adresse")
	private List<Personne> personne;
	
	public int getIdAdresse() {
		return IdAdresse;
	}
	public void setIdAdresse(int idAdresse) {
		IdAdresse = idAdresse;
	}
	public String getNumRue() {
		return NumRue;
	}
	public void setNumRue(String numRue) {
		NumRue = numRue;
	}
	public String getNomRue() {
		return NomRue;
	}
	public void setNomRue(String nomRue) {
		NomRue = nomRue;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public List<Personne> getPersonne() {
		return personne;
	}
	public void setPersonne(List<Personne> personne) {
		this.personne = personne;
	}
	@Override
	public String toString() {
		return "Adresse [IdAdresse=" + IdAdresse + ", NumRue=" + NumRue + ", NomRue=" + NomRue + ", cp=" + cp
				+ ", ville=" + ville + ", personne=" + personne + "]";
	}
	
	
}
