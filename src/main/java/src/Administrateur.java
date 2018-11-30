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
		if(emprunteur.perdreMateriel(materiel))
		{
			return stock.add(materiel);
		}
		return false;
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
		if(!materiel.isLimitationPretAuxAgences())
		{
			if(actuelEmprunteur.perdreMateriel(materiel))
			{
				nvEmprunteur.stock.add(materiel);
			}
		}
	}
	
	public void supprimerMateriel(Empruntable materiel)
	{
		entreprise.stock.remove(materiel);
		for(Agence agence : entreprise.getAgences())
		{
			agence.stock.remove(materiel);
			for(Employe employe : agence.getEmployes())
			{
				employe.stock.remove(materiel);
			}
		}
	}
	
	public void supprimerMaterielDefectueuxEntreprise()
	{
		supprimerMaterielDefectueuxDe(entreprise);
		for(Agence agence : entreprise.getAgences())
		{
			supprimerMaterielDefectueuxDe(agence);
		}
	}
	
	public void supprimerMaterielDefectueuxAgence()
	{
		supprimerMaterielDefectueuxDe(agence);
		for(Employe employe : agence.getEmployes())
		{
			supprimerMaterielDefectueuxDe(employe);
		}
	}
	
	private void supprimerMaterielDefectueuxDe(Emprunteur emprunteur)
	{
		List<Empruntable> defectueux = new ArrayList<Empruntable>();
		for(Empruntable materiel : emprunteur.listeMateriel())
		{
			if(materiel.isDefectueux())
			{
				defectueux.add(materiel);
			}
		}
		emprunteur.listeMateriel().removeAll(defectueux);
	}
}
