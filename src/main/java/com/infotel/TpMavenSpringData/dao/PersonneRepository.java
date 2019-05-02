package com.infotel.TpMavenSpringData.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;

@Transactional
public interface PersonneRepository extends JpaRepository <Personne, Integer> {

		@Modifying
		@Query("update Personne SET nom = :x where id = :y")
		public int modifierPersonne(@Param("x") String nom, @Param("y") int id);
	
		public List<Personne> findByPrenom(String prenom);
		@Query("select p from Personne p where p.nom like :x")
		public List<Personne> rechercherParMC(@Param("x")String nom);
		
		@Modifying
		@Query("update Personne SET adresse = :x where id = :z")
		public int attribuerPersonneAdresse (@Param("x") Adresse adresse, @Param("z") int id);
	
}
