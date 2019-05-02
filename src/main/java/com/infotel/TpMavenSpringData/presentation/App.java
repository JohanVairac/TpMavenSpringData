package com.infotel.TpMavenSpringData.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;
import com.infotel.TpMavenSpringData.service.Iservice;
import com.infotel.TpMavenSpringData.service.ServiceImpl;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext .xml");
    	 Iservice service = context.getBean("service", ServiceImpl.class);
    	
    	Personne p = context.getBean("personne", Personne.class);
    	p.setNom("Couleur");
    	p.setPrenom("Mentalo");
    	p.setAge(65);
    	service.ajouterPersonne(p);
        System.out.println(p);
        
        Personne p1 = context.getBean("personne", Personne.class);
        p1.setNom("Pouloulou");
    	p1.setPrenom("Niska");
    	p1.setAge(25);
    	service.ajouterPersonne(p1);
        System.out.println(p1);
        
        Personne p2 = context.getBean("personne", Personne.class);
        p2.setNom("Maestro");
    	p2.setPrenom("Kimpembe");
    	p2.setAge(23);
    	service.ajouterPersonne(p2);
        System.out.println(p2);
        

        Personne p3 = context.getBean("personne", Personne.class);
        p3.setNom("Vairac");
    	p3.setPrenom("Johan");
    	p3.setAge(27);
    	service.ajouterPersonne(p3);
        System.out.println(p3);
        
        // Chercher par prenom
        // System.out.println(service.chercherParPrenom("Mentalo"));
        
        // Chercher par nom contenant
       // System.out.println(service.rechercherParMC("Vairac"));
        
        // Modifier Personne
        
        
    	service.modifierPersonne("Hadi",3);
    	
        // Supprimer Personne
    	
    	Personne p6 = context.getBean("personne", Personne.class);
    	p6.setIdPersonne(2);
    	System.out.println(p6);
    	service.supprimerPersonne(p6);
    	
        //Lister
        service.FindALLPersonne();
        
        //Ajouter adresse
        
        Adresse a = context.getBean("adresse", Adresse.class);
    	a.setNumRue("3");
    	a.setNomRue("Route de terrasson");
    	a.setCp("97139");
    	a.setVille("Les Abymes");
    	service.ajouterAdresse(a);
        System.out.println(a);
         
        Adresse a1 = context.getBean("adresse", Adresse.class);
    	a1.setNumRue("10");
    	a1.setNomRue("Rue Jean Ignace");
    	a1.setCp("97139");
    	a1.setVille("Les Abymes");
    	service.ajouterAdresse(a1);
        System.out.println(a1);
        
        Adresse a2 = context.getBean("adresse", Adresse.class);
    	a2.setNumRue("6");
    	a2.setNomRue("Route de terrasson");
    	a2.setCp("97139");
    	a2.setVille("Les Abymes");
    	service.ajouterAdresse(a2);
        System.out.println(a2);
        
        //Modifier Adresse
        
        service.modifierAdresse ("5",7);
        
        //Supprimer Adresse
        
        Adresse a9 = context.getBean("adresse", Adresse.class);
    	a9.setIdAdresse(3);
    	System.out.println(a9);
    	service.supprimerAdresse(a9);
    	
    	
    	//Ajouter une adresse à une personne 
    	
    	
    	service.attribuerPersonneAdresse(service.getAdresse(5), 4);
        context.close();
    }
    
   
}
