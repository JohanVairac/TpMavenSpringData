package com.infotel.TpMavenSpringData.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.TpMavenSpringData.metier.Adresse;

@Transactional
public interface AdresseRepository extends JpaRepository <Adresse, Integer>{
	
	@Modifying
	@Query("update Adresse SET nomRue = :x where id = :y")
	public int modifierAdresse(@Param("x") String nomRue, @Param("y") int id);

}
