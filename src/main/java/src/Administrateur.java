package src;

import java.util.ArrayList;
import java.util.List;

public class Administrateur extends Employe{
	
	public Administrateur(Agence agence, Entreprise entreprise)
	{
		super(agence, entreprise);
	}
	
	public boolean attribuerMateriel(Empruntable materiel, Emprunteur emprunteur)
	{
		entreprise.perdreMateriel(materiel);
		emprunteur.ajouterAuStock(materiel);
		return true;
	}
	
	public boolean recupererMateriel(Empruntable materiel, Emprunteur emprunteur)
	{
		//TODO
		return true;
	}
	
	
	public List<Empruntable> stockEmploye(Employe employe)
	{
		return employe.listeMateriel();
	}
	
	public List<Empruntable> stockEntreprise()
	{
		List<Empruntable> stockEntreprise = new ArrayList<Empruntable>();
		stockEntreprise.addAll(entreprise.listeMateriel());
		
		for(Agence agence : entreprise.getAgences())
		{
			stockEntreprise.addAll(stockAgence(agence));
		}
		
		return stockEntreprise;
	}
	
	public List<Empruntable> stockAgence(Agence agence)
	{
		List<Empruntable> stockAgence = new ArrayList<Empruntable>();
		stockAgence.addAll(agence.listeMateriel());
		
		for(Employe employe : agence.getEmployes())
		{
			stockAgence.addAll( employe.listeMateriel());
		}
		return stockAgence;
	}
	
	public void transfererMateriel(Emprunteur actuelEmprunteur, Empruntable materiel, Emprunteur nvEmprunteur)
	{
		
	}
	
	public void supprimerMateriel(Empruntable materiel)
	{
		
	}
	
	public void supprimerMaterielDefectueuxEntreprise()
	{
		
	}
	
	public void supprimerMaterielDefectueuxAgence()
	{
		
	}
	
	private void supprimerMaterielDefectueuxDe(Emprunteur emprunteur)
	{
		
	}
}
