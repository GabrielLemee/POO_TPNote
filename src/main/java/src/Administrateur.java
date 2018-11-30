package src;

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
		
		return entreprise.listeMateriel();
	}
	
	public List<Empruntable> stockAgence()
	{
		List<Empruntable> stockAgence = new List<Empruntable>();
		return agence.listeMateriel();
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
	
	public void supprimerMaterielDefectueuxAgence(Agence agence)
	{
		
	}
	
	private void supprimerMaterielDefectueuxDe(Emprunteur emprunteur)
	{
		
	}
}
