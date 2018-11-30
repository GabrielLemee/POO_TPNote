package src;

import java.util.ArrayList;
import java.util.List;

public class Agence extends Emprunteur implements Comparable<Agence> {
	private List<Employe> employes;
	private String nom;
	
	public Agence(String nom)
	{
		this.nom = nom;
		employes = new ArrayList<Employe>();
	}
	
	public List<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int nombreDefectueux()
	{
		int defectueux = 0;
		for(Empruntable materiel : stock)
		{
			if(materiel.isDefectueux())
			{
				defectueux++;
			}
		}
		return defectueux;
	}

	public int compareTo(Agence o) {
		return Integer.compare(this.nombreDefectueux(), o.nombreDefectueux());
	}
}
